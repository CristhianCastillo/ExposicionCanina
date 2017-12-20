/**
 * 
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * Clase que representa el Panel Datos Perro.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class PanelDatosPerro extends JPanel 
{
    // -------------------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------------------
    
    // -------------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------------
    
    /**
     * Imagen perro.
     */
    private JLabel lblImagenPerro;
    
    /**
     * Etiqueta Nombre.
     */
    private JLabel lblNombre;
    
    /**
     * Etiqueta Edad.
     */
    private JLabel lblEdad;
    
    /**
     * Etiqueta Raza.
     */
    private JLabel lblRaza;
    
    /**
     * Etiqueta Puntos.
     */
    private JLabel lblPuntos;
    
    /**
     * Campo de texto Nombre.
     */
    private JTextField txtNombre;
    
    /**
     * Campo de texto Edad.
     */
    private JTextField txtEdad;
    
    /**
     * Campo de texto Raza.
     */
    private JTextField txtRaza;
    
    /**
     * Campo de texto Puntos.
     */
    private JTextField txtPuntos;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Construye el panel que muestra los Datos del perro.
     */
    public PanelDatosPerro()
    {
        this.setBorder(new CompoundBorder(new EmptyBorder(4,3,3,3), new TitledBorder("Datos Perro")));
        this.setLayout(new BorderLayout());
        
        JPanel pnlImagen = new JPanel();        
        lblImagenPerro = new JLabel();
        ImageIcon icono = new ImageIcon("data/gosque.jpg");
        lblImagenPerro.setIcon(icono);
        lblImagenPerro.setBorder(new LineBorder(Color.BLACK, 1));
        lblImagenPerro.setMinimumSize(new Dimension(230, 153));
        lblImagenPerro.setMaximumSize(new Dimension(230, 153));
        pnlImagen.add(lblImagenPerro);
        

        
        JPanel pnlInformacion = new JPanel();
        pnlInformacion.setLayout(new GridLayout(2, 4));
        
        lblNombre = new JLabel("Nombre:");
        
        txtNombre = new JTextField(40);
        txtNombre.setEnabled(false);
        
        lblRaza = new JLabel("Raza:");
        lblRaza.setBorder(new EmptyBorder(0,5,0,0));
        
        txtRaza = new JTextField();
        txtRaza.setEnabled(false);
        
        lblEdad = new JLabel("Edad:");
        
        txtEdad = new JTextField();
        txtEdad.setEnabled(false);
        
        lblPuntos = new JLabel("Puntos:");
        lblPuntos.setBorder(new EmptyBorder(0,5,0,0));
        
        txtPuntos = new JTextField();
        txtPuntos.setEnabled(false);
        
        pnlInformacion.add(lblNombre);
        pnlInformacion.add(txtNombre);
        pnlInformacion.add(lblRaza);
        pnlInformacion.add(txtRaza);
        pnlInformacion.add(lblEdad);
        pnlInformacion.add(txtEdad);
        pnlInformacion.add(lblPuntos);
        pnlInformacion.add(txtPuntos);
                
        this.add(pnlImagen, BorderLayout.NORTH);
        this.add(pnlInformacion, BorderLayout.SOUTH);
        
        
    }
    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------
}
