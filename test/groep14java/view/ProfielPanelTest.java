/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.view;

import java.util.Observable;
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
public class ProfielPanelTest {
    
    public ProfielPanelTest() {
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
     * Test of populateTree method, of class ProfielPanel.
     */
    @Test
    public void testPopulateTree() {
        System.out.println("populateTree");
        ProfielPanel instance = new ProfielPanel();
        instance.populateTree();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ProfielPanel.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observable o = null;
        Object arg = null;
        ProfielPanel instance = new ProfielPanel();
        instance.update(o, arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}