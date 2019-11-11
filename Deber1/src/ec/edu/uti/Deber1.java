/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uti;

/**
 *
 * @author hp
 */
public class Deber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero1 =15;
        double valorabsoluto = Math.abs(numero1);
        System.out.println("valor absoluto de numero1 es");
        System.out.println(valorabsoluto);
        
        int numero2 =-25;
        double sin = Math.sin(numero2);
        System.out.println("sin de -25 es");
           System.out.println(sin);
           
           int numero3 =50;
           double cos = Math.cos(numero3);
           System.out.println("cos de 50 es");
           System.out.println(cos);
           
           int numero4 =5;
           double exp = Math.exp(numero4);
           System.out.println("exp numero4 es");
           System.out.println(exp);
           
           int numero5 =34;
           double log = Math.log(numero5);
           System.out.println("log de numero5 es");
           System.out.println(log);
           
           int numero6 =125;
                   double log10 = Math.log10(numero6);
                   System.out.println("log10 de numero6 es");
                   System.out.println(log10);
                   
                   int numero7 =629;
                   double round = Math.round(numero7);
                   System.out.println("round de numero7");
                   System.out.println(round);
                   
           int numero8 =81;
           double sqrt = Math.sqrt(numero8);
           System.out.println("sqrt de numero8 es");
           System.out.println(sqrt);
           
           int a =4;
           int b =36;
        double pow = Math.pow(b,a);
        System.out.println("pow de (b,a)es");
        System.out.println(pow);
        
        double numero = Math.random();
        System.out.println(numero);
        
        double subtotal =50;
        System.out.println("el iva de 50 es");
        System.out.println(subtotal*0.12);
        
        System.out.println("el precio total de 33.55 es");
        System.out.println(subtotal+(33.55*0.12));
        
        
        
    }
    
}
