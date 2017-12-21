/**
 * 
 */
package View;

import Controller.Controlador;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 * Clase que representa el Panel Consultas Exposición.
 * @author Cristhian Eduardo Castillo Erazo.
 */
public class PanelConsultas extends JPanel implements ActionListener
{
    // -------------------------------------------------------------------------
    // Constantes
    // -------------------------------------------------------------------------
    
    /**
     * Comando agregado al boton Ganador.
     */
    public static final String GANADOR = "Ganador";
    
    /**
     * Comando agregado al boton Menor Puntaje.
     */
    public static final String MENOR_PUNTAJE = "MenorPuntaje";
    
    /**
     * Comando agregado al boton Mas Viejo.
     */
    public static final String MAS_VIEJO = "MasViejo";
    
    // -------------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------------
    
    /**
     * Boton Ganador.
     */
    private final JButton btnGanador;
    
    /**
     * Boton Menor Puntaje.
     */
    private final JButton btnMenorPuntaje;
    
    /**
     * Boton Mas Viejo.
     */
    private final JButton btnMasViejo;
    
    /**
     * Controlador principal de la aplicación.
     */
    private final Controlador ctrl;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Construye el Panel Consultas.
     * @param ctrl Controlador principal de la aplicación.
     */
    public PanelConsultas (Controlador ctrl)
    {
        this.ctrl = ctrl;
        this.setBorder(new CompoundBorder(new EmptyBorder(4,3,3,3), new TitledBorder("Consultas Exposición")));
        this.setLayout(new GridLayout(5, 1, 10, 10));
        
        //Creacion componentes.
        
        btnGanador = new JButton("Ganador");
        btnGanador.setActionCommand(GANADOR);
        btnGanador.addActionListener((ActionListener)this);
        
        btnMenorPuntaje = new JButton("Menor Puntaje");
        btnMenorPuntaje.setActionCommand(MENOR_PUNTAJE);
        btnMenorPuntaje.addActionListener((ActionListener)this);
        
        btnMasViejo = new JButton("Más Viejo");
        btnMasViejo.setActionCommand(MAS_VIEJO);
        btnMasViejo.addActionListener((ActionListener)this);
        
        this.add(btnGanador);
        this.add(btnMenorPuntaje);
        this.add(btnMasViejo);
       
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
        
        if(comando.equalsIgnoreCase(GANADOR))
        {
            try
            {
                ctrl.buscarGanador();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Ganador", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            if(comando.equalsIgnoreCase(MENOR_PUNTAJE))
            {
                try
                {
                    ctrl.buscarPerdedor();
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Menor Puntaje", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                if(comando.equalsIgnoreCase(MAS_VIEJO))
                {
                    try
                    {
                        ctrl.buscarMasViejo();
                    }
                    catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Más Viejo", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }
}
