/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circulo;

/**
 *
 * @author Laboratorio
 */
public class Circulo {

   private double radio;
   private double pi;
   
    /**
     *
     */
    public Circulo()
   {
       radio=0;
       pi=3.1416;
    }

    /**
     *
     * @param radio
     */
    public Circulo(double radio)
   {
   this.radio=radio;
   pi=3.1416;
   }

    /**
     *
     * @return
     */
    public double calculararea()
   {
       return pi*Math.pow(radio,2);
   }

    /**
     *
     * @return
     */
    @Override
   public String toString()
           {
    return "circunferancia con radio ="+radio+"\npi:"+pi;
      }
    
}
