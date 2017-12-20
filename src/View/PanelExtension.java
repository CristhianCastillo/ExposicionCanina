/**
 * 
 */
package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Clase que representa el Panel de Puntos de Extensión.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class PanelExtension extends JPanel implements ActionListener
{
    // -------------------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------------------
    
    /**
     * Comando enviado al boton Opcion uno.
     */
    public static final String OPCION_UNO = "Opcion1";
    
    /**
     * Comando enviado al boton Opcion dos.
     */
    public static final String OPCION_DOS = "Opcion2";
    
    // -------------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------------
    
    /**
     * Boton Opcion uno.
     */
    private JButton btnOpcionUno;
    
    /**
     * Boton Opcion dos.
     */
    private JButton btnOpcionDos;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Construye el Panel Puntos de Extensión.
     */
    public PanelExtension()
    {
        this.setBorder(new TitledBorder("Puntos de Extensión"));
        this.setLayout(new FlowLayout());
        
        btnOpcionUno = new JButton("Opción 1");
        btnOpcionUno.setActionCommand(OPCION_UNO);
        btnOpcionUno.addActionListener((ActionListener)this);
        
        btnOpcionDos = new JButton("Opción 2");
        btnOpcionDos.setActionCommand(OPCION_DOS);
        btnOpcionDos.addActionListener((ActionListener)this);
        
        this.add(btnOpcionUno);
        this.add(btnOpcionDos);
        
    }
    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }
    
}
