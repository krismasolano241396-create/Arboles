/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import com.mycompany.implementaciones.BinarySearchTree;
import excepciones.TreeException;
import java.util.Iterator;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
/**
 *
 * @author krism
 */

public class BinarySearchTreeTest {
    public BinarySearchTreeTest() {
    }

    /**
     * Prueba del metodo getRootData() de la clase BinarySearchTree.
     */
    @Test
    public void testGetRootData() {
        System.out.println("Prueba del metodo getRootData() de la clase BinarySearchTree");
        Integer expResult;
        Integer result;

        // Caso de un arbol vacio
        BinarySearchTree<Integer> intBST = new BinarySearchTree<>();
        Exception e = assertThrows(TreeException.class, () -> intBST.getRootData());

        // Se insertan nodos
        intBST.insert(8);
        expResult = 8;
        result = intBST.getRootData();
        assertEquals(expResult, result);

        intBST.insert(2);
        expResult = 8;
        result = intBST.getRootData();
        assertEquals(expResult, result);

        intBST.insert(9);
        intBST.insert(1);
        intBST.insert(4);
        intBST.insert(11);

        // Se eliminan nodos
        intBST.remove(2);
        expResult = 8;
        result = intBST.getRootData();
        assertEquals(expResult, result);

        intBST.remove(9);
        intBST.remove(8);
        expResult = 11;
        result = intBST.getRootData();
        assertEquals(expResult, result);
    }

    /**
     * Prueba del metodo getHeight() de la clase BinarySearchTree.
     */
    @Test
    public void testGetHeight() {
        System.out.println("Prueba del metodo getHeight() de la clase BinarySearchTree");
        Integer expResult;
        Integer result;

        BinarySearchTree<Integer> intBST = new BinarySearchTree<>();

        // Caso de un arbol vacio
        expResult = 0;
        result = intBST.getHeight();
        assertEquals(expResult, result);

        // Se insertan nodos
        intBST.insert(8);
        expResult = 1;
        result = intBST.getHeight();
        assertEquals(expResult, result);

        intBST.insert(2);
        expResult = 2;
        result = intBST.getHeight();
        assertEquals(expResult, result);

        intBST.insert(9);
        expResult = 2;
        result = intBST.getHeight();
        assertEquals(expResult, result);

        intBST.insert(1);
        expResult = 3;
        result = intBST.getHeight();
        assertEquals(expResult, result);

        intBST.insert(4);
        intBST.insert(11);
        expResult = 3;
        result = intBST.getHeight();
        assertEquals(expResult, result);

        // Se eliminan nodos
        intBST.remove(2);
        expResult = 3;
        result = intBST.getHeight();
        assertEquals(expResult, result);

        intBST.remove(9);
        intBST.remove(8);
        expResult = 3;
        result = intBST.getHeight();
        assertEquals(expResult, result);
    }

    /**
     * Prueba del metodo getNumberNodes() de la clase BinarySearchTree.
     */
    @Test
    public void testGetNumberNodes() {
        System.out.println("Prueba del metodo getNumberNodes() de la clase BinarySearchTree");
        Integer expResult;
        Integer result;

        BinarySearchTree<Integer> intBST = new BinarySearchTree<>();

        // Caso de un arbol vacio
        expResult = 0;
        result = intBST.getNumberNodes();
        assertEquals(expResult, result);

        // Se insertan nodos
        intBST.insert(8);
        expResult = 1;
        result = intBST.getNumberNodes();
        assertEquals(expResult, result);

        intBST.insert(2);
        expResult = 2;
        result = intBST.getNumberNodes();
        assertEquals(expResult, result);

        intBST.insert(9);
        intBST.insert(1);
        intBST.insert(4);
        intBST.insert(11);
        expResult = 6;
        result = intBST.getNumberNodes();
        assertEquals(expResult, result);

        // Se eliminan nodos
        intBST.remove(2);
        expResult = 5;
        result = intBST.getNumberNodes();
        assertEquals(expResult, result);

        intBST.remove(9);
        intBST.remove(8);
        expResult = 3;
        result = intBST.getNumberNodes();
        assertEquals(expResult, result);
    }

    /**
     * Prueba del metodo empty() de la clase BinarySearchTree.
     */
    @Test
    public void testEmpty() {
        System.out.println("Prueba del metodo empty() de la clase BinarySearchTree");
        boolean result;

        BinarySearchTree<Integer> intBST = new BinarySearchTree<>();

        // Caso de un arbol vacio
        result = intBST.empty();
        assertTrue(result);

        // Caso de un arbol con un nodo
        intBST.insert(8);
        result = intBST.empty();
        assertFalse(result);
    }

    /**
     * Prueba del metodo clear() de la clase BinarySearchTree.
     */
    @Test
    public void testClear() {
        System.out.println("Prueba del metodo clear() de la clase BinarySearchTree");
        boolean result;

        BinarySearchTree<Integer> intBST = new BinarySearchTree<>();

        // Caso de un arbol vacio
        intBST.clear();
        result = intBST.empty();
        assertTrue(result);

        // Caso de un arbol con un nodo
        intBST.insert(8);
        intBST.clear();
        result = intBST.empty();
        assertTrue(result);
    }

    /**
     * Prueba del metodo getInorderIterator() de la clase BinarySearchTree.
     */
    @Test
    public void testGetInorderIterator() {
        System.out.println("Prueba del metodo getInorderIterator() de la clase BinarySearchTree");
        BinarySearchTree<Integer> intBST = new BinarySearchTree<>();
        Iterator<Integer> result = intBST.getInorderIterator();
        assertNotNull(result);
    }

