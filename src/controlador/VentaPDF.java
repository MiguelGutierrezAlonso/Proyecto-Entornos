/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author ESTIMADO USUARIO
 */
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import vista.InterFactura;
import java.sql.*;

public class VentaPDF {
    
    private String nombreCliente;
    private String nICliente;
    private String telefonoCliente;
    private String direccionCliente;
    
    private String fechaActual = "";
    private String nombreArchivoPDFVenta = "";
    
    public void DatosCliente(int idCliente){
        Connection cn = Conexion.conectar();
        String sql = "select * from clientes where id_cliente = '" + idCliente + "'";
        Statement st;
        try{
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                nombreCliente = rs.getString("nombre") + " " + rs.getString("apellido");
                nICliente = rs.getString("NIdentidad");
                telefonoCliente = rs.getString("telefono");
                direccionCliente = rs.getString("direccion");
            }
            cn.close();
        }catch(SQLException e){
            System.out.println("Error obteniendo los datos del cliente: " + e);
        }
    }
    
    public void generarFacturaPDF(){
        try{
            
            Date date = new Date();
            fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
            
            String fechaNueva = "";
            for(int i = 0; i < fechaActual.length(); i++){
                if(fechaActual.charAt(i) == '/'){
                    fechaNueva = fechaActual.replace("/", "_");
                    
                }
            }
            
            nombreArchivoPDFVenta = "Order_" + nombreCliente + "_" + fechaNueva + ".pdf";
            
            FileOutputStream archivo;
            File file = new File("src/pdf/" + nombreArchivoPDFVenta);
            archivo = new FileOutputStream(file);
            
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            int idVenta = 0;
            
            try{
            String sql = "SELECT MAX(id_pedido) FROM ventas";
            Connection conn = Conexion.conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                idVenta = rs.getInt(1);
            }
            rs.close();
            pstmt.close();
            conn.close();
            }catch(SQLException e){
                
            }
            
            
            Image img = Image.getInstance("src/img/ImagenCarniceria.png");
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.RED);
            fecha.add(Chunk.NEWLINE);
            fecha.add("Order: " + idVenta + "\nDate: " + fechaActual + "\n\n");
            
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            
            float[] ColumnaEncabezado = new float[] {20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            Encabezado.addCell(img);
            
            String nempresa = "G83475834M";
            String nombre = "Gutierrez Meats";
            String telefono = "677777777";
            String direccion = "Valladolid city";
            
            Encabezado.addCell("");
            Encabezado.addCell("FIN: " + nempresa + "\nComapny: " + nombre + "\nTlf: "+ telefono + "\nAddress: " + direccion);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            Paragraph cliente = new Paragraph();
            cliente.add(Chunk.NEWLINE);
            cliente.add("Client information: " + "\n\n");
            doc.add(cliente);
            
            PdfPTable tablaCliente = new PdfPTable(4);
            tablaCliente.setWidthPercentage(100);
            tablaCliente.getDefaultCell().setBorder(0);
            
            float[] ColumnaCliente = new float[]{25f, 45f, 30f, 40f};
            tablaCliente.setWidths(ColumnaCliente);
            tablaCliente.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cliente1 = new PdfPCell(new Phrase("ID nº :", negrita));
            PdfPCell cliente2 = new PdfPCell(new Phrase("Nameº :", negrita));
            PdfPCell cliente3 = new PdfPCell(new Phrase("Tlf :", negrita));
            PdfPCell cliente4 = new PdfPCell(new Phrase("Address :", negrita));
            
            cliente1.setBorder(0);
            cliente2.setBorder(0);
            cliente3.setBorder(0);
            cliente4.setBorder(0);
            
            tablaCliente.addCell(cliente1);
            tablaCliente.addCell(cliente2);
            tablaCliente.addCell(cliente3);
            tablaCliente.addCell(cliente4);
            tablaCliente.addCell(nICliente);
            tablaCliente.addCell(nombreCliente);
            tablaCliente.addCell(telefonoCliente);
            tablaCliente.addCell(direccionCliente);
            
            doc.add(tablaCliente);
            
            Paragraph espacio = new Paragraph();
            espacio.add(Chunk.NEWLINE);
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_CENTER);
            doc.add(espacio);
            
            PdfPTable tablaProducto = new PdfPTable(4);
            tablaProducto.setWidthPercentage(100);
            tablaProducto.getDefaultCell().setBorder(0);
            
            float[] ColumnaProducto = new float[]{20f, 40f, 20f, 20f};
            tablaProducto.setWidths(ColumnaProducto);
            tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell producto1 = new PdfPCell(new Phrase("Quantity: ", negrita));
            PdfPCell producto2 = new PdfPCell(new Phrase("Product: ", negrita));
            PdfPCell producto3 = new PdfPCell(new Phrase("Unitary Price:", negrita));
            PdfPCell producto4 = new PdfPCell(new Phrase("Total Price:", negrita));
            
            producto1.setBorder(0);
            producto2.setBorder(0);
            producto3.setBorder(0);
            producto4.setBorder(0);
            
            producto1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto4.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            tablaProducto.addCell(producto1);
            tablaProducto.addCell(producto2);
            tablaProducto.addCell(producto3);
            tablaProducto.addCell(producto4);
            
            for(int i = 0; i < InterFactura.FTabla.getRowCount(); i++){
                String producto = InterFactura.FTabla.getValueAt(i, 1).toString();
                String cantidad = InterFactura.FTabla.getValueAt(i, 2).toString();
                String precio = InterFactura.FTabla.getValueAt(i, 3).toString();
                String total = InterFactura.FTabla.getValueAt(i, 4).toString();
                
                tablaProducto.addCell(cantidad);
                tablaProducto.addCell(producto);
                tablaProducto.addCell(precio);
                tablaProducto.addCell(total);
                
            }
            
            doc.add(tablaProducto);
            
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total ammount to pay: " + InterFactura.FPrecioTotal.getText());
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);
            
            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Sign");
            firma.add(Chunk.NEWLINE);
            firma.add(Chunk.NEWLINE);
            firma.add(Chunk.NEWLINE);
            firma.add(Chunk.NEWLINE);
            firma.add(Chunk.NEWLINE);
            firma.add("___________________________________");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);
            
            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("Tank you for trusting us!");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);
            
            doc.close();
            archivo.close();
            
            Desktop.getDesktop().open(file);
            
        }catch(DocumentException | IOException e){
            System.out.println("Error en: " + e);
        }
    }
    
}
