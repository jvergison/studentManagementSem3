/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonas
 */
public class DAO {
    
    private static DAO instance = new DAO();
    public static DAO getInstance(){
        return instance;
    }
    
    private Connection conn;
    
    private DAO(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost/studentvolgsysteem";
            conn = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Connection getConnection()
    {
        return conn;
    }
}
