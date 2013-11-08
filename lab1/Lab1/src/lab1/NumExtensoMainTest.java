package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumExtensoMainTest {

	NumExtenso ext;

     @Before
     public void setUp() throws Exception {
             ext = new NumExtenso();
     }

     @Test
     public void testNumeros() throws Exception {
            // assertEquals(ext.numString(0), "zero");
             assertEquals(ext.numString(7), "sete");
            // assertEquals(ext.numString(10), "dez");
            // assertEquals(ext.numString(90), "noventa");
             assertEquals(ext.numString(11), "onze");
             assertEquals(ext.numString(15), "quinze");
            // assertEquals(ext.numString(800), "oitocentos");
             assertEquals(ext.numString(1000), "mil");
     }

     @Test
     public void testNumMaisdeUmaPalavra() throws Exception {
             assertEquals(ext.numString(78), "setenta e oito");
             assertEquals(ext.numString(35), "trinta e cinco");
             assertEquals(ext.numString(92), "noventa e dois");
            // assertEquals(ext.numString(250), "duzentos e cinquenta");
             assertEquals(ext.numString(999), "novecentos e noventa e nove");
            // assertEquals(ext.numString(1376), "mil trezentos e setenta e seis");
             //assertEquals(ext.numString(2944), "dois mil novecentos e quarenta e quatro");
             //assertEquals(ext.numString(200000), "duzentos mil");
           //  assertEquals(ext.numString(1000000000), "Um Bilhao");

     }
     
 }
