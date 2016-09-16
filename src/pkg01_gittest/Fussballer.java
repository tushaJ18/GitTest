/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_gittest;

/**
 *
 * @author schueler
 */
public class Fussballer {

    public SchussFuss getSf() {
        return sf;
    }

    public void setSf(SchussFuss sf) {
        this.sf = sf;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public Fussballer(SchussFuss sf, String land) {
        this.sf = sf;
        this.land = land;
    }
    private  SchussFuss sf;
    private String land;
      
}
