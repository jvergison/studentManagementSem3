/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groep14java.model;

/**
 *
 * @author Jonas
 */
public class Indicator {
    String naam;
    int id;
    int score;
    
    public Indicator(int id, String naam, int score)
    {
        this.id = id;
        this.naam = naam;
        this.score = score;
    }
}
