package lab1;

public class NumExtenso {
	
	private String[] casaDosNaturais;
    private String[] casaDasDezenas;
    private String[] casaDasDezenasNaturais;
    private String[] casaDasCentenas;

    private static int ZERO = 0;
    private static int DEZ = 10;
    private static int CEM = 100;
    private static int MIL = 1000;
    private static int UmMilhao = 1000000;
    private static int UmBilhao = 1000000000;

    
      public NumExtenso() {
    	  casaDosNaturais = new String[] { "zero", "um", "dois", "tres", "quatro",
                    "cinco", "seis", "sete", "oito", "nove" };
    	  casaDasDezenas = new String[] { "zero", "dez", "vinte", "trinta", "quarenta",
                    "cinquenta", "sessenta", "setenta", "oitenta", "noventa" };
    	  casaDasDezenasNaturais = new String[] { "dez", "onze", "doze", "treze",
                    "catorze", "quinze", "dezesseis", "dezessete", "dezoito",
                    "dezenove" };
    	  casaDasCentenas = new String[] { "zero", "cento", "duzentos", "trezentos",
                    "quatrocentos", "quinhentos", "seiscentos", "setecentos",
                    "oitocentos", "novecentos" };
    }

  
    public String numString(int num) throws Exception{
    	  if (num < ZERO || num > UmBilhao){
              throw new Exception("Invalido!");
          }  return pegaBilhao(num);
    }

     private String pegaBilhao(int num){
          String aux = "";
          if (num == UmBilhao){
              aux = "Um Bilhao";
          }if (num < MIL){
              aux = centenas(num);
          }else {
              aux = pegaMilhao(num);
          }  return aux;
    }

    private String pegaMilhao(int num){
         String aux = "";
         if (num >= UmMilhao){
        	 aux = centenas(num / UmMilhao);
            if (aux.equals("um")){ 
            	aux += " milhao";
            } else {
            	aux += " milhoes";
            }
         }aux += juncao(num, aux);
         num = num % UmMilhao; 
         if (num != ZERO){
            aux += pegaMil(num);
         }return aux;
    }

    private String pegaMil(int num){
         String aux = "";
         if (num >= MIL){
            aux = centenas(num / MIL);
            if (aux.equals("um")){
                aux = "mil";
            } else{
                aux += " mil";
            }
         }aux += juncao(num, aux);
         num = num % MIL; 
         if (num != ZERO){
            aux += centenas(num);
         }return aux;
    }
  
    private String centenas(int numero){
         String aux = "";
         if (numero < MIL){
             if (numero == CEM){
                 aux = "cem";
             }if (numero % CEM == ZERO){
                  aux = casaDasCentenas[numero / CEM];
             }if (numero > CEM){
                  aux = casaDasCentenas[numero / CEM] + " e " + dezenas(numero % CEM);
             } else{
                    aux = dezenas(numero);
             }
        }
            return aux;
    }

    private String dezenas(int num){
          String aux = "";
          if (num % DEZ == ZERO){
              aux = casaDasDezenas[num / DEZ];
            }if (num > DEZ && num < 20) {
              aux = casaDasDezenasNaturais[(num % DEZ)];
            }if (num > 20) {
              aux = casaDasDezenas[num / DEZ] + " e " + naturais(num % DEZ);
            } else{
              aux = naturais(num);
         }return aux;
    }

    private String naturais(int num){
         return casaDosNaturais[num];
    }

     private String juncao(int num, String aux){
          String join = "";
          if (!aux.equals("")){ 
              if (num >= UmMilhao){
                  num = num % UmMilhao;
                  if (num != ZERO){
                      if (num % MIL == ZERO){
                          join += " e ";
                      }else{
                          join += ", ";
                      }
                  }
              }else{
                 if (num % MIL != ZERO){
                     join += " e ";
                 }
              }
           } return join;
    }

}
