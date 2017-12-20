/**
 * 
 */
package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * Panel Búsqeda y ordenamientos.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class PanelBusquedaOrdenamientos extends JPanel implements ActionListener
{
    // -------------------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------------------
    
    /**
     * Comando enviando en el evento del boton Ordenar por Raza.
     */
    public static final String ORDENAR_RAZA = "OrdenarPorRaza";
    
    /**
     * Comando enviado en el evento del boton Ordenar por Puntos.
     */
    public static final String ORDENAR_PUNTOS = "OrdenarPorPuntos";
    
    /**
     * Comando enviado en el evento del boton Ordenar por Edad.
     */
    public static final String ORDENAR_EDAD = "OrdenarPorEdad";
    
    /**
     * Comando enviado en el evento del boton Buscar Perro.
     */
    public static final String BUSCAR_PERRO = "BuscarPerro";
    
    
    // -------------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------------
    
    /**
     * Boton Ordenar por Raza.
     */
    private JButton btnOrdenarRaza;
    
    /**
     * Boton Ordenar por Puntos.
     */
    private JButton btnOrdenarPuntos;
    
    /**
     * Boton Ordenar por Edad.
     */
    private JButton btnOrdenarEdad;
    
    /**
     * Boton Buscar Perro.
     */
    private JButton btnBuscarPerro;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Construye el Panel Búsqueda y ordenamiento.
     */
    public PanelBusquedaOrdenamientos()
    {
        this.setBorder(new CompoundBorder(new EmptyBorder(4,3,3,3), new TitledBorder("Búsqueda y ordenamientos")));
        this.setLayout(new BorderLayout());
        
        //Crecion de los componentes
        btnOrdenarRaza = new JButton("Ordenar por Raza");
        btnOrdenarRaza.setActionCommand(ORDENAR_RAZA);
        btnOrdenarRaza.addActionListener((ActionListener)this);
        
        btnOrdenarPuntos = new JButton("Ordenar por Puntos");
        btnOrdenarPuntos.setActionCommand(ORDENAR_PUNTOS);
        btnOrdenarPuntos.addActionListener((ActionListener)this);
        
        btnOrdenarEdad = new JButton("Ordenar por Edad");
        btnOrdenarEdad.setActionCommand(ORDENAR_EDAD);
        btnOrdenarEdad.addActionListener((ActionListener)this);
        
        btnBuscarPerro = new JButton("Buscar Perro");
        btnBuscarPerro.setActionCommand(BUSCAR_PERRO);
        btnBuscarPerro.addActionListener((ActionListener)this);
        
        JPanel pnlBotones = new JPanel();
        pnlBotones.setBorder(new EmptyBorder(40,3,40,3));
        GroupLayout grupo = new GroupLayout(pnlBotones);
        pnlBotones.setLayout(grupo);
        
        
        grupo.setAutoCreateContainerGaps(true);
        grupo.setAutoCreateGaps(true);
        
        //Set Horizontal
        grupo.setHorizontalGroup(
                grupo.createSequentialGroup()
                   .addGroup(
                           grupo.createParallelGroup()
                           .addComponent(btnOrdenarRaza)
                           .addComponent(btnOrdenarPuntos)
                           .addComponent(btnOrdenarEdad)
                           .addComponent(btnBuscarPerro)
                   )
        );
        
        grupo.linkSize(SwingConstants.HORIZONTAL, btnOrdenarRaza, btnOrdenarPuntos, btnOrdenarEdad, btnBuscarPerro);
        //Set Vertical
        grupo.setVerticalGroup(
                grupo.createSequentialGroup()
                .addGroup(
                        grupo.createParallelGroup()
                        .addComponent(btnOrdenarRaza)
                )
                
                .addGroup(
                        grupo.createParallelGroup()
                        .addComponent(btnOrdenarPuntos)
                )
                
                .addGroup(
                        grupo.createParallelGroup()
                        .addComponent(btnOrdenarEdad)
                )
                
                .addGroup(
                        grupo.createParallelGroup()
                        .addComponent(btnBuscarPerro)
                )
        );
        
        this.add(pnlBotones, BorderLayout.CENTER);
        
    }  
    // -------------------------------------------------------------------------
    // Metodos
    // -------------------------------------------------------------------------

    /**
     * Metodo que escucha los eventos de los botones.
     * @param e Comando generado por el evento. e != null.
     */
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }
    
    
    
}
