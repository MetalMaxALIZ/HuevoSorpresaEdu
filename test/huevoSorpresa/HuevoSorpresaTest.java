/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huevoSorpresa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertTrue;

/**
 *
 * @author Sonia
 */
public class HuevoSorpresaTest {
    
    public HuevoSorpresaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of obtenerUnidades method, of class Bola.
     */
//    @Test
//    public void testObtenerUnidades() {
//        System.out.println("obtenerUnidades");
//        HuevoSorpresa instance = new HuevoSorpresa();
//        int expResult = 0;
//        int result = instance.obtenerUnidades();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of modificarUnidades method, of class Bola.
     */
//    @Test
//    public void testModificarUnidades() {
//        System.out.println("modificarUnidades");
//        int unidades = 0;
//        HuevoSorpresa instance = new HuevoSorpresa();
//        instance.modificarUnidades(unidades);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test para el método sacarHuevosSorpresas con valor válido. Si el método es correcto la prueba debe ser exitosa
     * @throws java.lang.Exception
     */
    @Test
    public void testSacarHuevoSorpresaValido() throws Exception {
        System.out.println("Test sacarHuevoSorpresa con éxito.");
        int unidades = 10;
        double dinero = 15;
        HuevoSorpresaEduardo instance = new HuevoSorpresaEduardo(200,1,"Peppa Pig",2);
        instance.sacarHuevosSorpresas(unidades,dinero);
        assertTrue(instance.obtenerUnidades()==190); /* Como inicialmente hay 200 huevos sorpresa en la tienda
        y saco 10, deben quedar 190 huevos sorpresas en la máquina si todo ha ido bien. */
    }
    
    /**
     * Test para el método sacarHuevosSorpresas con valor no válido de unidades negativas. Si el método es correcto la prueba debe ser exitosa
     * @throws java.lang.Exception
     */
    @Test
    public void testSacarHuevoSorpresaNegativo() throws Exception {
        System.out.println("Test sacarHuevosSorpresa con valor negativo.");
        int unidades = -1;
        double dinero = 15;
        HuevoSorpresaEduardo instance = new HuevoSorpresaEduardo(200,1,"Peppa Pig",2);
        try{
            instance.sacarHuevosSorpresas(unidades,dinero);
            fail("La prueba falla si no salta una excepción con un valor negativo");
         } catch (Exception e){
                 assertTrue(instance.obtenerUnidades()==200); /* Como parto de una cantidad de 200 huevos sorpresa
                                                                el total no debe haberse modificado,
                                                                 de no ser así la prueba debe fallar*/ 
        }
    }
    
    /**
     * Test para el método sacarHuevosSorpresas con valor no válido de 0 unidades. Si el método es correcto la prueba debe ser exitosa
     * @throws java.lang.Exception
     */
    @Test
    public void testSacarHuevoSorpresa0() throws Exception {
        System.out.println("Test sacarBola con 0 unidades.");
        int unidades = 0;
        double dinero = 15;
        HuevoSorpresaEduardo instance = new HuevoSorpresaEduardo(200,1,"Peppa Pig",2);
        try{
            instance.sacarHuevosSorpresas(unidades,dinero);
            fail("La prueba falla si no salta una excepción al intentar sacar 0 huevos sorpresas");
         } catch (Exception e){
                 assertTrue(instance.obtenerUnidades()==200); /* Como parto de una cantidad de 200 huevos sorpresas
                                                                el total no debe haberse modificado,
                                                                 de no ser así la prueba debe fallar*/ 
        }
    }
    
     /**
     * Test para el método sacarHuevosSorpresas con valor no válido (más unidades que las disponibles). Si el método es correcto la prueba debe ser exitosa
     * @throws java.lang.Exception
     */
    @Test
    public void testSacarBolaExcesoUnidades() throws Exception {
        System.out.println("Test sacarBola con más huevos sorpresas de las disponibles.");
        int unidades = 250;
        double dinero = 300;
        HuevoSorpresaEduardo instance = new HuevoSorpresaEduardo(200,1,"Peppa Pig",2);
        try{
            instance.sacarHuevosSorpresas(unidades,dinero);
            fail("La prueba falla si no salta una excepción al intentar sacar más huevos sorpresas de las que tiene la tienda");
         } catch (Exception e){
                 assertTrue(instance.obtenerUnidades()==200); /* Como parto de una cantidad de 200 huevos sorpresas
                                                                el total no debe haberse modificado,
                                                                 de no ser así la prueba debe fallar*/ 
        }
    }
    
     /**
     * Test para el método sacarHuevosSorpresas con valor no válido (dinero insuficiente). Si el método es correcto la prueba debe ser exitosa
     * @throws java.lang.Exception
     */
    @Test
    public void testSacarHuevosSorpresaDineroInsuficiente() throws Exception {
        System.out.println("Test sacarHuevosSorpresa con dinero insuficiente.");
        int unidades = 2;
        double dinero = 1;
        HuevoSorpresaEduardo instance = new HuevoSorpresaEduardo(200,1,"Peppa Pig",2);
        try{
            instance.sacarHuevosSorpresas(unidades,dinero);
            fail("La prueba falla si no salta una excepción al intentar sacar más huevos sorpresas de las que tiene la máquina");
         } catch (Exception e){
                 assertTrue(instance.obtenerUnidades()==200); /* Como parto de una cantidad de 200 huevos sorpresas
                                                                el total no debe haberse modificado,
                                                                 de no ser así la prueba debe fallar*/ 
        }
    }
    

     /**
     * Test para el método aumentarDinero con valor válido. Si el método es correcto la prueba debe ser exitosa
     * @throws java.lang.Exception
     */
    @Test
    public void testAumentarPrecioValido() throws Exception {
        System.out.println("aumentarPrecio");
        double aumento = 0.5;
        HuevoSorpresaEduardo instance = new HuevoSorpresaEduardo(200,1,"Peppa Pig",2);
        instance.aumentarPrecio(aumento);
        assertTrue(instance.obtenerPrecio()==1.5); /* Como el precio inicial del huevo sorpresa es 1, al aumentarle
        0.5 no se superaría el máximo permitido que es 2, por lo tanto se quedaría en un precio de 1.5 */  
    }
    
}
