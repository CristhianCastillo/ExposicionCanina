/**
 * 
 */
package View;

import Controller.Controlador;
import Model.Perro;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Representa el Panel Perros en la exposicion.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class PanelPerrosExposicion extends JPanel implements ListSelectionListener
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
        
        listaPerros = new JList();
        listaPerros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaPerros.addListSelectionListener((ListSelectionListener)this);
        
        JScrollPane scroll = new JScrollPane(listaPerros);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBorder(new CompoundBorder(new EmptyBorder(3,3,3,3), new LineBorder(Color.BLACK, 1)));
        
        this.add(scroll, BorderLayout.CENTER);
    }
    
    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------
    
    /**
     * Actualiza la list de los perros que forman parte de la exposición canina.
     * @param listaPerros Lista de los perros de la exposición.
     */
    public void refrescarElementos(ArrayList<Perro> listaPerros)
    {
        this.listaPerros.setListData(listaPerros.toArray());
    }
    
    /**
     * Actualiza el item seleccionado de la lista.
     * @param indice Indice seleccionado.
     */
    public void seleccionarItem(int indice)
    {
        listaPerros.setSelectedIndex(indice);
        listaPerros.ensureIndexIsVisible(indice);
    }

    /**
     * Evento generado al seleccionar un item de la lista de perros.
     * @param e 
     */
    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
        if(listaPerros.getSelectedValue() != null)
        {
            try
            {
                int item = listaPerros.getSelectedIndex();
                ctrl.perroSeleccionado(item);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Perros Exposición", JOptionPane.ERROR_MESSAGE);
            }
           
        }

    }
}
