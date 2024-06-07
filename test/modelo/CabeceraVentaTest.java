/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

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
public class CabeceraVentaTest {
    
    public CabeceraVentaTest() {
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
     * Test of getIdPedido method, of class CabeceraVenta.
     */
    @Test
    public void testGetIdPedido() {
        System.out.println("getIdPedido");
        CabeceraVenta instance = new CabeceraVenta();
        int expResult = 0;
        int result = instance.getIdPedido();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdPedido method, of class CabeceraVenta.
     */
    @Test
    public void testSetIdPedido() {
        System.out.println("setIdPedido");
        int idPedido = 0;
        CabeceraVenta instance = new CabeceraVenta();
        instance.setIdPedido(idPedido);
    }

    /**
     * Test of getIdCliente method, of class CabeceraVenta.
     */
    @Test
    public void testGetIdCliente() {
        System.out.println("getIdCliente");
        CabeceraVenta instance = new CabeceraVenta();
        int expResult = 0;
        int result = instance.getIdCliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdCliente method, of class CabeceraVenta.
     */
    @Test
    public void testSetIdCliente() {
        System.out.println("setIdCliente");
        int idCliente = 0;
        CabeceraVenta instance = new CabeceraVenta();
        instance.setIdCliente(idCliente);
    }

    /**
     * Test of getFecha method, of class CabeceraVenta.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        CabeceraVenta instance = new CabeceraVenta();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class CabeceraVenta.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        CabeceraVenta instance = new CabeceraVenta();
        instance.setFecha(fecha);
    }

    /**
     * Test of getPrecioTotal method, of class CabeceraVenta.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        CabeceraVenta instance = new CabeceraVenta();
        double expResult = 0.0;
        double result = instance.getPrecioTotal();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setPrecioTotal method, of class CabeceraVenta.
     */
    @Test
    public void testSetPrecioTotal() {
        System.out.println("setPrecioTotal");
        double precioTotal = 0.0;
        CabeceraVenta instance = new CabeceraVenta();
        instance.setPrecioTotal(precioTotal);
    }
    
}
