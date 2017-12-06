/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class ClasseClientServiceTest {
    
    public ClasseClientServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initDB method, of class ClasseClientService.
     */
    @Test
    public void testInitDB() {
        System.out.println("initDB");
        ClasseClientService instance = new ClasseClientService();
        instance.initDB();
    }

    /**
     * Test of createClasse method, of class ClasseClientService.
     */
//    @Test
//    public void testCreateClasse() {
//        System.out.println("createClasse");
//        int id = 0;
//        char classe = ' ';
//        ClasseClientService instance = new ClasseClientService();
//        instance.createClasse(id, classe);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
