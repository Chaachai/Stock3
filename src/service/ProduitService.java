/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Categorie;
import bean.Produit;
import java.util.List;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class ProduitService extends AbstractFacade<Produit> {

    public ProduitService() {
        super(Produit.class);
    }

    public void initDB() {
        ajouterProduit("P01", "TOSHIBA", 5000, 1);
        ajouterProduit("P02", "NOKIA", 2500, 2);
        ajouterProduit("P03", "DELL", 4500, 1);
        ajouterProduit("P04", "HP", 5000, 4);
        ajouterProduit("P05", "LG", 7500, 3);
        ajouterProduit("P06", "ALCATEL", 2150, 4);
        ajouterProduit("P07", "CANON", 6570, 5);
    }

    public int ajouterProduit(String id, String libelle, double prixUnitaire, int idCategorie) {
        Produit p = new Produit();
        CategorieService categorieService = new CategorieService();
        Categorie categorie = categorieService.find(idCategorie);
        if (categorie != null) {
            p.setCategorie(categorie);
            p.setId(id);
            p.setLibelle(libelle);
            p.setPrixUnitaire(prixUnitaire);
            create(p);
            return 1;
        }
        return -1;
    }

    public List<Produit> findByCriteria(String idProduit, int idCategorie, String libelle, double prixMax, double prixMin) {
        String query = "SELECT p FROM Produit p WHERE 1 = 1 ";
        if (idProduit != null) {
            query += " AND p.id ='" + idProduit + "'";
        }
        if (idCategorie != 0) {
            query += " AND p.categorie.id ='" + idCategorie + "'";
        }
        if (libelle != null) {
            query += " AND p.libelle ='" + libelle + "'";
        }
        if (prixMax != 0) {
            query += " AND p.prixUnitaire <= " + prixMax;
        }
        if (prixMin != 0) {
            query += " AND p.prixUnitaire >= " + prixMin;
        }
        return getEntityManager().createQuery(query).getResultList();
    }

}
