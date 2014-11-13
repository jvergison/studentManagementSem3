/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.view;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Jonas
 */
public class InvoerPanel extends JPanel {
    JComboBox<String> partimSelector;
    JTable table;
    public InvoerPanel(){
        partimSelector = new JComboBox<>();
        
        this.add(partimSelector);
    }
}
