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
public class CelsiusK implements Hitung{
    
    private double suhuck;

    public CelsiusK ( double inisuhuck)
    {
	
	suhuck = inisuhuck;
        
    }
    
    public void hitung ()
    {
	System.out.println ("Convert a Celcius with temperature "+suhuck+" °C");
    }

    public double getSuhuck() {
        return suhuck;
    }

    public void setSuhuck(double suhuck) {
        this.suhuck = suhuck;
    }
    
}
