/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controlador;

import modelo.Producto;
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
public class Ctrl_ProductoTest {
    
    /**
     *
     */
    public Ctrl_ProductoTest() {
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
     * Test of guardar method, of class Ctrl_Producto.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        Producto objeto = new Producto();
        Ctrl_Producto instance = new Ctrl_Producto();
        boolean expResult = true;
        boolean result = instance.guardar(objeto);
        assertEquals(expResult, result);
    }

    /**
     * Test of existeProducto method, of class Ctrl_Producto.
     */
    @Test
    public void testExisteProducto() {
        System.out.println("existeProducto");
        String producto = "";
        Ctrl_Producto instance = new Ctrl_Producto();
        boolean expResult = true;
        boolean result = instance.existeProducto(producto);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class Ctrl_Producto.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Producto objeto = new Producto();
        int idproducto = 0;
        Ctrl_Producto instance = new Ctrl_Producto();
        boolean expResult = false;
        boolean result = instance.actualizar(objeto, idproducto);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminar method, of class Ctrl_Producto.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int idproducto = 0;
        Ctrl_Producto instance = new Ctrl_Producto();
        boolean expResult = false;
        boolean result = instance.eliminar(idproducto);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizarStock method, of class Ctrl_Producto.
     */
    @Test
    public void testActualizarStock() {
        System.out.println("actualizarStock");
        Producto object = new Producto();
        int idProducto = 0;
        Ctrl_Producto instance = new Ctrl_Producto();
        boolean expResult = false;
        boolean result = instance.actualizarStock(object, idProducto);
        assertEquals(expResult, result);
    }
    
}
