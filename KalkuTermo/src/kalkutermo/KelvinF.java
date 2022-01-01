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
public class KelvinF implements Hitung{
    
    private double suhukf;

    public KelvinF ( double inisuhukf)
    {
	
	suhukf = inisuhukf;
    }
    
    public void hitung ()
    {
	System.out.println ("Convert a Kelvin with temperature "+suhukf+" °K");
    }

    public double getSuhukf() {
        return suhukf;
    }

    public void setSuhukf(double suhukf) {
        this.suhukf = suhukf;
    }
    
}
