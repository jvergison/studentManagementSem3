/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.view;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * Panel visible on CompetentieProfiel
 * 
 * @author Jonas
 */

//profielpanel should update whenever the model reports to reflect the changes made, hence observer
public class ProfielPanel extends JPanel implements Observer {
    JTree profileTree; 
    DefaultMutableTreeNode top;
    
    public ProfielPanel ()
    {
        
        top = new DefaultMutableTreeNode("Competenties");
        profileTree = new JTree(top);
        profileTree.setEditable(true);
        this.add(profileTree);
        populateTree();
    }
    
    public void populateTree()
    {
        
        //TODO: populate the tree according to the database
    }

    @Override
    public void update(Observable o, Object arg) {
        this.removeAll();
        top = new DefaultMutableTreeNode("Competenties");
        profileTree = new JTree(top);
        profileTree.setEditable(true);
        this.add(profileTree);
        populateTree();
    }
}
