/**
 * 
 */
package Model;

import java.util.ArrayList;

/**
 * Clase que representa La exposición canina.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class Exposicion 
{
    // -------------------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------------------
    
    // -------------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------------
    
    /**
     * Colección de los perros que forman parte de la exposición.
     */
    private ArrayList<Perro> coleccionPerros;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    public Exposicion()
    {
        coleccionPerros = new ArrayList<>();
    }
    
    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------
    
    /**
     * Agrega un perro a la exposición canina.
     * @param perro Perro a ser agregado a la colección
     */
    public void agregarPerro(Perro perro)
    {
        coleccionPerros.add(perro);
    }
    
}
