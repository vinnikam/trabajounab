/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.Assert;
import org.junit.Test;
import solucion.OperacionesM;

/**
 *
 * @author Vinni
 */
public class OperacionesTest {
    
    @Test
    public void pruebaSumar(){
        OperacionesM oper = new OperacionesM();
        int val1 = 3;
        int val2 = 5;
        Double rta = oper.sumar(val1, val2);
        Double valor = 8D;
        Assert.assertEquals(valor, rta);
    }
    @Test
    public void pruebaConvertir(){
        OperacionesM oper = new OperacionesM();
        Double rta = oper.convertirNumero("");
        Assert.assertTrue(rta== null);
    }
    @Test
    public void pruebaConvertirNeg(){
        OperacionesM oper = new OperacionesM();
        Double rta = oper.convertirNumero("-87,9");
        Assert.assertTrue(rta== null);
    }
    @Test
    public void pruebaConvertirLetras(){
        OperacionesM oper = new OperacionesM();
        Double rta = oper.convertirNumero("-235vwsdfdvgdf");
        Assert.assertTrue(rta== null);
    }
    @Test
    public void pruebaConvertirOK(){
        OperacionesM oper = new OperacionesM();
        Double rta = oper.convertirNumero("-87.9");
        Assert.assertTrue(rta!= null);
    }
    
}
