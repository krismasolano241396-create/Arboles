/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.implementaciones;

/**
 *
 * @author krism
 */
public class NodoArbolBinario <T>{
        public T dato;
    public NodoArbolBinario<T> hijoIzq;
    public NodoArbolBinario<T> hijoDer;

    public NodoArbolBinario(T dato) {
        this.dato = dato;
        this.hijoIzq = null;
        this.hijoDer = null;
    }
}
