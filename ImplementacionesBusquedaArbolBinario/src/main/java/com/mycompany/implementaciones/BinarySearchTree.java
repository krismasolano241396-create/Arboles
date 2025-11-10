/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.implementaciones;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 *
 * @author krism
 */
public class BinarySearchTree<T extends Comparable<T>>
extends BinaryTreeComun<T>{
class InorderIterator implements Iterator<T> {
        private LinkedListStack<NodoArbolBinario<T>> pilaNodos;
        private NodoArbolBinario<T> nodoActual;

        public InorderIterator() {
            pilaNodos = new LinkedListStack<>();
            nodoActual = raiz;
        }

        @Override
        public boolean hasNext() {
            return !pilaNodos.empty() || (nodoActual != null);
        }

        @Override
        public T next() {
            NodoArbolBinario<T> nodoSig = null;

            while (nodoActual != null) {
                pilaNodos.push(nodoActual);
                nodoActual = nodoActual.hijoIzq;
            }

            if (!pilaNodos.empty()) {
                nodoSig = pilaNodos.pop();
                nodoActual = nodoSig.hijoDer;
            } else throw new NoSuchElementException();

            return nodoSig.dato;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public BinarySearchTree() {
        raiz = null;
    }

    public void insert(T dato) {
        raiz = insert(raiz, dato);
    }

    private NodoArbolBinario<T> insert(NodoArbolBinario<T> nodo, T dato) {
        if (nodo == null) {
            return new NodoArbolBinario<>(dato);
        }
        if (dato.compareTo(nodo.dato) < 0) {
            nodo.hijoIzq = insert(nodo.hijoIzq, dato);
        } else {
            nodo.hijoDer = insert(nodo.hijoDer, dato);
        }
        return nodo;
    }

    public void remove(T dato) {
        raiz = remove(raiz, dato);
    }

    private NodoArbolBinario<T> remove(NodoArbolBinario<T> nodo, T dato) {
        if (nodo == null) return null;

        if (dato.compareTo(nodo.dato) == 0) {
            if (nodo.hijoIzq == null && nodo.hijoDer == null) return null;
            if (nodo.hijoIzq == null) return nodo.hijoDer;
            if (nodo.hijoDer == null) return nodo.hijoIzq;

            NodoArbolBinario<T> nodoMenor = findSmallestNode(nodo.hijoDer);
            nodo.dato = nodoMenor.dato;
            nodo.hijoDer = remove(nodo.hijoDer, nodoMenor.dato);
        } else if (dato.compareTo(nodo.dato) < 0) {
            nodo.hijoIzq = remove(nodo.hijoIzq, dato);
        } else {
            nodo.hijoDer = remove(nodo.hijoDer, dato);
        }

        return nodo;
    }

    protected NodoArbolBinario<T> findSmallestNode(NodoArbolBinario<T> nodo) {
        return nodo.hijoIzq == null ? nodo : findSmallestNode(nodo.hijoIzq);
    }

    public Iterator<T> getInorderIterator() {
        return new InorderIterator();
    }

    public String toStringInOrder() {
        Iterator<T> iter = getInorderIterator();
        String s = "[";
        if (iter.hasNext()) {
            s += iter.next();
            while (iter.hasNext()) s += ", " + iter.next();
        }
        s += "]";
        return s;
    }
}

 
    
    
    
    
    
    
    

