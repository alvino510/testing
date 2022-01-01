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
public class CelsiusF implements Hitung{
    
    private double suhucf;

    public CelsiusF ( double inisuhucf)
    {
	
	suhucf = inisuhucf;
        
    }
    
    public void hitung ()
    {
	System.out.println ("Convert a Celcius with temperature "+suhucf+" °C");
    }

    public double getSuhucf() {
        return suhucf;
    }

    public void setSuhucf(double suhucf) {
        this.suhucf = suhucf;
    }
    
}
