/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTIMADO USUARIO
 */
public class Listado {

    public void listaClientes() {
        Document documento = new Document(PageSize.A4.rotate()); // Cambiar a orientación horizontal
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/Client_List.pdf"));
            documento.open();

            // Ruta válida a una imagen
            Image header = Image.getInstance("src/img/Banner.jpeg");
            header.scaleToFit(850, 1000); // Hacer el encabezado más ancho
            header.setAlignment(Chunk.ALIGN_CENTER);
            documento.add(header);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Element.ALIGN_CENTER);
            parrafo.add(new Chunk("Gutierrez Meats Clients List\n\n", FontFactory.getFont("Tahoma", 24, Font.BOLD, BaseColor.DARK_GRAY))); // Fuente más grande
            parrafo.add(new Chunk("Quality and Freshness Guaranteed\n\n", FontFactory.getFont("Tahoma", 16, Font.ITALIC, BaseColor.GRAY))); // Fuente más grande
            parrafo.setSpacingBefore(10);
            parrafo.setSpacingAfter(20);
            documento.add(parrafo);

            float[] columnsWidths = {2, 3, 4, 3, 6}; // Anchos de columna ajustados
            PdfPTable tabla = new PdfPTable(columnsWidths.length);
            tabla.setWidths(columnsWidths);
            tabla.setWidthPercentage(100); // Tabla ocupa el 100% del ancho de la página

            Font tableFont = FontFactory.getFont("Tahoma", 12, BaseColor.BLACK); // Fuente de tabla más grande

            PdfPCell cell;

