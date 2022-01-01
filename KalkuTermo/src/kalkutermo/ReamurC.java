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
public class ReamurC implements Hitung{
    
    private double suhurc;

    public ReamurC ( double inisuhurc)
    {
	
	suhurc = inisuhurc;
    }
    
    public void hitung ()
    {
	System.out.println ("Convert a Reamur with temperature "+suhurc+" °R");
    }

    public double getSuhurc() {
        return suhurc;
    }

    public void setSuhurc(double suhurc) {
        this.suhurc = suhurc;
    }

    
}
