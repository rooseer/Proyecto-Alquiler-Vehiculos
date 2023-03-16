/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lloguervehicles;

/**
 *
 * @author Admin
 */
public abstract class Vehicle {
    private String matricula;
    private String color;
    private String fabricant;
    private final int preuBase = 50;

    public Vehicle(String matricula, String color, String fabricant) {
        this.matricula = matricula;
        this.color = color;
        this.fabricant = fabricant;
    }
    
    
    public float alquiler(int dias){
        return preuBase *dias ;
    }

    public String getMatricula() {
        return matricula;
    }
   
    public String toString(){
        return "Matricula: " + matricula + "\nColor: " + color + "\n Fabricante: " + fabricant;
    }
   
    
}
