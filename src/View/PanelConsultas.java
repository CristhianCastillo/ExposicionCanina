/**
 * 
 */
package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
    private JButton btnGanador;
    
    /**
     * Boton Menor Puntaje.
     */
    private JButton btnMenorPuntaje;
    
    /**
     * Boton Mas Viejo.
     */
    private JButton btnMasViejo;
    
    // -------------------------------------------------------------------------
    // Constructores
    // -------------------------------------------------------------------------
    
    /**
     * Construye el Panel Consultas.
     */
    public PanelConsultas ()
    {
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

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
