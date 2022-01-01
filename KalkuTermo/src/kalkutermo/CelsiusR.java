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
public class CelsiusR implements Hitung{
    
    private double suhucr;

    public CelsiusR ( double inisuhucr)
    {
	
	suhucr = inisuhucr;
        
    }
    
    public void hitung ()
    {
	System.out.println ("Convert a Celcius with temperature "+suhucr+" °C");
    }

    public double getSuhucr() {
        return suhucr;
    }

    public void setSuhucr(double suhucr) {
        this.suhucr = suhucr;
    }

    

    
}
