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
public class KelvinR implements Hitung{
    
    private double suhukr;

    public KelvinR ( double inisuhukr)
    {
	
	suhukr = inisuhukr;
    }
    
    public void hitung ()
    {
	System.out.println ("Convert a Kelvin with temperature "+suhukr+" °K");
    }

    public double getSuhukr() {
        return suhukr;
    }

    public void setSuhukr(double suhukr) {
        this.suhukr = suhukr;
    }
    
}
