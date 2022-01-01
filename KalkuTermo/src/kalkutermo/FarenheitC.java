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
public class FarenheitC implements Hitung{
    
    private double suhufc;

    public FarenheitC ( double inisuhufc)
    {
	
	suhufc = inisuhufc;
    }
    
    public void hitung ()
    {
	System.out.println ("Convert a Farenheit with temperature "+suhufc+" °F");
    }

    public double getSuhufc() {
        return suhufc;
    }

    public void setSuhufc(double suhufc) {
        this.suhufc = suhufc;
    }
    
}
