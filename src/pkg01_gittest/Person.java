/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_gittest;

import java.util.Date;

/**
 *
 * @author schueler
 */
public class Person {
    private String name;
    private Date gebDatum;

    public Person(String name, Date gebDatum, int svNr) {
        this.name = name;
        this.gebDatum = gebDatum;
        this.svNr = svNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(Date gebDatum) {
        this.gebDatum = gebDatum;
    }

    public int getSvNr() {
        return svNr;
    }

    public void setSvNr(int svNr) {
        this.svNr = svNr;
    }
    private int svNr;
    
}
