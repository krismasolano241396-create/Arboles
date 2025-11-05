/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad11;

/**
 *
 * @author krism
 */
public class Familiar {
    private String nombre;
    private int edad;
    private String ocupacion;
    private boolean finado;
    private String lugarNacimiento;

    public Familiar(String nombre, int edad, String ocupacion, boolean finado, String lugarNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.finado = finado;
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String toString() {
        return nombre + "("+ edad+ " años, " + ocupacion + ", Nacido en " +
                lugarNacimiento + ", " + (finado ? "Finado" : "Vivo") + ")";
    }
   
    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Familiar){
        Familiar f=(Familiar)obj;
        return this.nombre.equalsIgnoreCase(f.nombre);
    }
    return false;
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }
    
    
   
    
    
    
}
