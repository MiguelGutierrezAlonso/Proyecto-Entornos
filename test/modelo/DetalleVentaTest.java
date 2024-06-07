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
public class DetalleVentaTest {
    
    /**
     *
     */
    public DetalleVentaTest() {
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
     * Test of getIdDetalle method, of class DetalleVenta.
     */
    @Test
    public void testGetIdDetalle() {
        System.out.println("getIdDetalle");
        DetalleVenta instance = new DetalleVenta();
        int expResult = 0;
        int result = instance.getIdDetalle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdDetalle method, of class DetalleVenta.
     */
    @Test
    public void testSetIdDetalle() {
        System.out.println("setIdDetalle");
        int idDetalle = 0;
        DetalleVenta instance = new DetalleVenta();
        instance.setIdDetalle(idDetalle);
    }

    /**
     * Test of getIdPedido method, of class DetalleVenta.
     */
    @Test
    public void testGetIdPedido() {
        System.out.println("getIdPedido");
        DetalleVenta instance = new DetalleVenta();
        int expResult = 0;
        int result = instance.getIdPedido();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdPedido method, of class DetalleVenta.
     */
    @Test
    public void testSetIdPedido() {
        System.out.println("setIdPedido");
        int idPedido = 0;
        DetalleVenta instance = new DetalleVenta();
        instance.setIdPedido(idPedido);
    }

    /**
     * Test of getIdProducto method, of class DetalleVenta.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        DetalleVenta instance = new DetalleVenta();
        int expResult = 0;
        int result = instance.getIdProducto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdProducto method, of class DetalleVenta.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        int idProducto = 0;
        DetalleVenta instance = new DetalleVenta();
        instance.setIdProducto(idProducto);
    }

    /**
     * Test of getNombre method, of class DetalleVenta.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        DetalleVenta instance = new DetalleVenta();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class DetalleVenta.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        DetalleVenta instance = new DetalleVenta();
        instance.setNombre(nombre);
    }

    /**
     * Test of getCantidad method, of class DetalleVenta.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        DetalleVenta instance = new DetalleVenta();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCantidad method, of class DetalleVenta.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        DetalleVenta instance = new DetalleVenta();
        instance.setCantidad(cantidad);
    }

    /**
     * Test of getPrecioUnitario method, of class DetalleVenta.
     */
    @Test
    public void testGetPrecioUnitario() {
        System.out.println("getPrecioUnitario");
        DetalleVenta instance = new DetalleVenta();
        double expResult = 0.0;
        double result = instance.getPrecioUnitario();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setPrecioUnitario method, of class DetalleVenta.
     */
    @Test
    public void testSetPrecioUnitario() {
        System.out.println("setPrecioUnitario");
        double precioUnitario = 0.0;
        DetalleVenta instance = new DetalleVenta();
        instance.setPrecioUnitario(precioUnitario);
    }

    /**
     * Test of getPrecioTotal method, of class DetalleVenta.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        DetalleVenta instance = new DetalleVenta();
        double expResult = 0.0;
        double result = instance.getPrecioTotal();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setPrecioTotal method, of class DetalleVenta.
     */
    @Test
    public void testSetPrecioTotal() {
        System.out.println("setPrecioTotal");
        double precioTotal = 0.0;
        DetalleVenta instance = new DetalleVenta();
        instance.setPrecioTotal(precioTotal);
    }
    
}
