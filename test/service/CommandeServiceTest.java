/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Commande;
import java.util.Date;
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
public class CommandeServiceTest {
    
    public CommandeServiceTest() {
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
     * Test of ajouterCommande method, of class CommandeService.
//     */
//    @Test
//    public void testAjouterCommande() {
//        System.out.println("ajouterCommande");
//        String idCommande = "CMD0";
//        String clientID = "C01";
//        CommandeService instance = new CommandeService();
//        int result = instance.ajouterCommande(idCommande, clientID);
//        System.out.println(result);
//    }
//
//    /**
//     * Test of initDB method, of class CommandeService.
//     */
//    @Test
//    public void testInitDB() {
//        System.out.println("initDB");
//        CommandeService instance = new CommandeService();
//        instance.initDB();
//    }

    /**
     * Test of findByCriteria method, of class CommandeService.
     */
    @Test
    public void testFindByCriteria() {
        System.out.println("findByCriteria");
        String idCommande = null;
        String idClient = null;
        Date dateMin = null;
        Date dateMax = null;
        CommandeService instance = new CommandeService();
        List<Commande> result = instance.findByCriteria(idCommande, idClient, dateMin, dateMax);
        System.out.println(result);
    }
    
}
