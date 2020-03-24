/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Nikos
 */
public class ListOperationsTest {
    private ListOperations listOperations;
    public ListOperationsTest() {
    }
    
    
    @Before
    public void setUp() {
        listOperations = new ListOperations();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddNameToList() {
        boolean changed= listOperations.addNameToList("Andy");
        assertTrue(changed);
    }

    @Test
    public void testAddNameToListCheckSize() {
        listOperations.addNameToList("Andy");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(1, sizeOfList);
    }
//    @Ignore
//    @Test
//    public void testAddNameToListCheckName() {
//        String name = "Andy";
//        listOperations.addNameToList(name);
//        int sizeOfList = listOperations.getSizeOfList();
//        String actualName =  listOperations.getNames().getSizeOfList(sizeOfList-1);
//        //int sizeOfList = listOperations.getSizeOfList();
//        assertTrue(actualName.equals(name));
//    }
    
    
    @Test
    public void testAddNameToListManyNames() {
        
        listOperations.addNameToList("Mary");
        listOperations.addNameToList("Andy");
        listOperations.addNameToList("Peter");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(3, sizeOfList);
    }
    
     @Test
    public void testAddNameToListInteger(){
        listOperations.addNameToList(null);
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(0, sizeOfList);
    }
    @Test
    public void testRemoveNameFromListNotEquals() {
        listOperations.addNameToList("Mary");
        int i = listOperations.getSizeOfList();
        listOperations.removeNameFromList("Mary");
        int j = listOperations.getSizeOfList();
        assertNotEquals(i, j);
    }
    public void testRemoveNameFromListEquals() {
        listOperations.addNameToList("John");
        int i = listOperations.getSizeOfList();
        listOperations.removeNameFromList("Mary");
        int j = listOperations.getSizeOfList();
        assertEquals(i, j);
    }
     
    
    @Test
    public void testGetSizeOfListEquals() {
        listOperations.addNameToList("Nikos");
        listOperations.addNameToList("Sa");
        listOperations.addNameToList("George");
        int i = listOperations.getSizeOfList();
        assertEquals(3, i);
    }
    
    @Test
    public void testGetSizeOfListNotEquals() {
        listOperations.addNameToList("Nikos");
        listOperations.addNameToList("Sa");
        listOperations.addNameToList("George");
        int i = listOperations.getSizeOfList();
        assertNotEquals(5, i);
    }
}
