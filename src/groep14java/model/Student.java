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
public class Student {
    String familieNaam, voornaam;
    int id;
    List<Indicator> indicatoren;
    
    public Student(int id, String familieNaam, String voornaam)
    {
        this.id = id;
        this.familieNaam = familieNaam;
        this.voornaam = voornaam;
    }
    
    public Student(int id, String familieNaam, String voornaam, List<Indicator> ind)
    {
        this.id = id;
        this.familieNaam = familieNaam;
        this.voornaam = voornaam;
        this.indicatoren = ind;
    }
    
}
