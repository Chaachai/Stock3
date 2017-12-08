/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
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
public class ClientServiceTest {

    public ClientServiceTest() {
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
     * Test of initDB method, of class ClientService.
     */
//    @Test
//    public void testInitDB() {
//        System.out.println("initDB");
//        ClientService instance = new ClientService();
//        instance.initDB();
//    }
//
//    /**
//     * Test of ajouterClient method, of class ClientService.
//     */
//    @Test
//    public void testAjouterClient() {
//        System.out.println("ajouterClient");
//        String idClient = "";
//        String nom = "";
//        String prenom = "";
//        String adresse = "";
//        String telephone = "";
//        int idClasse = 0;
//        ClientService instance = new ClientService();
//        instance.ajouterClient(idClient, nom, prenom, adresse, telephone, idClasse);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByCriteria method, of class ClientService.
//     */
//    @Test
//    public void testFindByCriteria() {
//        System.out.println("findByCriteria");
//        String idClient = null;
//        String nom = null;
//        String prenom = null;
//        ClientService instance = new ClientService();
//        List<Client> result = instance.findByCriteria(idClient, nom, prenom);
//        System.out.println(result);
//    }
    /**
     * Test of deleteClientById method, of class ClientService.
     */
    @Test
    public void testDeleteClientById() {
        System.out.println("deleteClientById");
        String idClient = "C02";
        ClientService instance = new ClientService();
        int result = instance.deleteClientById(idClient);
        System.out.println(result);
    }

}
