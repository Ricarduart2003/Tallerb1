/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerclase;

/**
 *
 * @author laptop
 */
public class MainCirculo {
    
     public static void main(String[]args){
    Circulo circulo=new Circulo();
    circulo.setRadio(5);
    circulo.CalcularArea();
    circulo.CalcularPeri();
    
    System.out.println("Area del Circulo es:"+circulo.getArea());
    System.out.println("Perimetro del Circulo es:"+circulo.getPerimetro());
    
    }
    
}
