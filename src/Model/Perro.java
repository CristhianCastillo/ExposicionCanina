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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    @Override
    public String toString()
    {
        return nombre + " (" + raza + ")";
    }
}
