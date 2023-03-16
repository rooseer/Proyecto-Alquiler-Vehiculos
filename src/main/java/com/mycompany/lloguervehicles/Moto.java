/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lloguervehicles;

/**
 *
 * @author Admin
 */
public class Moto extends Vehicle {
    private int cilindrada;
    public Moto(int cilindrada, String matricula, String color, String fabricant) {
        super(matricula, color, fabricant);
        this.cilindrada = cilindrada;
    }

    @Override
    public float alquiler(int dias) {
        return super.alquiler(dias) +((cilindrada * 0.5f) * dias); 
    }

    @Override
    public String toString() {
        return super.toString() + "\n Cilindrada: "  + cilindrada; 
    }
    
   
    
}
