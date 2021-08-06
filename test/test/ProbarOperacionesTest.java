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
public class ProbarOperacionesTest{
    

    @Test
    public void testPruebaSuma(){
        OperacionesM oper = new OperacionesM();
        double oper1 = oper.sumar(2,2);
        Assert.assertTrue(oper1 >0);
    }
    
}
