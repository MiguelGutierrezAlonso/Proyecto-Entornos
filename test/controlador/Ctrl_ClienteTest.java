/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controlador;

import modelo.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class Ctrl_ClienteTest {
    
    /**
     *
     */
    public Ctrl_ClienteTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of guardar method, of class Ctrl_Cliente.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        Cliente objeto = new Cliente();
        Ctrl_Cliente instance = new Ctrl_Cliente();
        boolean expResult = false;
        boolean result = instance.guardar(objeto);
        assertEquals(expResult, result);
    }

    /**
     * Test of existeCliente method, of class Ctrl_Cliente.
     */
    @Test
    public void testExisteCliente() {
        System.out.println("existeCliente");
        String cliente = "";
        Ctrl_Cliente instance = new Ctrl_Cliente();
        boolean expResult = true;
        boolean result = instance.existeCliente(cliente);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class Ctrl_Cliente.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Cliente objeto = new Cliente();
        int idcliente = 0;
        Ctrl_Cliente instance = new Ctrl_Cliente();
        boolean expResult = false;
        boolean result = instance.actualizar(objeto, idcliente);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminar method, of class Ctrl_Cliente.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int idcliente = 0;
        Ctrl_Cliente instance = new Ctrl_Cliente();
        boolean expResult = false;
        boolean result = instance.eliminar(idcliente);
        assertEquals(expResult, result);
    }
    
}
