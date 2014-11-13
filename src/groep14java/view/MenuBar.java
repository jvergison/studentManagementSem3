/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

/**
 *
 * @author Jonas
 */
public class MenuBar extends JMenuBar {
    
    JMenu progressieMenu;
    JMenuItem invoerItem, overzichtItem, competentieProfielItem, koppelingItem, aboutItem;
    
    MainFrame parent;
    
    public MenuBar(MainFrame parent){
        this.parent = parent;
        buildMenu();
        addActionListeners();
        
    }
    
    public void buildMenu()
    {
        
        competentieProfielItem = new JMenuItem("<html><p style='text-align:center;width:90px;color:#4F4560;'>CompetentieProfiel</p></html>");
        competentieProfielItem.setMnemonic('c');
        koppelingItem = new JMenuItem("<html><p style='text-align:center;width:90px;color:#4F4560;'>Koppeling</p></html>");
        koppelingItem.setMnemonic('k');
        
        progressieMenu = new JMenu("<html><p style='text-align:center;width:90px;color:#4F4560;'>Progressie</p></html>");
        progressieMenu.setMnemonic('p');
        invoerItem = new JMenuItem("<html><p style='text-align:center;width:90px;color:#4F4560;'>Invoer</p></html>");
        invoerItem.setMnemonic('i');
        overzichtItem = new JMenuItem("<html><p style='text-align:center;width:90px;color:#4F4560;'>Overzicht</p></html>");
        overzichtItem.setMnemonic('o');
        
        aboutItem = new JMenuItem("<html><p style='text-align:center;width:90px;color:#4F4560;'>About</p></html>");
        aboutItem.setMnemonic('a');
        
        this.add(competentieProfielItem);
        this.add(koppelingItem);
        
        progressieMenu.add(invoerItem);
        progressieMenu.add(overzichtItem);
        
        this.add(progressieMenu);
        this.add(new JSeparator());
        this.add(aboutItem);
        
    }
    
    private void addActionListeners(){
        
        competentieProfielItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changeState(MainFrame.state.PROFIEL);
            }
        });
        
        koppelingItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changeState(MainFrame.state.KOPPEL);
            }
        });
        
        invoerItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changeState(MainFrame.state.INVOER);
            }
        });
        
        overzichtItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changeState(MainFrame.state.OPVOLGING);
            }
        });
        
        aboutItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(parent,
                     "This application manages several \n students on their specific tracks within their training.\n Developed by Vergison Jonas, De Moor Ken, De Bie Geoffrey and Valcke Sander.\n 2013-2014","About" , JOptionPane.QUESTION_MESSAGE);
            }
        });
        
        
    }
}
