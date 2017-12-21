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
    
    /**
     * Construye el contenedor de la exposicion canina.
     */
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
    
    /**
     * Obtiene la lista de los perros de la exposición.
     * @return Lista de los perros.
     */
    public ArrayList<Perro> getListaPerros()
    {
        return this.coleccionPerros;
    }
    
    /**
     * Obtiene un objeto tipo Perro en una posicion especifica.
     * @param index Indice del objeto.
     * @return Perro seleccionado.
     */
    public Perro getPerro (int index)
    {
        return coleccionPerros.get(index);
    }
    
    public boolean existePerro(String nombre)
    {
        for(int i = 0; i < coleccionPerros.size(); i ++)
        {
            Perro perroTemp = coleccionPerros.get(i);
            if(perroTemp.getNombre().equalsIgnoreCase(nombre))
            {
                return true;
            }
        }
        
        return false;
    }
    
}
