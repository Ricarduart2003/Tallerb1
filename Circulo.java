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
public class Circulo {
    private double radio;
    private double area;
    private double perimetro;
    
    public double getRadio(){
    return radio;
    }
    public void setRadio(double radio){
    this.radio=radio;
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
    area=Math.PI*radio*radio;
    }
    public void CalcularPeri(){
    perimetro=2*Math.PI*radio;
    }
    
    
    
}
