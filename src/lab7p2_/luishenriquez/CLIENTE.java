/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_.luishenriquez;


public class CLIENTE {

private String nombrec;

private int edad;

private int carrosC;

private int sueldo;

    public CLIENTE(String nombrec, int edad, int carrosC, int sueldo) {
        this.nombrec = nombrec;
        this.edad = edad;
        this.carrosC = carrosC;
        this.sueldo = sueldo;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarrosC() {
        return carrosC;
    }

    public void setCarrosC(int carrosC) {
        this.carrosC = carrosC;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "CLIENTE : " + 
                "Nombre del cliente = " + nombrec + 
                " Edad=" + edad + 
                " Carros Comprados por el cliente=" + carrosC +  
                " Sueldo disponible = " + sueldo ;
    }



    
}
