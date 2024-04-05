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
public class Cuadrado {
    
    private double lado;
    private double area;
    private double perimetro;
    
    public double getLado(){
    return lado;
    
    }
    public void setLado(double lado){
    this.lado=lado;
    }
    public double getArea(){
    return area;
    }
    public void setArea(){
    this.area=area;
    }
    public double getPerimetro(){
    return perimetro;
    }
    public void setPerimetro(){
    this.perimetro=perimetro;
    }
    
    public void CalcularArea(){
    area=lado*lado;
    }
    public void CalcularPeri(){
    perimetro=4*lado;
    }
     
}
