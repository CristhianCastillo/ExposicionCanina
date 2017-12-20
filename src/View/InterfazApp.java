/**
 * 
 */
package View;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Clase que prepsenta la ventana principal de la aplicación.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class InterfazApp extends JFrame 
{
    // -------------------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------------------
    
    // -------------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------------
    
    /**
     * Representa el Panel en la exposición.
     */
    private PanelPerrosExposicion pnlPerrosExposicion;
    
    /**
     * Representa el Panel de Datos del perro.
     */
    private PanelDatosPerro pnlDatosPerro;
    
    /**
     * Representa el Panel de Búsqueda y ordenamiento.
     */
    private PanelBusquedaOrdenamientos pnlBusquedaOrdenamiento;
    
    /**
     * Representa el Panel Agregar Perro.
     */
    private PanelAgregarPerro pnlAgregarPerro;
    
    /**
     * Representa el Panel Consultas Exposición.
     */
    private PanelConsultas pnlConsultas;
    
    /**
     * Representa el Panel de Puntos de Extensión.
     */
    private PanelExtension pnlExtension;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Construye la ventana principal de la aplicación.
     */
    public InterfazApp()
    {
        this.setTitle("Exposición Canina");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pnlPerrosExposicion = new PanelPerrosExposicion();
        pnlDatosPerro = new PanelDatosPerro();
        pnlBusquedaOrdenamiento = new PanelBusquedaOrdenamientos();
        pnlAgregarPerro = new PanelAgregarPerro();
        pnlConsultas = new PanelConsultas();
        pnlExtension = new PanelExtension();
        
        JPanel pnlNorte = new JPanel();
        pnlNorte.setLayout(new BorderLayout());
        
        
        pnlNorte.add(pnlDatosPerro, BorderLayout.CENTER);
        pnlNorte.add(pnlPerrosExposicion, BorderLayout.WEST);
        pnlNorte.add(pnlBusquedaOrdenamiento, BorderLayout.EAST);
        
        JPanel pnlCentro = new JPanel();
        pnlCentro.setLayout(new BorderLayout());
        
        pnlCentro.add(pnlAgregarPerro, BorderLayout.WEST);
        pnlCentro.add(pnlConsultas, BorderLayout.CENTER);
        
        this.add(pnlNorte, BorderLayout.NORTH);
        this.add(pnlCentro, BorderLayout.CENTER);
        this.add(pnlExtension, BorderLayout.SOUTH);
        
        //this.setResizable(false);
        this.setSize(800, 550);
        this.setLocationRelativeTo(null);  
    }
    
    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------
    
    /**
     * Metodo principal de la aplicación.
     * @param arg0s No son necesarios.
     */
    public static void main(String [] arg0s)
    {
        InterfazApp aplicacion = new InterfazApp();
        aplicacion.setVisible(true);
    }
}
