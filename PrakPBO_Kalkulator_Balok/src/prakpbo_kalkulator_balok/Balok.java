/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakpbo_kalkulator_balok;

/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
public double tinggi;  
 
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

   
   

    @Override
    public double LP() {
        
        return 2*(panjang * lebar + panjang * tinggi + lebar * tinggi) ;
                
    }

    @Override
    public double volume() {
            
      
       return panjang*lebar*tinggi ;
        
        
    }

  

    
}