/**
 * 
 */
package View;

import Controller.Controlador;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
    private final JButton btnOrdenarRaza;
    
    /**
     * Boton Ordenar por Puntos.
     */
    private final JButton btnOrdenarPuntos;
    
    /**
     * Boton Ordenar por Edad.
     */
    private final JButton btnOrdenarEdad;
    
    /**
     * Boton Buscar Perro.
     */
    private final JButton btnBuscarPerro;
    
    /**
     * Controlador principal de la aplicacion.
     */
    private final Controlador ctrl;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Construye el Panel Búsqueda y ordenamiento.
     * @param ctrl Controlador principal de la aplicación.
     */
    public PanelBusquedaOrdenamientos(Controlador ctrl)
    {
        this.ctrl = ctrl;
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
        String comando = e.getActionCommand();
        
        if(comando.equalsIgnoreCase(ORDENAR_RAZA))
        {
            ctrl.ordenarExposicionPorRaza();
        }
        else
        {
            if(comando.equalsIgnoreCase(ORDENAR_PUNTOS))
            {
                ctrl.ordenarExposicionPorPuntos();
            }
            else
            {
                if(comando.equalsIgnoreCase(ORDENAR_EDAD))
                {
                    ctrl.ordenarExposicionPorEdad();
                }
                else
                {
                    if(comando.equalsIgnoreCase(BUSCAR_PERRO))
                    {
                        try
                        {
                            String nombrePerro = JOptionPane.showInputDialog(this, "Nombre del perro", "Buscar Perro", JOptionPane.INFORMATION_MESSAGE);
                            
                            if(nombrePerro == null)
                                throw new Exception("Busqueda cancelada por el usuario.");
                            
                            if(nombrePerro.trim().equalsIgnoreCase(""))
                                throw  new Exception("El nombre del perro no puede estar vacío.");
                            ctrl.buscarPerro(nombrePerro);
                        }
                        catch(Exception ex)
                        {
                            JOptionPane.showMessageDialog(this, ex.getMessage(), "Buscar Perro", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }
    }
    
    
    
}
