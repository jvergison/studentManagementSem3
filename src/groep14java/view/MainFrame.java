/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.view;

import groep14java.controller.Controller;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


/**
 *
 * @author Jonas
 */
public class MainFrame extends JFrame {
        
    //TODO: create panels
    private MenuBar menuBar;
    JPanel cards;
    private ProfielPanel profielPanel;
    private KoppelPanel koppelPanel;
    private InvoerPanel invoerPanel;
    private OpvolgingPanel opvolgingPanel;
    
    static enum state {
        PROFIEL,KOPPEL,INVOER,OPVOLGING
    }
    static String PROFIELPANEL = "profielPanel";
    static String KOPPELPANEL = "koppelPanel";
    static String INVOERPANEL = "invoerPanel";
    static String OPVOLGINGPANEL = "opvolgingPanel";
    
    Controller controller;
    public MainFrame()
    {
        controller = new Controller();
        setTitle("Student Volg Systeem"); //Put Title on top of JFrame
        
        initializeMenuBar();
        
        initializePanels();
        
        setSize(new Dimension(700, 700));
        setVisible(true);             
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void initializeMenuBar()
    {
        menuBar = new MenuBar(this);
        this.setJMenuBar(menuBar);
    }
    
    private void initializePanels()
    {
        cards = new JPanel(new CardLayout());
        profielPanel = new ProfielPanel();
        koppelPanel = new KoppelPanel();
        invoerPanel = new InvoerPanel();
        opvolgingPanel = new OpvolgingPanel();
        
        
        cards.add(profielPanel, PROFIELPANEL);
        cards.add(koppelPanel, KOPPELPANEL);
        cards.add(invoerPanel, INVOERPANEL);
        cards.add(opvolgingPanel, OPVOLGINGPANEL);
        
        this.getContentPane().add(cards); 
    }
    
    public void changeState(state s)
    {
        CardLayout cl = (CardLayout)(cards.getLayout());
        
        switch(s)
        {
            case PROFIEL:
                setTitle("Student Volg Systeem - " + PROFIELPANEL);
                cl.show(cards, PROFIELPANEL);
                break;
            case KOPPEL:
                setTitle("Student Volg Systeem - " + KOPPELPANEL);
                cl.show(cards, KOPPELPANEL);
                break;
            case INVOER:
                setTitle("Student Volg Systeem - " + INVOERPANEL);
                cl.show(cards, INVOERPANEL);
                break;
            case OPVOLGING:
                setTitle("Student Volg Systeem - " + OPVOLGINGPANEL);
                cl.show(cards, OPVOLGINGPANEL);
                break;
        }
        
    }
    
}
