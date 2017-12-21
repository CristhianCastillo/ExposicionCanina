/**
 * 
 */
package Controller;

import Model.Exposicion;
import Model.Perro;
import View.PanelDatosPerro;
import View.PanelPerrosExposicion;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Clase que representa el controlador principal de la aplicación.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class Controlador 
{
    // -------------------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------------------
    
    // -------------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------------
    
    /**
     * Lista de los perros que hacen parte de la exposición.
     */
    private Exposicion exposicion;
    
    /**
     * Panel Lista de Perros de la exposición.
     */
    private PanelPerrosExposicion pnlPerrosExposicion;
    
    /**
     * Panel Datos Perro.
     */
    private PanelDatosPerro pnlDatosPerro;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Construye el coontrolador principal de la aplicación.
     */
    public Controlador()
    {
        exposicion = new Exposicion();
    }
    
    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------
    
    /**
     * Conecta los paneles con el controlador principal de la aplicación.
     * @param pnlPerrosExposicion PanelPerrosExposicion.
     */
    public void conectar(PanelPerrosExposicion pnlPerrosExposicion, PanelDatosPerro pnlDatosPerro)
    {
        this.pnlPerrosExposicion = pnlPerrosExposicion;
        this.pnlDatosPerro = pnlDatosPerro;
    }
    
    /**
     * Carga la informacion de los perros mediante un archivo de propiedades.
     * @param ruta Ruta y nombre del archivo de propiedades. ruta != null && ruta != "".
     * @throws Exception 
     */
    public void cargarPerros(String ruta) throws Exception
    {
        try
        {
            Properties datos = new Properties();
            FileInputStream input = new FileInputStream(ruta);
            datos.load(input);
            
            //Obtiene el numero de perros.
            int numeroPerros = Integer.parseInt(datos.getProperty("total.perros"));
            
            for(int i = 1; i <= numeroPerros; i ++)
            {
                String nombrePerro = datos.getProperty("perro" + i + ".nombre");
                String razaPerro = datos.getProperty("perro" + i + ".raza");
                String imagen = datos.getProperty("perro" + i + ".imagen");
                String puntosPerroStr = datos.getProperty("perro" + i + ".puntos");
                String edadPerroStr = datos.getProperty("perro" + i + ".edad");
                
                //Validaciones
                if(nombrePerro == null)
                    throw new Exception("Falta definir la propiedad " + "perro" + i + ".nombre");
                if(razaPerro == null)
                    throw new Exception("Falta definir la propiedad " + "perro" + i + ".raza");
                if(imagen == null)
                    throw new Exception("Falta definir la propiedad" + "perro" + i + ".imagen");
                if(puntosPerroStr == null)
                    throw new Exception("Falta definir la propiedad" + "perro" + i + ".puntos");
                if(edadPerroStr == null)
                    throw new Exception("Falta definir la propiedad" + "perro" + i + ".edad");
                
                if(nombrePerro.equals(""))
                    throw new Exception("El nombre del perro no puede estar vacio.");
                if(razaPerro.equals(""))
                    throw new Exception("La raza del perro no puede estar vacia.");
                if(imagen.equals(""))
                    throw new Exception("La imagen del perro no puede estar vacia.");
            
                try
                {
                    int puntosPerro = Integer.parseInt(puntosPerroStr.toString());
                    if(puntosPerro < 0)
                        throw new Exception("Los puntos del perro no pueden ser negativos.");
                    int edadPerro = Integer.parseInt(edadPerroStr.toString());
                    if(edadPerro <= 0)
                        throw new Exception("La edad del perro no puede ser menor o negativa.");
                    
                    Perro perro = new Perro(nombrePerro, razaPerro, edadPerro, puntosPerro, imagen);
                    exposicion.agregarPerro(perro);
                }
                catch(Exception e)
                {
                    throw new Exception("Los puntos y edad deben ser un número.");
                }   
            }
            
            pnlPerrosExposicion.refrescarElementos(exposicion.getListaPerros());
            pnlPerrosExposicion.seleccionarItem(0);
        }
        catch(Exception ex)
        {
            throw new Exception("Error al cargar los datos almacenados de las atracciones.");
        }
    }
    
    /**
     * Obtiene el Perro seleccionado de la lista y actualiza el Panel Datos Perro.
     * @param item Posicion en la lista del Perro seleccionado.
     * @throws IOException 
     */
    public void perroSeleccionado(int item) throws IOException
    {
        Perro perroSeleccionado = exposicion.getPerro(item);
        pnlDatosPerro.setPerroSeleccionado(perroSeleccionado);
    }
    
    public void agregarPerro(String nombre, String raza, int edad, int puntos, String imagen) throws Exception
    {
        if(!exposicion.existePerro(nombre))
        {
            Perro perro = new Perro(nombre, raza, edad, puntos, imagen);
            exposicion.agregarPerro(perro);
            pnlPerrosExposicion.refrescarElementos(exposicion.getListaPerros());
            pnlPerrosExposicion.seleccionarItem(0);
        }
        else
        {
            throw new Exception("Ya exite un perro con este nombre.");
        }
    }
    
}
