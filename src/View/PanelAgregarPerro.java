/**
 * 
 */
package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * Clase que representa el Panel Agregar Perro.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class PanelAgregarPerro extends JPanel implements ActionListener
{
    // -------------------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------------------
    
    /**
     * Comando enviado para el boton Examinar.
     */
    public static final String EXAMINAR = "BuscarImagen";
    
    /**
     * Comando enviado para el boton Agregar Perro.
     */
    public static final String AGREGAR_PERRO = "AgregarPerro";
    
    // -------------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------------
    
    /**
     * Etiqueta nombre.
     */
    private JLabel lblNombre;
    
    /**
     * Etiqueta raza.
     */
    private JLabel lblRaza;
    
    /**
     * Etiqueta edad.
     */
    private JLabel lblEdad;
    
    /**
     * Etiqueta puntos.
     */
    private JLabel lblPuntos;
    
    /**
     * Etiqueta Imagen.
     */
    private JLabel lblImagen;
    
    /**
     * Campo de texto Nombre.
     */
    private JTextField txtNombre;
    
    /**
     * Campo de texto Raza.
     */
    private JTextField txtRaza;
    
    /**
     * Campo de texto Edad.
     */
    private JTextField txtEdad;
    
    /**
     * Campo de texto Puntos.
     */
    private JTextField txtPuntos;
    
    /**
     * Campo de texto Imagen.
     */
    private JTextField txtImagen;
    
    /**
     * Boton Examinar imagen.
     */
    private JButton btnExaminar;
    
    /**
     * Boton Agregar Perro.
     */
    private JButton btnAgregarPerro;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Construye el Panel Agregar Perro.
     */
    public PanelAgregarPerro()
    {
        this.setBorder(new CompoundBorder(new EmptyBorder(10,5,10,5), new TitledBorder("Agregar Perro")));
        this.setLayout(new BorderLayout());
        
        /**
         * Panel Norte
         */
        JPanel pnlNorte = new JPanel();
        GroupLayout grupo = new GroupLayout(pnlNorte);
        pnlNorte.setLayout(grupo);
        pnlNorte.setBorder(new EmptyBorder(5,5,1,5));
        
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();
        lblRaza = new JLabel("Raza:");
        txtRaza = new JTextField();
        
        lblEdad = new JLabel("Edad:");
        txtEdad = new JTextField();
        lblPuntos = new JLabel("Puntos:");
        txtPuntos = new JTextField();
        
        lblImagen = new JLabel("Imagen:");
        
        JPanel pnlInterno = new JPanel();
        pnlInterno.setLayout(new GridLayout(1, 2));
        
        txtImagen = new JTextField();
        btnExaminar = new JButton("Examinar");
        btnExaminar.setActionCommand(EXAMINAR);
        btnExaminar.addActionListener((ActionListener)this);
        pnlInterno.add(txtImagen);
        pnlInterno.add(btnExaminar);
        
        grupo.setAutoCreateContainerGaps(true);
        grupo.setAutoCreateGaps(true);
        
        //Set Hosrizotal
        grupo.setHorizontalGroup(
                grupo.createSequentialGroup()
                .addGroup(grupo.createParallelGroup()
                        .addComponent(lblNombre)
                        .addComponent(lblEdad)
                        .addComponent(lblImagen)
                )
                
                .addGroup(grupo.createParallelGroup()
                        .addComponent(txtNombre)
                        .addComponent(txtEdad)
                        .addComponent(pnlInterno)
                )
                
                .addGroup(grupo.createParallelGroup()
                        .addComponent(lblRaza)
                        .addComponent(lblPuntos)
                )
                
                .addGroup(grupo.createParallelGroup()
                        .addComponent(txtRaza)
                        .addComponent(txtPuntos)
                )
        );
        
        grupo.linkSize(SwingConstants.HORIZONTAL, txtNombre, txtEdad, pnlInterno, txtRaza, txtPuntos);
        
        //Set Vertical
        
        grupo.setVerticalGroup(
                grupo.createSequentialGroup()
                .addGroup(grupo.createParallelGroup()
                        .addComponent(lblNombre)
                        .addComponent(txtNombre)
                        .addComponent(lblRaza)
                        .addComponent(txtRaza)
                )
                
                .addGroup(grupo.createParallelGroup()
                        .addComponent(lblEdad)
                        .addComponent(txtEdad)
                        .addComponent(lblPuntos)
                        .addComponent(txtPuntos)
                )
                
                .addGroup(grupo.createParallelGroup()
                        .addComponent(lblImagen)
                        .addComponent(pnlInterno)
                )
                
        );
        
        /**
         * Panel Sur
         */
        JPanel pnlSur = new JPanel();
        pnlSur.setBorder(new EmptyBorder(1,5,20,5));
        pnlSur.setLayout(new FlowLayout());
        
        btnAgregarPerro = new JButton("Agregar Perro");
        btnAgregarPerro.setActionCommand(AGREGAR_PERRO);
        btnAgregarPerro.addActionListener((ActionListener)this);
        
        pnlSur.add(btnAgregarPerro);
        
        this.add(pnlNorte, BorderLayout.CENTER);
        this.add(pnlSur, BorderLayout.SOUTH);
        
        
        
        
        
        
    }
    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }
    
    
    
}
