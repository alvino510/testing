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
public class FarenheitR implements Hitung{
    
    private double suhufr;

    public FarenheitR ( double inisuhufr)
    {
	
	suhufr = inisuhufr;
    }
    
    public void hitung ()
    {
	System.out.println ("Convert a Farenheit with temperature "+suhufr+" °F");
    }

    public double getSuhufr() {
        return suhufr;
    }

    public void setSuhufr(double suhufr) {
        this.suhufr = suhufr;
    }
    
}
