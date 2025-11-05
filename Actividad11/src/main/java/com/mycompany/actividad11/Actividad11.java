/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad11;

/**
 *
 * @author krism
 *Estructura de Datos 
 * Actividad 11-Arboles Binarios
 */
public class Actividad11 {

    public static void main(String[] args) {
        Familiar abuelo= new Familiar("Francisco", 95,"Campesino", true, "Choix Sinaloa" );
        Familiar abuela= new Familiar("Tomasa", 76,"Ama de Casa", true, "Navojoa Sonora" );
        Familiar Padre= new Familiar("Guillermo", 64,"Pescador", false, "Navojoa Sonora" );
        Familiar Madre= new Familiar("Maria", 60,"Ama de Casa", false, "Navojoa Sonora" );
         Familiar hijo= new Familiar("Krisma", 22,"Estudiante ISW", false, "Navojoa Sonora" );
    
      ArbolBinario <Familiar>arbolIzq= new ArbolBinario <>(Padre);
      ArbolBinario <Familiar>arbolDer= new ArbolBinario <>();
      
      ArbolBinario <Familiar>arbolGenealogico=new ArbolBinario<>(abuelo, arbolIzq, arbolDer);
    
        System.out.println("Árbol Genealógico en Preorden ");
    for(Familiar f: arbolGenealogico.getPreOrderIterator()){
        System.out.println(f);
    }
    
        System.out.println("\nAltura del árbol: "+ arbolGenealogico.getAltura());
        System.out.println("Número de nodos: "+ arbolGenealogico.getNumberNodes());
    
        
        
        System.out.println("\nBuscar 'Maria' :" + (arbolGenealogico.buscar(hijo)?"Encontrado": "No Encontrado"));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
