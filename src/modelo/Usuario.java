/*
 * Clase Usuario - representa a un usuario del sistema.
 * 
 * @author Miguel
 * @date 2024-06-07
 */
package modelo;

/**La clase Usuario representa un usuario en el sistema.
 *
 * @author Miguel
 * @since 2024-06-07
 */
public class Usuario {

    private int idUsuario;
    private String nidentidad;
    private String nombre;
    private String apellido;
    private String telefono;
    private String password;
    private String usuario;
    private double sueldo;
    private String direccion;
    private boolean admin;

    /**
     * Constructor por defecto de la clase Usuario. Inicializa todos los
     * atributos con valores predeterminados.
     */
    public Usuario() {
        this.idUsuario = 0;
        this.nidentidad = "";
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.usuario = "";
        this.password = "";
        this.sueldo = 0;
        this.direccion = "";
        this.admin = false; // Inicialización del nuevo atributo
    }

    /**
     * Constructor con parámetros de la clase Usuario.
     *
     * @param idUsuario ID del usuario.
     * @param nidentidad Número de identidad del usuario.
     * @param nombre Nombre del usuario.
     * @param apellido Apellido del usuario.
     * @param telefono Teléfono del usuario.
     * @param password Contraseña del usuario.
     * @param usuario Nombre de usuario del usuario.
     * @param sueldo Sueldo del usuario.
     * @param direccion Dirección del usuario.
     * @param admin Indica si el usuario es administrador o no.
     */
    public Usuario(int idUsuario, String nidentidad, String nombre, String apellido, String telefono, String password, String usuario, double sueldo, String direccion, boolean admin) {
        this.idUsuario = idUsuario;
        this.nidentidad = nidentidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.password = password;
        this.usuario = usuario;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.admin = admin; // Inicialización del nuevo atributo
    }

    // Getters y setters
    /**
     * Obtiene el ID del usuario.
     *
     * @return El ID del usuario.
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el ID del usuario.
     *
     * @param idUsuario El nuevo ID del usuario.
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     *
     * @return El apellido del usuario.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del usuario.
     *
     * @param apellido El nuevo apellido del usuario.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return La contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param password La nueva contraseña del usuario.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene el nombre de usuario del usuario.
     *
     * @return El nombre de usuario del usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre de usuario del usuario.
     *
     * @param usuario El nuevo nombre de usuario del usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene el número de teléfono del usuario.
     *
     * @return El número de teléfono del usuario.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del usuario.
     *
     * @param telefono El nuevo número de teléfono del usuario.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el número de identidad del usuario.
     *
     * @return El número de identidad del usuario.
     */
    public String getNidentidad() {
        return nidentidad;
    }

    /**
     * Establece el número de identidad del usuario.
     *
     * @param nidentidad El nuevo número de identidad del usuario.
     */
    public void setNidentidad(String nidentidad) {
        this.nidentidad = nidentidad;
    }

    /**
     * Obtiene el sueldo del usuario.
     *
     * @return El sueldo del usuario.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo del usuario.
     *
     * @param sueldo El nuevo sueldo del usuario.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Obtiene la dirección del usuario.
     *
     * @return La dirección del usuario.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del usuario.
     *
     * @param direccion La nueva dirección del usuario.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Verifica si el usuario es administrador.
     *
     * @return true si el usuario es administrador, false en caso contrario.
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Establece si el usuario es administrador o no.
     *
     * @param admin true si se quiere que el usuario sea administrador, false en
     * caso contrario.
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
