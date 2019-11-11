/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author hp
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double subtotal =200;
        double total;
        double iva;
           double descuento = 15 ;
           if(subtotal<100){
               descuento = subtotal*5/100;
           }
           iva = subtotal *0.12;
                   total = subtotal+iva-descuento;
                   System.out.println("descuento es");
                    System.out.println(descuento);
                     System.out.println("total es");
                     System.out.println(total);
    }
    
}
