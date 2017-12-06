/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Magasin;
import bean.Produit;
import bean.Stock;
import java.util.List;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class StockService extends AbstractFacade<Stock> {

    public StockService() {
        super(Stock.class);
    }

    MagasinService magasinService = new MagasinService();
    ProduitService produitService = new ProduitService();

    public void initDB() {
        ajouterStock("#ST-01", "#09", "P07", 5000);
        ajouterStock("#ST-02", "#05", "P01", 60000);
        ajouterStock("#ST-03", "#01", "P02", 560);
        ajouterStock("#ST-04", "#05", "P01", 5000);
        ajouterStock("#ST-05", "#10", "P03", 7000);
        ajouterStock("#ST-06", "#04", "P07", 1500);
        ajouterStock("#ST-07", "#10", "P03", 260);
        ajouterStock("#ST-08", "#08", "P02", 10000);
        ajouterStock("#ST-09", "#01", "P04", 30000);
        ajouterStock("#ST-10", "#03", "P05", 600);
    }

    public int ajouterStock(String idStock, String idMagasin, String idProduit, double quantite) {
        if (findStockByMagasinAndProduit(idMagasin, idProduit) == null) {
            creerStock(idStock, idMagasin, idProduit, quantite);
            return 1;
        } else {
            updateStock(idMagasin, idProduit, quantite);
            return 2;
        }
    }

    public int creerStock(String idStock, String idMagasin, String idProduit, double quantite) {
        Stock stock = new Stock();
        Magasin magasin = magasinService.find(idMagasin);
        Produit produit = produitService.find(idProduit);
        if (produit != null && magasin != null) {
            stock.setId(idStock);
            stock.setQuantite(quantite);
            stock.setMagasin(magasin);
            stock.setProduit(produit);
            create(stock);
            return 1;
        }
        return -1;
    }

    public void updateStock(String idMagasin, String idProduit, double quantite) {
        Stock stock = findStockByMagasinAndProduit(idMagasin, idProduit);
        stock.setQuantite(stock.getQuantite() + quantite);
        edit(stock);
    }

    public Stock findStockByMagasinAndProduit(String idMagasin, String idProduit) {
        Magasin magasin = magasinService.find(idMagasin);
        Produit produit = produitService.find(idProduit);
        List<Stock> stocks = findAll();
        if (magasin == null || produit == null) {
            return null;
        } else {
            for (int i = 0; i < stocks.size(); i++) {
                Stock stock = stocks.get(i);
                if (stock.getProduit().equals(produit) && stock.getMagasin().equals(magasin)) {
                    return stocks.get(i);
                }
            }
            return null;
        }
    }

    public List<Stock> findByCriteria(String idStock, String idProduit, String idMagasin, double quantiteMax, double quantiteMin) {
        String query = "SELECT s FROM Stock s WHERE 1 = 1 ";
        if (idStock != null) {
            query += " AND s.id ='" + idStock + "'";
        }
        if (idMagasin != null) {
            query += " AND s.magasin.id ='" + idMagasin + "'";
        }
        if (idProduit != null) {
            query += " AND s.produit.id ='" + idProduit + "'";
        }
        if (quantiteMax != 0) {
            query += " AND s.quantite <= " + quantiteMax;
        }
        if (quantiteMin != 0) {
            query += " AND s.quantite >= " + quantiteMin;
        }
        return getEntityManager().createQuery(query).getResultList();
    }
//
//    public int deleteStock(String storeID, String productID, double quantity) {
//        Stock stock = findByStoreAndProduct(storeID, productID);
//        if (stock.getQuantity() < quantity) {
//            return -1;
//        } else {
//            stock.setQuantity(stock.getQuantity() - quantity);
//            edit(stock);
//            return 1;
//        }
//    }
//
//    public double findGlobalQuantity(String productID) {
//        Product product = productService.find(productID);
//        List<Stock> stocks = findAll();
//        double globalQuantity = 0.0;
//        if (product == null) {
//            return -1;
//        } else if (stocks.isEmpty()) {
//            return -2;
//        } else {
//            for (Stock stock : stocks) {
//                if (stock.getProduct().equals(product)) {
//                    globalQuantity += stock.getQuantity();
//                }
//            }
//            return globalQuantity;
//        }
//
//    }

}
