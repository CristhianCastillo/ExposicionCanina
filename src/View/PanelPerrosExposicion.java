/**
 * 
 */
package View;

import Controller.Controlador;
import Model.Perro;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * Representa el Panel Perros en la exposicion.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class PanelPerrosExposicion extends JPanel
{
    // -------------------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------------------
    
    // -------------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------------
    
    /**
     * Lista de los perros que forman parte de la exposicion.
     */
    private JList listaPerros;
    
    /**
     * Modelo agregado a la lista.
     */
    private DefaultListModel<Perro> modeloLista;
    
    /**
     * Controlador principal de la aplicacion.
     */
    private Controlador ctrl;
    
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Contruye el panel Perros en la exposición.
     * @param ctrl
     */
    public PanelPerrosExposicion(Controlador ctrl)
    {
        this.ctrl = ctrl;
        this.setBorder(new CompoundBorder( new EmptyBorder(4,3,3,3),new TitledBorder("Perros en la exposición")));
        this.setLayout(new BorderLayout());
        
        modeloLista = new DefaultListModel<Perro>();
        
        listaPerros = new JList();
        listaPerros.setModel(modeloLista);
        listaPerros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        JScrollPane scroll = new JScrollPane(listaPerros);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBorder(new CompoundBorder(new EmptyBorder(3,3,3,3), new LineBorder(Color.BLACK, 1)));
        
        this.add(scroll, BorderLayout.CENTER);
    }
    
    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------
    
    public void agregarALista(Perro perro)
    {
        modeloLista.addElement(perro);
    }
}
