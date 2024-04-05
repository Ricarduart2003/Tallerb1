/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerclase;
/**
 *
 * @author laptop
 */
public class mainCuadrado {
    public static void main(String[]args){
    Cuadrado cuadrado=new Cuadrado();
    cuadrado.setLado(5);
    cuadrado.CalcularArea();
    cuadrado.CalcularPeri();
    
    System.out.println("Area del cuadrado es:"+cuadrado.getArea());
    System.out.println("Perimetro del cuadrado es:"+cuadrado.getPerimetro());
    
    }
    
    
}
