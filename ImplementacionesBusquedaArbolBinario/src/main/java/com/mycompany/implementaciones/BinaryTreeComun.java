/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.implementaciones;
import excepciones.TreeException;
/**
 *
 * @author krism
 */
public class BinaryTreeComun <T>{
    protected NodoArbolBinario<T> raiz;

    public boolean empty() {
        return raiz == null;
    }

    public void clear() {
        raiz = null;
    }

    public T getRootData() throws TreeException {
        if (empty()) throw new TreeException("El árbol está vacío.");
        return raiz.dato;
    }

    public int getHeight() {
        return getHeight(raiz);
    }

    private int getHeight(NodoArbolBinario<T> nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(getHeight(nodo.hijoIzq), getHeight(nodo.hijoDer));
    }

    public int getNumberNodes() {
        return getNumberNodes(raiz);
    }

    private int getNumberNodes(NodoArbolBinario<T> nodo) {
        if (nodo == null) return 0;
        return 1 + getNumberNodes(nodo.hijoIzq) + getNumberNodes(nodo.hijoDer);
    }

}
