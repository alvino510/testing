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
public class FarenheitK implements Hitung{
    
    private double suhufk;

    public FarenheitK ( double inisuhufk)
    {
	
	suhufk = inisuhufk;
    }
    
    public void hitung ()
    {
	System.out.println ("Convert a Farenheit with temperature "+suhufk+" °F");
    }

    public double getSuhufk() {
        return suhufk;
    }

    public void setSuhufk(double suhufk) {
        this.suhufk = suhufk;
    }
    
}
