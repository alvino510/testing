/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkutermo;

/**
 *
 * @author LENOVO
 */
public class ReamurK implements Hitung{
    
    private double suhurk;

    public ReamurK ( double inisuhurk)
    {
        suhurk = inisuhurk;
    }
    
    public void hitung ()
    {
        System.out.println ("Convert a Reamur with temperature "+suhurk+" °R");
    }

    public double getSuhurk() {
        return suhurk;
    }

    public void setSuhurk(double suhurk) {
        this.suhurk = suhurk;
    }
    
}
