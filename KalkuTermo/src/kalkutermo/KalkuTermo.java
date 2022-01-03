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
public class KalkuTermo {
    public double calculateSuhu(Hitung hitung){
      double suhu=0;
      //celsius
      if(hitung instanceof CelsiusR){
             CelsiusR celsiusr=(CelsiusR) hitung;
             suhu= 0.8*celsiusr.getSuhucr();
      }
      else if(hitung instanceof CelsiusF){
             CelsiusF celsiusf=(CelsiusF) hitung;
             suhu= 1.8*celsiusf.getSuhucf()+32;
      }
      else if(hitung instanceof CelsiusK){
             CelsiusK celsiusk=(CelsiusK) hitung;
             suhu=celsiusk.getSuhuck()+273.15;
      }
      //farenheit
      else if(hitung instanceof FarenheitC){
        FarenheitC farenheitc=(FarenheitC) hitung;
        suhu=(farenheitc.getSuhufc()-32)/1.8;
      }
      else if(hitung instanceof FarenheitR){
        FarenheitR farenheitr=(FarenheitR) hitung;
        suhu=(farenheitr.getSuhufr()-32)/2.25;
      }
      else if(hitung instanceof FarenheitK){
        FarenheitK farenheitk=(FarenheitK) hitung;
        suhu=(farenheitk.getSuhufk()+459.67)/1.8;
      }
      //reamur
      else if(hitung instanceof ReamurC){
        ReamurC reamurc=(ReamurC) hitung;
        suhu=reamurc.getSuhurc()/0.8;
      }
      else if(hitung instanceof ReamurF){
        ReamurF reamurf=(ReamurF) hitung;
        suhu=(reamurf.getSuhurf()*2.25)+32;
      }
      else if(hitung instanceof ReamurK){
        ReamurK reamurk=(ReamurK) hitung;
        suhu=(reamurk.getSuhurk()/0.8)+273.15;
      }
      //kelvin
      else if(hitung instanceof KelvinC){
        KelvinC kelvinc=(KelvinC) hitung;
        suhu=kelvinc.getSuhukc()-273.15;
      }
      else if(hitung instanceof KelvinR){
        KelvinR kelvinr=(KelvinR) hitung;
        suhu=(kelvinr.getSuhukr()-273.15)*0.8;
      }
      else if(hitung instanceof KelvinF){
        KelvinF kelvinf=(KelvinF) hitung;
        suhu=(kelvinf.getSuhukf()*1.8)-459.67;
      }
      return suhu;
  } 
  
  public static void main(String args[]){
      //celsius
      CelsiusR celsiusr=new CelsiusR(20);
      CelsiusF celsiusf=new CelsiusF(20);
      CelsiusK celsiusk=new CelsiusK(20);
      //reamur
      ReamurC reamurc=new ReamurC(30);
      ReamurF reamurf=new ReamurF(30);
      ReamurK reamurk=new ReamurK(30);
      //farenheit
      FarenheitC farenheitc=new FarenheitC(90);
      FarenheitR farenheitr=new FarenheitR(90);
      FarenheitK farenheitk=new FarenheitK(90);
      //kelvin
      KelvinC kelvinc=new KelvinC(500);
      KelvinR kelvinr=new KelvinR(500);
      KelvinF kelvinf=new KelvinF(500);
      
      
      KalkuTermo tempObj=new KalkuTermo();
      //celsius
      System.out.println("Convert dari Celcius ke Remur : "+tempObj.calculateSuhu(celsiusr));
      System.out.println("Convert celsius to farenheit : "+tempObj.calculateSuhu(celsiusf));
      System.out.println("Convert celsius to kelvin : "+tempObj.calculateSuhu(celsiusk));
      //reamur
      System.out.println("Convert reamur to celsius : "+tempObj.calculateSuhu(reamurc));
      System.out.println("Convert reamur to farenheit : "+tempObj.calculateSuhu(reamurf));
      System.out.println("Convert reamur to kelvin : "+tempObj.calculateSuhu(reamurk));
      //farenheit
      System.out.println("Convert farenheit to celsius : "+tempObj.calculateSuhu(farenheitc));
      System.out.println("Convert farenheit to reamur : "+tempObj.calculateSuhu(farenheitr));
      System.out.println("Convert farenheit to kelvin : "+tempObj.calculateSuhu(farenheitk));
      //kelvin
      System.out.println("Convert kelvin to celsius : "+tempObj.calculateSuhu(kelvinc));
      System.out.println("Convert kelvin to reamur : "+tempObj.calculateSuhu(kelvinr));
      System.out.println("Convert kelvin to farenheit : "+tempObj.calculateSuhu(kelvinf));
  }
}
