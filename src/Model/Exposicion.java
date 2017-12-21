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
    private final ArrayList<Perro> coleccionPerros;
    
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
    
    /**
     * Ordena los perros por Raza.
     * Se usa un ordenamiento por selección.
     */
    public void ordenarPorRaza()
    { 
        for(int i = 0; i < coleccionPerros.size() - 1; i ++)
        {
            Perro perroPivote = coleccionPerros.get(i);
            Perro perroMenor = perroPivote;
            int posicionIntercambio = i;
            for(int j = posicionIntercambio + 1; j < coleccionPerros.size(); j ++)
            {
                Perro perroIteracion = coleccionPerros.get(j);
                if(perroIteracion.getRaza().compareToIgnoreCase(perroMenor.getRaza()) < 0)
                {
                    posicionIntercambio = j;
                    perroMenor = perroIteracion; 
                }
            }
            
            //Intercambio de elementos.
            coleccionPerros.set(i, perroMenor);
            coleccionPerros.set(posicionIntercambio,perroPivote);
        }
    }
    
    /**
     * Ordena los perros por puntaje obtenido.
     * Se usa un ordenamiento por selección.
     */
    public void ordenarPorPuntos()
    {
        for(int i = 0; i < coleccionPerros.size() - 1; i ++)
        {
            Perro perroPivote = coleccionPerros.get(i);
            Perro perroMenor = perroPivote;
            int posicionIntercambio = i;
            for(int j = posicionIntercambio + 1; j < coleccionPerros.size(); j ++)
            {
                Perro perroIteracion = coleccionPerros.get(j);
                if(perroIteracion.getPuntos() < perroMenor.getPuntos())
                {
                    posicionIntercambio = j;
                    perroMenor = perroIteracion; 
                }
            }
            
            //Intercambio de elementos.
            coleccionPerros.set(i, perroMenor);
            coleccionPerros.set(posicionIntercambio,perroPivote);
        }
    }
    
    /**
     * Ordena los perros por edad.
     * Se usa un ordenamiento por selección.
     */
    public void ordenarPorEdad()
    {
        for(int i = 0; i < coleccionPerros.size() - 1; i ++)
        {
            Perro perroPivote = coleccionPerros.get(i);
            Perro perroMenor = perroPivote;
            int posicionIntercambio = i;
            for(int j = posicionIntercambio + 1; j < coleccionPerros.size(); j ++)
            {
                Perro perroIteracion = coleccionPerros.get(j);
                if(perroIteracion.getEdad() < perroMenor.getEdad())
                {
                    posicionIntercambio = j;
                    perroMenor = perroIteracion; 
                }
            }
            
            //Intercambio de elementos.
            coleccionPerros.set(i, perroMenor);
            coleccionPerros.set(posicionIntercambio,perroPivote);
        }
    }
    
    /**
     * Busca un perro con el nombre entregado.
     * @param nombre Nombre del perro a buscar. nombre != null && nombre != "".
     * @return Posición donde se encuentra el perro.
     */
    public int buscarPerro(String nombre)
    {
        for(int i = 0; i < coleccionPerros.size(); i ++)
        {
            Perro perroTemp = coleccionPerros.get(i);
            if(perroTemp.getNombre().equalsIgnoreCase(nombre))
            {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Obtiene el perro con mayor puntaje.
     * @return Posición en donde se encuentra el perro ganador.
     */
    public int obtenerGanador()
    {
        Perro perroGanador = coleccionPerros.get(0);
        int posicion = 0;
        for(int i = 1; i < coleccionPerros.size(); i ++)
        {
            Perro perroTemp = coleccionPerros.get(i);
            if(perroGanador.getPuntos() < perroTemp.getPuntos())
            {
                perroGanador = perroTemp;
                posicion = i;
            }
        }
        return posicion;
    }
    
    /**
     * Obtiene el perro con menor puntaje.
     * @return Posición en donde se encuentra el perro perdedor.
     */
    public int obtenerPerdedor()
    {
        Perro perroPerdedor = coleccionPerros.get(0);
        int posicion = 0;
        for(int i = 1; i < coleccionPerros.size(); i ++)
        {
            Perro perroTemp = coleccionPerros.get(i);
            if(perroTemp.getPuntos() < perroPerdedor.getPuntos())
            {
                perroPerdedor = perroTemp;
                posicion = i;
            }
        }
        return posicion;
    }
    
    /**
     * Obtiene el perro con la mayor edad.
     * @return Posición en donde se encuentra el perro mas viejo.
     */
    public int obtenerPerroViejo()
    {
        Perro perroViejo = coleccionPerros.get(0);
        int posicion = 0;
        for(int i = 1; i < coleccionPerros.size(); i ++)
        {
            Perro perroTemp = coleccionPerros.get(i);
            if(perroViejo.getEdad() < perroTemp.getEdad())
            {
                perroViejo = perroTemp;
                posicion = i;
            }
        }
        return posicion;
    }
    
}
