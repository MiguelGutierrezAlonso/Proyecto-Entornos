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
public class ProductoTest {
    
    public ProductoTest() {
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
     * Test of getID_Producto method, of class Producto.
     */
    @Test
    public void testGetID_Producto() {
        System.out.println("getID_Producto");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getID_Producto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setID_Producto method, of class Producto.
     */
    @Test
    public void testSetID_Producto() {
        System.out.println("setID_Producto");
        int ID_Producto = 0;
        Producto instance = new Producto();
        instance.setID_Producto(ID_Producto);
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        Producto instance = new Producto();
        instance.setNombre(Nombre);
    }

    /**
     * Test of getCantidad method, of class Producto.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCantidad method, of class Producto.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int Cantidad = 0;
        Producto instance = new Producto();
        instance.setCantidad(Cantidad);
    }

    /**
     * Test of getPrecio_Compra method, of class Producto.
     */
    @Test
    public void testGetPrecio_Compra() {
        System.out.println("getPrecio_Compra");
        Producto instance = new Producto();
        double expResult = 0.0;
        double result = instance.getPrecio_Compra();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setPrecio_Compra method, of class Producto.
     */
    @Test
    public void testSetPrecio_Compra() {
        System.out.println("setPrecio_Compra");
        double Precio_Compra = 0.0;
        Producto instance = new Producto();
        instance.setPrecio_Compra(Precio_Compra);
    }

    /**
     * Test of getPrecio_Venta method, of class Producto.
     */
    @Test
    public void testGetPrecio_Venta() {
        System.out.println("getPrecio_Venta");
        Producto instance = new Producto();
        double expResult = 0.0;
        double result = instance.getPrecio_Venta();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setPrecio_Venta method, of class Producto.
     */
    @Test
    public void testSetPrecio_Venta() {
        System.out.println("setPrecio_Venta");
        double Precio_Venta = 0.0;
        Producto instance = new Producto();
        instance.setPrecio_Venta(Precio_Venta);
    }

    /**
     * Test of getCategoria method, of class Producto.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategoria method, of class Producto.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        String Categoria = "";
        Producto instance = new Producto();
        instance.setCategoria(Categoria);
    }

    /**
     * Test of getID_Proveedor method, of class Producto.
     */
    @Test
    public void testGetID_Proveedor() {
        System.out.println("getID_Proveedor");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getID_Proveedor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setID_Proveedor method, of class Producto.
     */
    @Test
    public void testSetID_Proveedor() {
        System.out.println("setID_Proveedor");
        int ID_Proveedor = 0;
        Producto instance = new Producto();
        instance.setID_Proveedor(ID_Proveedor);
    }
    
}
