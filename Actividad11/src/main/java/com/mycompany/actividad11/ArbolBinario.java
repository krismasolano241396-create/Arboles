/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad11;

import com.mycompany.actividad11.Nodo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krism
 */
public class ArbolBinario <T>{
    private Nodo <T> raiz;

 
    public ArbolBinario() {
       raiz = null;
    }

    public ArbolBinario(T datoRaiz) {
        raiz= new Nodo<>(datoRaiz) ;
    }

    public ArbolBinario(T datoRaiz, ArbolBinario<T>arbolIzq, ArbolBinario<T> arbolDer) {
     raiz= new Nodo<>(datoRaiz);
     if(arbolIzq != null){
         raiz.setIzquierdo(arbolIzq.raiz);
     }
     if(arbolDer != null){
         raiz.setDerecho(arbolDer.raiz);
     }
    }
    
    public T getRootDate(){
        if(raiz== null)
            throw new IllegalStateException("ElÁrbol está vacío");
    return raiz.getDato();
    }
    
    public int getAltura(){
        return altura(raiz);
    }
    
    public int altura(Nodo<T>nodo){
        if(nodo== null){
         return 0;
        
        }
         return 1 + Math.max(altura(nodo.getIzquierdo()),altura (nodo.getDerecho()));
    }
    private int contarNodos(Nodo<T>nodo){
    if(nodo==null){
      return 0;  
    } 
    return 1 + contarNodos(nodo.getIzquierdo())+ contarNodos(nodo.getDerecho());
    }
    
   public int getNumberNodes(){
       return contarNodos(raiz);
   } 
   public boolean empty(){
       return raiz== null;
   }
   public void clear(){
       raiz= null;
   }
   public void clearRecursivo(Nodo<T>nodo){
       if(nodo != null){
          clearRecursivo(nodo.getIzquierdo());
          clearRecursivo(nodo.getDerecho());
          nodo.setIzquierdo(null);
          nodo.setDerecho(null);
      }
   }
   public List<T> getInOrderIterator(){
       List<T> lista=new ArrayList<>();
       inOrder(raiz, lista);
       return lista;
   }
   
   private void inOrder(Nodo<T>nodo, List<T> lista){
       if(nodo != null){
           inOrder(nodo.getIzquierdo(),lista);
           lista.add(nodo.getDato());
           inOrder(nodo.getDerecho(), lista);
       }
       }
       private void PreOrder(Nodo<T> nodo, List<T>lista){
         if (nodo !=null){
             lista.add(nodo.getDato());
             PreOrder(nodo.getIzquierdo(), lista);
}            PreOrder(nodo.getDerecho(), lista);
         }  
        
       public List<T>getPreOrderIterator(){
           List<T> lista= new ArrayList<>();
           PreOrder(raiz, lista);  
           return lista; 
        }
   
       private void postOrder(Nodo<T> nodo, List <T> lista){
          if(nodo !=null){
              postOrder(nodo.getIzquierdo(), lista);
              postOrder(nodo.getDerecho(), lista);
              lista.add(nodo.getDato());
          }        
       }
       
       public List<T> getPosOrderIterator(){
           List<T> lista= new ArrayList<>();
           postOrder(raiz, lista);
           return lista;
       }
       
       
       private boolean buscarRecursivo(Nodo<T>nodo, T dato){
          if(nodo== null){
              return false;
          }
          if(nodo.getDato().equals(dato)){
              return true;
          }
         return buscarRecursivo(nodo.getIzquierdo(), dato)|| buscarRecursivo(nodo.getDerecho(), dato);        
       }
       
       public boolean buscar(T dato){
           return buscarRecursivo(raiz,dato);
       }
}

