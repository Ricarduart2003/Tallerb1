/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerclase;

/**
 *
 * @author laptop
 */
public class MainTriangulo {
    public static void main(String[]args){
    Triangulo triangulo=new Triangulo();
    
    triangulo.setLado1(6);
    triangulo.setLado2(5);
    triangulo.setLado3(8);
    triangulo.CalcularArea();
    triangulo.CalcularPerimetro();
    triangulo.CalcularHipotenusa();
    
    System.out.println("Area del Trinagulo es:"+triangulo.getArea());
    System.out.println("Perimetro del Trinagulo es:"+triangulo.getPerimetro());
    System.out.println("Hipotenusa del Trinagulo es:"+triangulo.getHipotenusa());
    
    }
}
