/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lloguervehicles;

/**
 *
 * @author Admin
 */
public class Bicicleta extends Vehicle{
    private boolean electric;

    public Bicicleta(boolean electric, String matricula, String color, String fabricant) {
        super(matricula, color, fabricant);
        this.electric = electric;
    }

    @Override
    public float alquiler(int dias) {
        if (electric)return super.alquiler(dias) +(15); 
        else{
            return super.alquiler(dias) +(10);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n Electrica: " + electric;
    }
    
}
