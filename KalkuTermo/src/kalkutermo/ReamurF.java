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
public class ReamurF implements Hitung{
   
    private double suhurf;

    public ReamurF ( double inisuhurf)
    {
        suhurf = inisuhurf;
    }
    
    public void hitung ()
    {
        System.out.println ("Convert a Reamur with temperature "+suhurf+" °R");
    }

    public double getSuhurf() {
        return suhurf;
    }

    public void setSuhurf(double suhurf) {
        this.suhurf = suhurf;
    }
    
}