            String[] headers = {"ID", "ID Nº", "Name", "Tlf", "Address"};
            for (String headerText : headers) {
                cell = new PdfPCell(new Phrase(headerText, tableFont));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabla.addCell(cell);
            }

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT id_cliente, NIdentidad, CONCAT(nombre, ' ', apellido) AS full_name, telefono, direccion FROM clientes");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    tabla.addCell(new Phrase(rs.getString("id_cliente"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("NIdentidad"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("full_name"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("telefono"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("direccion"), tableFont));
                }
                documento.add(tabla);
            } catch (SQLException e) {
                System.out.println("Error en: " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "List created!");

        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Error 2 en: " + e);
        } catch (IOException e) {
            System.out.println("Error 3 en: " + e);
        }
    }

    public void listaProductos() {
        Document documento = new Document(PageSize.A4.rotate()); // Cambiar a orientación horizontal
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/Product_List.pdf"));
            documento.open();

            Image header = Image.getInstance("src/img/Banner.jpeg");
            header.scaleToFit(850, 1000); // Hacer el encabezado más ancho
            header.setAlignment(Chunk.ALIGN_CENTER);
            documento.add(header);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Element.ALIGN_CENTER);
            parrafo.add(new Chunk("Gutierrez Meats Product List\n\n", FontFactory.getFont("Tahoma", 24, Font.BOLD, BaseColor.DARK_GRAY))); // Fuente más grande
            parrafo.add(new Chunk("Quality and Freshness Guaranteed\n\n", FontFactory.getFont("Tahoma", 16, Font.ITALIC, BaseColor.GRAY))); // Fuente más grande
            parrafo.setSpacingBefore(10);
            parrafo.setSpacingAfter(20);
            documento.add(parrafo);

            float[] columnsWidths = {2, 3, 2, 2, 2, 3, 3}; // Anchos de columna ajustados
            PdfPTable tabla = new PdfPTable(columnsWidths.length);
            tabla.setWidths(columnsWidths);
            tabla.setWidthPercentage(100); // Tabla ocupa el 100% del ancho de la página

            Font tableFont = FontFactory.getFont("Tahoma", 12, BaseColor.BLACK); // Fuente de tabla más grande

            PdfPCell cell;

            String[] headers = {"ID", "Product", "Quantity", "Buy Price", "Sell Price", "Category", "Supplier"};
            for (String headerText : headers) {
                cell = new PdfPCell(new Phrase(headerText, tableFont));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabla.addCell(cell);
            }

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT p.ID_Producto, p.Nombre, p.Cantidad, p.Precio_Compra, p.Precio_Venta, p.Categoria, pr.Empresa AS Proveedor FROM carniceria.Productos p JOIN carniceria.Proveedores pr ON p.ID_Proveedor = pr.ID_Proveedor;");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    tabla.addCell(new Phrase(rs.getString("ID_Producto"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Nombre"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Cantidad"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Precio_Compra"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Precio_Venta"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Categoria"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Proveedor"), tableFont));
                }
                documento.add(tabla);
            } catch (SQLException e) {
                System.out.println("Error en: " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "List created!");

        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Error 2 en: " + e);
        } catch (IOException e) {
            System.out.println("Error 3 en: " + e);
        }
    }

    public void listaVentas() {
        Document documento = new Document(PageSize.A4.rotate()); // Cambiar a orientación horizontal
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/Orders_List.pdf"));
            documento.open();

            Image header = Image.getInstance("src/img/Banner.jpeg");
            header.scaleToFit(850, 1000); // Hacer el encabezado más ancho
            header.setAlignment(Chunk.ALIGN_CENTER);
            documento.add(header);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Element.ALIGN_CENTER);
            parrafo.add(new Chunk("Gutierrez Meats Orders List\n\n", FontFactory.getFont("Tahoma", 24, Font.BOLD, BaseColor.DARK_GRAY))); // Fuente más grande
            parrafo.add(new Chunk("Quality and Freshness Guaranteed\n\n", FontFactory.getFont("Tahoma", 16, Font.ITALIC, BaseColor.GRAY))); // Fuente más grande
            parrafo.setSpacingBefore(10);
            parrafo.setSpacingAfter(20);
            documento.add(parrafo);

            float[] columnsWidths = {2, 5, 2, 2}; // Anchos de columna ajustados
            PdfPTable tabla = new PdfPTable(columnsWidths.length);
            tabla.setWidths(columnsWidths);
            tabla.setWidthPercentage(100); // Tabla ocupa el 100% del ancho de la página

            Font tableFont = FontFactory.getFont("Tahoma", 12, BaseColor.BLACK); // Fuente de tabla más grande

            PdfPCell cell;

            String[] headers = {"ID", "Client", "Date", "Total Price"};
            for (String headerText : headers) {
                cell = new PdfPCell(new Phrase(headerText, tableFont));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabla.addCell(cell);
            }

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT v.ID_Pedido, CONCAT(c.Nombre, ' ', c.Apellido) AS Nombre_Completo, v.Fecha, v.PrecioTotal FROM ventas v INNER JOIN Clientes c ON v.ID_Cliente = c.ID_Cliente;");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    tabla.addCell(new Phrase(rs.getString("ID_Pedido"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Nombre_Completo"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Fecha"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("PrecioTotal"), tableFont));
                }
                documento.add(tabla);
            } catch (SQLException e) {
                System.out.println("Error en: " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "List created!");

        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Error 2 en: " + e);
        } catch (IOException e) {
            System.out.println("Error 3 en: " + e);
        }
    }

    public void listaProveedores() {
        Document documento = new Document(PageSize.A4.rotate()); // Cambiar a orientación horizontal
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/Supplier_List.pdf"));
            documento.open();

            // Ruta válida a una imagen
            Image header = Image.getInstance("src/img/Banner.jpeg");
            header.scaleToFit(850, 1000); // Hacer el encabezado más ancho
            header.setAlignment(Chunk.ALIGN_CENTER);
            documento.add(header);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Element.ALIGN_CENTER);
            parrafo.add(new Chunk("Gutierrez Meats Supplier List\n\n", FontFactory.getFont("Tahoma", 24, Font.BOLD, BaseColor.DARK_GRAY))); // Fuente más grande
            parrafo.add(new Chunk("Quality and Freshness Guaranteed\n\n", FontFactory.getFont("Tahoma", 16, Font.ITALIC, BaseColor.GRAY))); // Fuente más grande
            parrafo.setSpacingBefore(10);
            parrafo.setSpacingAfter(20);
            documento.add(parrafo);

            float[] columnsWidths = {2, 5, 2, 5}; // Anchos de columna ajustados
            PdfPTable tabla = new PdfPTable(columnsWidths.length);
            tabla.setWidths(columnsWidths);
            tabla.setWidthPercentage(100); // Tabla ocupa el 100% del ancho de la página

            Font tableFont = FontFactory.getFont("Tahoma", 12, BaseColor.BLACK); // Fuente de tabla más grande

            PdfPCell cell;

            String[] headers = {"ID", "Company", "Tlf", "Address"};
            for (String headerText : headers) {
                cell = new PdfPCell(new Phrase(headerText, tableFont));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabla.addCell(cell);
            }

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT id_proveedor, empresa, telefono, direccion FROM proveedores");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    tabla.addCell(new Phrase(rs.getString("id_proveedor"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("empresa"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("telefono"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("direccion"), tableFont));
                }
                documento.add(tabla);
            } catch (SQLException e) {
                System.out.println("Error en: " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "List created!");

        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Error 2 en: " + e);
        } catch (IOException e) {
            System.out.println("Error 3 en: " + e);
        }
    }

    public void listaEmpleados() {
        Document documento = new Document(PageSize.A4.rotate()); // Cambiar a orientación horizontal
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/Employees_List.pdf"));
            documento.open();

            // Ruta válida a una imagen
            Image header = Image.getInstance("src/img/Banner.jpeg");
            header.scaleToFit(850, 1000); // Hacer el encabezado más ancho
            header.setAlignment(Chunk.ALIGN_CENTER);
            documento.add(header);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Chunk.ALIGN_CENTER);
            parrafo.add(new Chunk("Gutierrez Meats Employees List\n\n", FontFactory.getFont("Tahoma", 24, Font.BOLD, BaseColor.DARK_GRAY))); // Fuente más grande
            parrafo.add(new Chunk("Quality and Freshness Guaranteed\n\n", FontFactory.getFont("Tahoma", 16, Font.ITALIC, BaseColor.GRAY))); // Fuente más grande
            parrafo.setSpacingBefore(10);
            parrafo.setSpacingAfter(20);
            documento.add(parrafo);

            float[] columnsWidths = {2, 3, 4, 4, 3, 3, 3, 6, 2}; // Anchos de columna ajustados
            PdfPTable tabla = new PdfPTable(columnsWidths.length);
            tabla.setWidths(columnsWidths);
            tabla.setWidthPercentage(100); // Tabla ocupa el 100% del ancho de la página

            Font tableFont = FontFactory.getFont("Tahoma", 12, BaseColor.BLACK); // Fuente de tabla más grande

            PdfPCell cell;

            String[] headers = {"ID", "ID Nº", "Name", "Surname", "Tlf", "User", "Salary", "Address", "Admin"};
            for (String headerText : headers) {
                cell = new PdfPCell(new Phrase(headerText, tableFont));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabla.addCell(cell);
            }

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select id_empleado, NIdentidad, Nombre, Apellido, Telefono, Usuario, Sueldo, Direccion, Admin from Empleados");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    tabla.addCell(new Phrase(rs.getString("id_empleado"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("NIdentidad"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Nombre"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Apellido"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Telefono"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Usuario"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Sueldo"), tableFont));
                    tabla.addCell(new Phrase(rs.getString("Direccion"), tableFont));
                    tabla.addCell(new Phrase(rs.getBoolean("Admin") ? "Yes" : "No", tableFont));
                }
                documento.add(tabla);
            } catch (SQLException e) {
                System.out.println("Error en: " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "List created!");

        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Error 2 en: " + e);
        } catch (IOException e) {
            System.out.println("Error 3 en: " + e);
        }
    }
}
