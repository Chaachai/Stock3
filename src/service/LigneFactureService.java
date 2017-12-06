/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.LigneCommande;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class LigneFactureService extends AbstractFacade<LigneCommande> {

    public LigneFactureService() {
        super(LigneCommande.class);
    }

}
