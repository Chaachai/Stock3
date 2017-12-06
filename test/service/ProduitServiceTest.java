/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Produit;
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
public class ProduitServiceTest {
    
    public ProduitServiceTest() {
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
     * Test of initDB method, of class ProduitService.
     */
//    @Test
//    public void testInitDB() {
//        System.out.println("initDB");
//        ProduitService instance = new ProduitService();
//        instance.initDB();
//    }
//
//    /**
//     * Test of ajouterProduit method, of class ProduitService.
//     */
//    @Test
//    public void testAjouterProduit() {
//        System.out.println("ajouterProduit");
//        String id = "";
//        String libelle = "";
//        double prixUnitaire = 0.0;
//        int idCategorie = 0;
//        ProduitService instance = new ProduitService();
//        int expResult = 0;
//        int result = instance.ajouterProduit(id, libelle, prixUnitaire, idCategorie);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of findByCriteria method, of class ProduitService.
     */
    @Test
    public void testFindByCriteria() {
        System.out.println("findByCriteria");
        String idProduit = null;
        int idCategorie = 0;
        String libelle = null;
        double prixMax = 0.0;
        double prixMin = 0.0;
        ProduitService instance = new ProduitService();
        List<Produit> result = instance.findByCriteria(idProduit, idCategorie, libelle, prixMax, prixMin);
        System.out.println(result);
    }
    
}
