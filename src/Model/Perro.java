/**
 * 
 */
package Model;

/**
 * Clase qure representa un Perro de la galeria.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class Perro 
{
    // -------------------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------------------
    
    // -------------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------------
    
    /**
     * Nombre del perro.
     */
    private String nombre;
    
    /**
     * Raza del perrro.
     */
    private String raza;
    
    /**
     * Edad del perro.
     */
    private int edad;
    
    /**
     * Calificación del perro.
     */
    private int puntos;
    
    /**
     * Imagen del perro.
     */
    private String imagen;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Crear un registro de un perro perteneciente a la exposición.
     * @param nombre Nombre del perro. nombre != null && nombre != "".
     * @param raza Raza del perro. raza != null && raza != "".
     * @param edad Edad del perro. edad > 0.
     * @param puntos Calificación del perro.
     * @param imagen Ubicación de la imagen del perro.
     */
    public Perro(String nombre, String raza, int edad, int puntos, String imagen)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.puntos = puntos;
        this.imagen = imagen;
    }

    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------

    /**
     * @return El nombre del perro.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre El nombre del perro para actualizar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return La raza del perro.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza La raza del perro para actualizar.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return Edad del perro.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad La edad del perro para actualizar.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return Puntos del perro.
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos Puntos del perro para actualizar.
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * @return Ruta de la imagen del perro.
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen Ruta de la imagen del perro para actualizar.
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    /**
     * Descripción del Perro en la lista.
     * @return 
     */
    @Override
    public String toString()
    {
        return nombre + " (" + raza + ")";
    }
}
