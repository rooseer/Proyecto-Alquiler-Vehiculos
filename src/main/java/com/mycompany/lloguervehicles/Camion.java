/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lloguervehicles;

/**
 *
 * @author Admin
 */
public class Camion extends Vehicle {
    private  float pma;

    public Camion(float pma, String matricula, String color, String fabricant) {
        super(matricula, color, fabricant);
        this.pma = pma;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Tonelaje: " + pma;
    }

    @Override
    public float alquiler(int dias) {
        return super.alquiler(dias) + (20f * pma); 
    }
    
}
