/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Categorie;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class CategorieService extends AbstractFacade<Categorie> {

    public CategorieService() {
        super(Categorie.class);
    }

    public void initDB() {
        creerCategorie(1, "Computer");
        creerCategorie(2, "Mobile Phone");
        creerCategorie(3, "Television");
        creerCategorie(4, "Printer");
        creerCategorie(5, "Camera");
    }

    public void creerCategorie(int id, String categorie) {
        Categorie category = new Categorie();
        category.setId(id);
        category.setCategorie(categorie);
        create(category);
    }

}
