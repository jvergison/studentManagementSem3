/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.view;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pherione
 */
public class MainFrameTest {
    
    public MainFrameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of changeState method, of class MainFrame.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        //MainFrame.state s = null;
        MainFrame instance = new MainFrame();
        //instance.changeState(s);
        // TODO review the generated test code and remove the default call to fail.
        instance.changeState(MainFrame.state.INVOER);
        if(!instance.getTitle().equals("Student Volg Systeem - " + MainFrame.INVOERPANEL))
            fail("wrong title at test " + MainFrame.INVOERPANEL);
        
        instance.changeState(MainFrame.state.KOPPEL);
        if(!instance.getTitle().equals("Student Volg Systeem - " + MainFrame.KOPPELPANEL))
            fail("wrong title at test " + MainFrame.KOPPELPANEL);
        
        instance.changeState(MainFrame.state.OPVOLGING);
        if(!instance.getTitle().equals("Student Volg Systeem - " + MainFrame.OPVOLGINGPANEL))
            fail("wrong title at test " + MainFrame.OPVOLGINGPANEL);
        
        instance.changeState(MainFrame.state.PROFIEL);
        if(!instance.getTitle().equals("Student Volg Systeem - " + MainFrame.PROFIELPANEL))
            fail("wrong title at test " + MainFrame.PROFIELPANEL);
        
    }
}