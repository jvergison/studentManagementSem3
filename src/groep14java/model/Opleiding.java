/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.model;


import java.util.List;

/**
 *
 * @author Pherione
 */
public class Opleiding {
    String naam;
    List<Module> moduleLijst;
    public Opleiding(String naam)
    {
        this.naam = naam;
    }
    
    public Opleiding(String naam, List<Module> ml)
    {
        this.naam = naam;
        this.moduleLijst = ml;
    }
}
