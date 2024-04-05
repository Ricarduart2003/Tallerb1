/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerclase;
import java.util.Scanner;
/**
 *
 * @author laptop
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private double area;
    private double perimetro;
    private double hipotenusa;
    
    public double getLado1(){
    return lado1;
    }
    public void setLado1(double lado1){
    this.lado1=lado1;
    }
    public double getLado2(){
    return lado2;
    }
    public void setLado2(double lado2){
    this.lado2=lado2;
    }
    public double getLado3(){
    return lado3;
    }
    public void setLado3(double lado3){
    this.lado3=lado3;
    }
    public double getArea(){
    return area;
    }
    public double getPerimetro(){
    return perimetro;
    }
    public double getHipotenusa(){
    return hipotenusa;
    }
    
    public void CalcularArea(){
    double L=(lado1+lado2+lado3)/2;
    area=Math.sqrt(L*(L-lado1)*(L-lado2)*(L-lado3));
    }
    public void CalcularPerimetro(){
    perimetro=lado1+lado2+lado3;
    }
    public void CalcularHipotenusa(){
    hipotenusa=Math.sqrt(lado1*lado1+lado2*lado2);
    }
    
    
    
}
