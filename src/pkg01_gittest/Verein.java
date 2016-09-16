/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_gittest;

import java.util.Vector;

/**
 *
 * @author schueler
 */
public class Verein {
    private String stadt;
    private int budget;
    private Vector<Fussballer> spieler;

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Vector<Fussballer> getSpieler() {
        return spieler;
    }

    public void setSpieler(Vector<Fussballer> spieler) {
        this.spieler = spieler;
    }

    public Verein(String stadt, int budget, Vector<Fussballer> spieler) {
        this.stadt = stadt;
        this.budget = budget;
        this.spieler = spieler;
    }
}
