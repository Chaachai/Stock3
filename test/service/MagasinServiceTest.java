/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Magasin;
import java.util.List;
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
public class MagasinServiceTest {
    
    public MagasinServiceTest() {
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
     * Test of initBD method, of class MagasinService.
     */
//    @Test
//    public void testInitBD() {
//        System.out.println("initBD");
//        MagasinService instance = new MagasinService();
//        instance.initBD();
//    }
//
//    /**
//     * Test of creerMagasin method, of class MagasinService.
//     */
//    @Test
//    public void testCreerMagasin() {
//        System.out.println("creerMagasin");
//        String idMagasin = "";
//        String nom = "";
//        String adresse = "";
//        String ville = "";
//        String telephone = "";
//        MagasinService instance = new MagasinService();
//        instance.creerMagasin(idMagasin, nom, adresse, ville, telephone);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findByCriteria method, of class MagasinService.
     */
    @Test
    public void testFindByCriteria() {
        System.out.println("findByCriteria");
        String idMagasin = null;
        String ville = null;
        String nom = null;
        MagasinService instance = new MagasinService();
        List<Magasin> result = instance.findByCriteria(idMagasin, ville, nom);
        System.out.println(result);
    }
    
}
