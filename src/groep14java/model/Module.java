/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.model;

import java.util.List;

/**
 *
 * @author Jonas
 */
public class Module {
    String naam;
    List<Partim> partimLijst;
    
    public Module(String naam){
        this.naam = naam;
    }
    
    public Module(String naam, List<Partim> pl){
        this.naam = naam;
        this.partimLijst = pl;
    }
}
