/**
 * 
 */
package View;

import Model.Perro;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
    
     /**
     * Esta constante indica la altura que debe tener la imagen de un individuo
     */
    private static final int ALTURA = 200;

    /**
     * Esta constante indica el ancho que debe tener la imagen de un individuo
     */
    private static final int ANCHO = 200;
    
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
    
    /**
     * Objeto contenedor de la imagen del perro seleccionado.
     */
    private ImageIcon icono;
    
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
        lblImagenPerro.setBorder(new LineBorder(Color.BLACK, 1));
        lblImagenPerro.setMinimumSize(new Dimension(230, 153));
        lblImagenPerro.setMaximumSize(new Dimension(230, 153));
        pnlImagen.add(lblImagenPerro);
        

        
        JPanel pnlInformacion = new JPanel();
        GroupLayout grupo = new GroupLayout(pnlInformacion);
        
        pnlInformacion.setLayout(grupo);
        
        lblNombre = new JLabel("Nombre:");
        
        txtNombre = new JTextField();
        txtNombre.setEnabled(false);
        
        lblRaza = new JLabel("Raza:");

        txtRaza = new JTextField();
        txtRaza.setEnabled(false);
        
        lblEdad = new JLabel("Edad:");
        
        txtEdad = new JTextField();
        txtEdad.setEnabled(false);
        
        lblPuntos = new JLabel("Puntos:");
        
        txtPuntos = new JTextField();
        txtPuntos.setEnabled(false);
        
        grupo.setAutoCreateContainerGaps(true);
        grupo.setAutoCreateGaps(true);
        
        //Set Horizontal
        
        grupo.setHorizontalGroup(
                grupo.createSequentialGroup()
                .addGroup(grupo.createParallelGroup()
                        .addComponent(lblNombre)
                        .addComponent(lblEdad)
                )
                
                .addGroup(grupo.createParallelGroup()
                        .addComponent(txtNombre)
                        .addComponent(txtEdad)
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
       
        //Set Vertical
        
        grupo.setVerticalGroup(grupo.createSequentialGroup()
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
        );
       
        this.add(pnlImagen, BorderLayout.NORTH);
        this.add(pnlInformacion, BorderLayout.SOUTH);
        
        
    }
    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------
    
    /**
     * Actualiza la vista del panel con la informacion del cachorro seleccionado.
     * @param perro Perro seleccionado.
     * @throws IOException 
     */
    public void setPerroSeleccionado(Perro perro) throws IOException
    {
        txtNombre.setText(perro.getNombre());
        txtRaza.setText(perro.getRaza());
        txtEdad.setText(perro.getEdad() + " meses");
        txtPuntos.setText(perro.getPuntos() + "");
        
        String imagen = perro.getImagen();
        BufferedImage bImagen = ImageIO.read( new File( imagen ) );
        Image laImagen = bImagen.getScaledInstance( ( int ) ( ANCHO * 0.85 ), ( int ) ( ALTURA * 0.85 ), Image.SCALE_AREA_AVERAGING );
        icono = new ImageIcon(laImagen);
        lblImagenPerro.setIcon(icono);
    }
}