    /**
     * Prueba del metodo insert(), de la clase BinarySearchTree.
     */
    @Test
    public void testInsert() {
        System.out.println("Prueba del metodo insert(), de la clase BinarySearchTree");
        Integer expRootData;
        Integer resRootData;
        Integer expHeight;
        Integer resHeight;
        Integer expNumberNodes;
        Integer resNumberNodes;
        String expStringInOrder;
        String resStringInOrder;

        BinarySearchTree<Integer> intBST = new BinarySearchTree<>();

        // Se insertan nodos
        intBST.insert(8);
        expRootData = 8;
        resRootData = intBST.getRootData();
        assertEquals(expRootData, resRootData);
        expHeight = 1;
        resHeight = intBST.getHeight();
        assertEquals(expHeight, resHeight);
        expNumberNodes = 1;
        resNumberNodes = intBST.getNumberNodes();
        assertEquals(expNumberNodes, resNumberNodes);
        expStringInOrder = "[8]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);

        intBST.insert(2);
        expRootData = 8;
        resRootData = intBST.getRootData();
        assertEquals(expRootData, resRootData);
        expHeight = 2;
        resHeight = intBST.getHeight();
        assertEquals(expHeight, resHeight);
        expNumberNodes = 2;
        resNumberNodes = intBST.getNumberNodes();
        assertEquals(expNumberNodes, resNumberNodes);
        expStringInOrder = "[2, 8]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);

        intBST.insert(9);
        expRootData = 8;
        resRootData = intBST.getRootData();
        assertEquals(expRootData, resRootData);
        expHeight = 2;
        resHeight = intBST.getHeight();
        assertEquals(expHeight, resHeight);
        expNumberNodes = 3;
        resNumberNodes = intBST.getNumberNodes();
        assertEquals(expNumberNodes, resNumberNodes);
        expStringInOrder = "[2, 8, 9]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);

        intBST.insert(1);
        expRootData = 8;
        resRootData = intBST.getRootData();
        assertEquals(expRootData, resRootData);
        expHeight = 3;
        resHeight = intBST.getHeight();
        assertEquals(expHeight, resHeight);
        expNumberNodes = 4;
        resNumberNodes = intBST.getNumberNodes();
        assertEquals(expNumberNodes, resNumberNodes);
        expStringInOrder = "[1, 2, 8, 9]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);
    }

    /**
     * Prueba del metodo remove(), de la clase BinarySearchTree.
     */
    @Test
    public void testRemove() {
        System.out.println("Prueba del metodo remove(), de la clase BinarySearchTree.");
        Integer expRootData;
        Integer resRootData;
        Integer expHeight;
        Integer resHeight;
        Integer expNumberNodes;
        Integer resNumberNodes;
        String expStringInOrder;
        String resStringInOrder;

        BinarySearchTree<Integer> intBST = new BinarySearchTree<>();

        // Se insertan nodos
        intBST.insert(8);
        intBST.insert(2);
        intBST.insert(9);
        intBST.insert(1);
        intBST.insert(4);
        intBST.insert(11);

        // Se eliminan nodos
        intBST.remove(4);
        expRootData = 8;
        resRootData = intBST.getRootData();
        assertEquals(expRootData, resRootData);
        expHeight = 3;
        resHeight = intBST.getHeight();
        assertEquals(expHeight, resHeight);
        expNumberNodes = 5;
        resNumberNodes = intBST.getNumberNodes();
        assertEquals(expNumberNodes, resNumberNodes);
        expStringInOrder = "[1, 2, 8, 9, 11]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);

        intBST.remove(9);
        expRootData = 8;
        resRootData = intBST.getRootData();
        assertEquals(expRootData, resRootData);
        expHeight = 3;
        resHeight = intBST.getHeight();
        assertEquals(expHeight, resHeight);
        expNumberNodes = 4;
        resNumberNodes = intBST.getNumberNodes();
        assertEquals(expNumberNodes, resNumberNodes);
        expStringInOrder = "[1, 2, 8, 11]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);

        intBST.remove(8);
        expRootData = 11;
        resRootData = intBST.getRootData();
        assertEquals(expRootData, resRootData);
        expHeight = 3;
        resHeight = intBST.getHeight();
        assertEquals(expHeight, resHeight);
        expNumberNodes = 3;
        resNumberNodes = intBST.getNumberNodes();
        assertEquals(expNumberNodes, resNumberNodes);
        expStringInOrder = "[1, 2, 11]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);

        // Se remueve el resto de los nodos
        intBST.remove(2);
        intBST.remove(1);
        intBST.remove(11);
        boolean result = intBST.empty();
        assertTrue(result);
    }

    /**
     * Prueba del metodo toStringInOrder(), de la clase BinarySearchTree.
     */
    @Test
    public void testToStringInOrder() {
        System.out.println("Prueba del metodo toStringInOrder(), de la clase BinarySearchTree");
        String expStringInOrder;
        String resStringInOrder;

        BinarySearchTree<Integer> intBST = new BinarySearchTree<>();

        // Se insertan nodos
        intBST.insert(8);
        expStringInOrder = "[8]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);

        intBST.insert(2);
        expStringInOrder = "[2, 8]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);

        intBST.insert(9);
        expStringInOrder = "[2, 8, 9]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);

        intBST.insert(1);
        expStringInOrder = "[1, 2, 8, 9]";
        resStringInOrder = intBST.toStringInOrder();
        assertEquals(expStringInOrder, resStringInOrder);
    }
}
 

