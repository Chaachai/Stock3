/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.ClasseClient;
import bean.Client;
import java.util.List;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class ClientService extends AbstractFacade<Client> {
    ClasseClientService classeClientService = new ClasseClientService();
    public ClientService() {
        super(Client.class);
    }
    
    public void initDB() {
        ajouterClient("C01", "CHAACHAI", "Youssef", "Sidi Abbad", "+212642112113", 4);
        ajouterClient("C02", "OUALILI", "Younesse", "Sidi Abbad", "+212654789621", 4);
        ajouterClient("C03", "ZOUANI", "Youness", "Sidi Youssef", "+212685214789", 4);
        ajouterClient("C04", "AHMED", "Moussa", "Guiliz", "+212678965410", 4);
        ajouterClient("C05", "MOHAMMED", "Ali", "Daoudiate", "+212612345678", 4);
        ajouterClient("C06", "BENCHARKI", "Achraf", "Massira", "+212645685225", 4);
        
    }
    
    public void ajouterClient(String idClient, String nom, String prenom, String adresse, String telephone, int idClasse) {
        ClasseClient c = classeClientService.find(idClasse);
        Client client = new Client(idClient, nom, prenom, adresse, telephone);
        client.setPointsFidelitee(0);
        client.setClasse(c);
        create(client);
    }

    public List<Client> findByCriteria(String idClient, String nom, String prenom) {
        String query = "SELECT c FROM Client c WHERE 1 = 1 ";
        if (idClient != null) {
            query += " AND c.id ='" + idClient + "'";
        }
        if (nom != null) {
            query += " AND c.nom ='" + nom + "'";
        }
        if (prenom != null) {
            query += " AND c.prenom LIKE '" + prenom + "'";
        }
        return getEntityManager().createQuery(query).getResultList();
    }
}
