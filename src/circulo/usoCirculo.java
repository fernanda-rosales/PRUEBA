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
public class usoCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c1=new Circulo(20);
        Circulo c2=new Circulo(30);
        double a1,a2;
        a1=c1.calculararea();
        a2=c2.calculararea();
        System.out.println(c1.toString()+"\nArea="+a1);
         System.out.println(c2.toString()+"\nArea="+a2);
        
    }
     
}
