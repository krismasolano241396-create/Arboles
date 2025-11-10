/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.implementaciones;

import java.util.LinkedList;

/**
 *
 * @author krism
 */
public class LinkedListStack <T> {
     private LinkedList<T> list = new LinkedList<>();

    public void push(T value) {
        list.addFirst(value);
    }

    public T pop() {
        return list.removeFirst();
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
