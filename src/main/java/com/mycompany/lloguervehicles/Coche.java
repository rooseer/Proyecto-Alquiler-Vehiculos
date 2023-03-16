/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lloguervehicles;

/**
 *
 * @author Admin
 */
public class Coche extends Vehicle{
    private  int plazas;
    private final float suplement = 1.5F;

    public Coche(int plazas, String matricula, String color, String fabricant) {
        super(matricula, color, fabricant);
        this.plazas = plazas;
    }

    @Override
    public float alquiler(int dias) {
        return super.alquiler(dias) + (suplement * plazas * dias); 
    }

    @Override
    public String toString() {
        return super.toString() + "\n numero plazas: " + plazas;
    }
  
    
}
