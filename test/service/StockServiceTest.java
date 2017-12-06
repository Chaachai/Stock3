/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Stock;
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
public class StockServiceTest {

    public StockServiceTest() {
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
     * Test of initDB method, of class StockService.
     */
//    @Test
//    public void testInitDB() {
//        System.out.println("initDB");
//        StockService instance = new StockService();
//        instance.initDB();
//    }
//
//    /**
//     * Test of ajouterStock method, of class StockService.
//     */
//    @Test
//    public void testAjouterStock() {
//        System.out.println("ajouterStock");
//        String idStock = "";
//        String idMagasin = "";
//        String idProduit = "";
//        double quantite = 0.0;
//        StockService instance = new StockService();
//        int expResult = 0;
//        int result = instance.ajouterStock(idStock, idMagasin, idProduit, quantite);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of creerStock method, of class StockService.
//     */
//    @Test
//    public void testCreerStock() {
//        System.out.println("creerStock");
//        String idStock = "";
//        String idMagasin = "";
//        String idProduit = "";
//        double quantite = 0.0;
//        StockService instance = new StockService();
//        int expResult = 0;
//        int result = instance.creerStock(idStock, idMagasin, idProduit, quantite);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateStock method, of class StockService.
//     */
//    @Test
//    public void testUpdateStock() {
//        System.out.println("updateStock");
//        String idMagasin = "";
//        String idProduit = "";
//        double quantite = 0.0;
//        StockService instance = new StockService();
//        instance.updateStock(idMagasin, idProduit, quantite);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findStockByMagasinAndProduit method, of class StockService.
//     */
//    @Test
//    public void testFindStockByMagasinAndProduit() {
//        System.out.println("findStockByMagasinAndProduit");
//        String idMagasin = "";
//        String idProduit = "";
//        StockService instance = new StockService();
//        Stock expResult = null;
//        Stock result = instance.findStockByMagasinAndProduit(idMagasin, idProduit);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of findByCriteria method, of class StockService.
     */
    @Test
    public void testFindByCriteria() {
        System.out.println("findByCriteria");
        String idStock = null;
        String idProduit = null;
        String idMagasin = null;
        double quantiteMax = 5000.0;
        double quantiteMin = 600.0;
        StockService instance = new StockService();
        List<Stock> result = instance.findByCriteria(idStock, idProduit, idMagasin, quantiteMax, quantiteMin);
        System.out.println(result);
    }

}
