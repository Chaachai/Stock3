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
public class CategorieServiceTest {
    
    public CategorieServiceTest() {
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
     * Test of initDB method, of class CategorieService.
     */
    @Test
    public void testInitDB() {
        System.out.println("initDB");
        CategorieService instance = new CategorieService();
        instance.initDB();
    }

    /**
     * Test of creerCategorie method, of class CategorieService.
     */
//    @Test
//    public void testCreerCategorie() {
//        System.out.println("creerCategorie");
//        int id = 0;
//        String categorie = "";
//        CategorieService instance = new CategorieService();
//        instance.creerCategorie(id, categorie);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
