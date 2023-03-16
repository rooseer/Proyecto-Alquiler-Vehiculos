/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lloguervehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LloguerVehicles {
    private static ArrayList<Vehicle> listaVehiculos = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        boolean quit = false;
        do{
            menu();
            System.out.print("> ");
            String respuesta = consola.readLine();
            int respuesta1 =  Integer.parseInt(respuesta);
            switch(respuesta1){
                case 1:
                    nuevoVehiculo();
                    break;
                case 2:
                    mostrarFlota();
                    break;
                case 3:
                    alquilarVehiculo();
                    break;
                default:
                    System.out.println("No es una opcion valida");
                    break;
            }
        }while(!quit);
    }
     public static String demanarCadenaNoBuida(String missatge) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String cadena;
        do {
            System.out.print(missatge);
            cadena = entrada.readLine();
            if (cadena.isBlank()) {
                System.out.println("Error, no se puede dejar el campo vacio.");

            }
        } while (cadena.isBlank());
        return cadena;
    }
     public static int demanarEnter(String missatge) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        boolean error = false;
        do {
            try {
                System.out.print(missatge);
                numero = Integer.parseInt(entrada.readLine());
                error = false;
            } catch (NumberFormatException ex) {
                System.out.println("Has d'introduir un número");
                error = true;
            }
        } while (error);
        return numero;
    }
    
    public static void  menu(){
        System.out.println("----Menu----");
        System.out.println(" 1 : Nuevo vehiculo");
        System.out.println(" 2 : Mostrar flota");
        System.out.println(" 3 : Alquiler vehiculo");
        System.out.println(" 4 : Salir");
    }
    public static void nuevoVehiculo() throws IOException{
        String matricula = demanarCadenaNoBuida("Matricula: ");
        String color = demanarCadenaNoBuida("Color: ");
        String fabricant = demanarCadenaNoBuida("Fabricante: ");
        String tipusVehicle = demanarCadenaNoBuida("Que tipo de Vehiculo quieres añadir? ");
        if (tipusVehicle.equalsIgnoreCase("coche")){
            String plazas = demanarCadenaNoBuida("Cuantas plazas tiene?  ");
            int intPlazas =  Integer.parseInt(plazas);
            Coche miCoche = new Coche (intPlazas, matricula, color, fabricant);
            listaVehiculos.add(miCoche);
        }
        if (tipusVehicle.equalsIgnoreCase("moto")){
            String cilindrada = demanarCadenaNoBuida("Cuantas cilindrada tiene?  ");
            int intCilindrada =  Integer.parseInt(cilindrada);
            Moto miMoto = new Moto (intCilindrada, matricula, color, fabricant);
            listaVehiculos.add(miMoto);
        }
        if (tipusVehicle.equalsIgnoreCase("camion")){
            String pma = demanarCadenaNoBuida("Indica la pma del camion:  ");
            float floatPma =  Float.parseFloat(pma);
            Camion miCamion = new Camion (floatPma, matricula, color, fabricant);
            listaVehiculos.add(miCamion);
        }
        if (tipusVehicle.equalsIgnoreCase("bicicleta")){
            String electrica = demanarCadenaNoBuida("La bicicleta es electrica? :  ");
            boolean electric = false;
            if(electrica.equalsIgnoreCase("si")){
                electric = true;
            }
            if(electrica.equalsIgnoreCase("no")){
                electric = false;
            }
            Bicicleta miBicicleta = new Bicicleta (electric, matricula, color, fabricant);
            listaVehiculos.add(miBicicleta);
        }
    }
    
        public static void mostrarFlota(){
            
            for (int i = 0; i < listaVehiculos.size(); i++) {
                System.out.println(listaVehiculos.get(i).toString());
            }
     
        }
        public static Vehicle encontrarVehiculo(String matricula){
            for(int i=0; i < listaVehiculos.size();i ++){
                if(listaVehiculos.get(i).getMatricula().equalsIgnoreCase(matricula))
                    return listaVehiculos.get(i);
            }
            return null;
        }
        public static void alquilarVehiculo() throws IOException{
            String matricula = demanarCadenaNoBuida("Indica la matricula del vehiculo que quieres alquilar: ");
            int dias = demanarEnter("Cuantos dias vas a alquilarlo: ");
            Vehicle vehiculo = encontrarVehiculo(matricula);
    
            if(vehiculo == null){
                System.out.println("No se encontró un vehículo con esa matrícula");
                return;
            }else{
                System.out.println("El vehiculo "+ vehiculo.getMatricula()+ " ha sido alquilado "+ dias + " dias y costara: "+ vehiculo.alquiler(dias) + "€");
            }
            
        }
}

        
   


