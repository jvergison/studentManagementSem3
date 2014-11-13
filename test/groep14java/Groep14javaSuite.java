/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Pherione
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({groep14java.model.ModelSuite.class, groep14java.controller.ControllerSuite.class, groep14java.view.ViewSuite.class, groep14java.Groep14JavaTest.class})
public class Groep14javaSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}