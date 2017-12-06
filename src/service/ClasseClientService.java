/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.ClasseClient;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class ClasseClientService extends AbstractFacade<ClasseClient> {

    public ClasseClientService() {
        super(ClasseClient.class);
    }
    
    public void initDB() {
        createClasse(1, 'A');
        createClasse(2, 'B');
        createClasse(3, 'C');
        createClasse(4, 'D');
    }

    public void createClasse(int id, char classe) {
        ClasseClient classeClient = new ClasseClient();
        classeClient.setClasse(classe);
        classeClient.setId(id);
        create(classeClient);
    }

}
