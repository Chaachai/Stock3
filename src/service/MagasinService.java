/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Magasin;
import java.util.List;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class MagasinService extends AbstractFacade<Magasin> {

    public MagasinService() {
        super(Magasin.class);
    }

    public void initBD() {
        creerMagasin("#01", "Downtown Seattle", "500 Pine Street", "Seattle", "+212506798456");
        creerMagasin("#02", "Northgate", "401 N.E Northgate Way", "Seattle", "+212552369741");
        creerMagasin("#03", "Southcenter Square Rack", "17200 Southcenter Parkway, Suite 110", "Tukwila", "+212597364558");
        creerMagasin("#04", "Bellevue Square", "100 Bellevue Square", "Bellvue", "+212564589732");
        creerMagasin("#05", "Southcenter", "100 Southcenter Shopping Center", "Tukwila", "+212565498732");
        creerMagasin("#06", "Tacoma Mall", "4502 S. Steele Street, Suite 800", "Tacoma", "+212577982346");
        creerMagasin("#07", "Spokane", "828 W. Main Avenue", "Spokane", "+212546468291");
        creerMagasin("#08", "Alderwood", "3200 184th Street SW", "Lynnwood", "+212593366458");
        creerMagasin("#09", "Anchorage Rack", "680 E. Northern Lights Boulevard", "Anchorage", "+212567139824");
        creerMagasin("#10", "Anchorage", "603 D Street", "Anchorage", "+212575364128");
    }

    public void creerMagasin(String idMagasin, String nom, String adresse, String ville, String telephone) {
        Magasin m = new Magasin();
        m.setId(idMagasin);
        m.setNom(nom);
        m.setVille(ville);
        m.setAdresse(adresse);
        m.setTelephone(telephone);
        create(m);
    }

    public List<Magasin> findByCriteria(String idMagasin, String ville, String nom) {
        String query = "SELECT m FROM Magasin m WHERE 1 = 1 ";
        if (idMagasin != null) {
            query += " AND m.id ='" + idMagasin + "'";
        }
        if (ville != null) {
            query += " AND m.ville ='" + ville + "'";
        }
        if (nom != null) {
            query += " AND m.nom ='" + nom + "'";
        }
        return getEntityManager().createQuery(query).getResultList();
    }

}
