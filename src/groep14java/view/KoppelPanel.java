/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author Jonas
 */
public class KoppelPanel extends JPanel {
    JComboBox<String> indicatorSelection;
    JComboBox<String> partimSelection;
    JButton connect;
    public KoppelPanel() {
        indicatorSelection = new JComboBox<>();
        partimSelection = new JComboBox<>();
        connect = new JButton("Koppel/Ontkoppel");
        
        this.add(indicatorSelection);
        this.add(partimSelection);
        this.add(connect);
    }
    
}
