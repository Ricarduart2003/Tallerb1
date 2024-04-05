/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerclase;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
import java.time.Period;
/**
 *
 * @author laptop
 */
public class Persona {
    private LocalDate fechanacimiento;
    
    public LocalDate getfechanacimiento(){
    return fechanacimiento;
    }
    
    public void setFechanacimiento(LocalDate fechanacimiento){
        this.fechanacimiento=fechanacimiento;
    
    
    }
    public void calcular(){
    LocalDate fechaActual=LocalDate.now();
    Period periodo=Period.between(fechanacimiento, fechaActual);
    int años=periodo.getYears();
    int meses=periodo.getMonths();
    int Dias=periodo.getDays();
    System.out.println("Edad "+años+" Años  "+meses+"  Meses "+Dias+"  Dias");
    }
    
    public static void main(String[]args){
    Persona persona=new Persona();
    
    persona.setFechanacimiento(LocalDate.of(2003, 1, 20));
    persona.calcular();
    
    }
    
    
    
}
