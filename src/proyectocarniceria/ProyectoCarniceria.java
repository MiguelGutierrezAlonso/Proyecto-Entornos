/*
 * Esta clase es la clase principal del proyecto "ProyectoCarniceria". 
 * Inicia la aplicación mostrando el formulario de inicio de sesión (FrmLogin).
 * 
 * @author Miguel
 * @since 2024-06-07
 */
package proyectocarniceria;

import vista.FrmLogin;

/**
 * La clase principal del proyecto "ProyectoCarniceria".
 */
public class ProyectoCarniceria {

    /**
     * Este método es el punto de entrada principal de la aplicación.
     * Crea una instancia del formulario de inicio de sesión (FrmLogin) y lo hace visible.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }
    
}
