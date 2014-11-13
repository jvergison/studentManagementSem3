/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.model;

import java.sql.Connection;

/**
 *
 * @author Jonas
 */
public class Database {
    private Connection connection;
    
    public Database(){
        connection = DAO.getInstance().getConnection();
    }
    
    //implement DB selects here
    
}
