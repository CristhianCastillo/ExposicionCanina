/**
 * 
 */
package View;

import Controller.Controlador;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    
    /**
     * Representa el contrplador principal de la aplicación.
     */
    private Controlador ctrl;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Construye la ventana principal de la aplicación.
     */
    public InterfazApp()
    {
        ctrl = new Controlador();
        this.setTitle("Exposición Canina");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pnlPerrosExposicion = new PanelPerrosExposicion(ctrl);
        pnlDatosPerro = new PanelDatosPerro();
        pnlBusquedaOrdenamiento = new PanelBusquedaOrdenamientos(ctrl);
        pnlAgregarPerro = new PanelAgregarPerro(ctrl);
        pnlConsultas = new PanelConsultas(ctrl);
        pnlExtension = new PanelExtension(ctrl);
        
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
        
        this.setResizable(false);
        this.setSize(800, 575);
        this.setLocationRelativeTo(null);
        ctrl.conectar(pnlPerrosExposicion, pnlDatosPerro);
        
        try
        {
            ctrl.cargarPerros("./data/perros.txt");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Cargue de información", JOptionPane.ERROR_MESSAGE);
        }
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
