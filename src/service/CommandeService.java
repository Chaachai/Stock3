/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.ClasseClient;
import bean.Client;
import bean.Commande;
import bean.LigneCommande;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class CommandeService extends AbstractFacade<Commande> {

    ClientService clientService = new ClientService();
    ClasseClientService classeClientService = new ClasseClientService();

    public CommandeService() {
        super(Commande.class);
    }

    public void initDB() {
        ajouterCommande("CMD01", "C01");
        ajouterCommande("CMD02", "C03");
        ajouterCommande("CMD03", "C01");
        ajouterCommande("CMD04", "C02");
        ajouterCommande("CMD05", "C06");
        ajouterCommande("CMD06", "C06");
        ajouterCommande("CMD07", "C02");
        ajouterCommande("CMD08", "C01");
        ajouterCommande("CMD09", "C06");
        ajouterCommande("CMD10", "C01");
        ajouterCommande("CMD11", "C05");
        ajouterCommande("CMD12", "C01");
        ajouterCommande("CMD13", "C03");
        ajouterCommande("CMD14", "C01");
    }

    public int ajouterCommande(String idCommande, String clientID) {
        Client client = clientService.find(clientID);
        if (client != null) {
            Commande commande = new Commande(idCommande);
            commande.setClient(client);
            client.setPointsFidelitee(client.getPointsFidelitee() + 1);
            int idClasse = 0;
            if (client.getPointsFidelitee() >= 0 && client.getPointsFidelitee() <= 5) {
                idClasse = 4;
            } else if (client.getPointsFidelitee() > 5 && client.getPointsFidelitee() <= 10) {
                idClasse = 3;
            } else if (client.getPointsFidelitee() > 10 && client.getPointsFidelitee() <= 20) {
                idClasse = 2;
            } else if (client.getPointsFidelitee() > 20) {
                idClasse = 1;
            }
            ClasseClient classe = classeClientService.find(idClasse);
            if (classe == null) {
                return -2;
            } else {
                client.setClasse(classe);
                clientService.edit(client);
                create(commande);
                return 1;
            }
        }
        return -1;
    }

    public List<Commande> findByCriteria(String idCommande, String idClient, Date dateMin, Date dateMax) {
        String query = "SELECT c FROM Commande c WHERE 1 = 1 ";
        if (idCommande != null) {
            query += " AND c.id ='" + idCommande + "'";
        }
        if (idClient != null) {
            query += " AND c.client.id ='" + idClient + "'";
        }
        if (dateMax != null) {
            query += " AND c.dateCommande <= " + dateMax;
        }
        if (dateMin != null) {
            query += " AND c.dateCommande >= " + dateMin;
        }
        return getEntityManager().createQuery(query).getResultList();
    }

    public int deleteCommandeById(String idCommande) {
        Commande commande = find(idCommande);
        if (commande != null) {
            LigneCommandeService ligneCommandeService = new LigneCommandeService();
            List<LigneCommande> ligneCommandes = ligneCommandeService.findAll();
            if (!ligneCommandes.isEmpty()) {
                for (LigneCommande ligneCommande : ligneCommandes) {
                    if (ligneCommande.getCommande().equals(commande)) {
                        ligneCommandeService.remove(ligneCommande);
                    }
                }
            }
            remove(commande);
            return 1;
        }
        return -1;
    }

}
