package lab1;
import java.util.Scanner;

public class NumExtensoMain {
    private static String ERRO = "Por Favor digite um numero valido!!";
	       
        public static void main(String[] args) throws Exception{
               Scanner sc = new Scanner(System.in);
               NumExtenso num = new NumExtenso();
               String valor = "";
               int numero = -1;
               System.out.println("Ao encerrar digite sair!\n");
	                while (!valor.equals("sair")){
	                        while (valor.equals("")) {
	                                System.out.print("Numero: ");
	                                valor = sc.nextLine();
	                                if (valor.equals("sair")){
	                                        break;
	                                }if (valor.equals("")){
	                                        continue;

	                                }try{numero = Integer.valueOf(valor);
	                                } catch (Exception e) {
	                                        System.out.println(ERRO + "\n");
	                                        valor = "";
	                                } 
	                        }
	                        if (valor.equals("sair")){
	                                break;

	                        }try {
	                           System.out.println(num.numString(numero));
	                        } catch (Exception e){
	                                System.out.println(ERRO);
	                        }finally {
	                                System.out.println();
	                                valor = "";
	                        }
	                }
	        }

}
