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
public class KelvinC implements Hitung{
    
    private double suhukc;

    public KelvinC ( double inisuhukc)
    {
	
	suhukc = inisuhukc;
    }
    
    public void hitung ()
    {
	System.out.println ("Convert a Kelvin with temperature "+suhukc+" °K");
    }

    public double getSuhukc() {
        return suhukc;
    }

    public void setSuhukc(double suhukc) {
        this.suhukc = suhukc;
    }
    
}
