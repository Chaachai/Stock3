/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
@Entity
public class Magasin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String adresse;
    private String ville;
    private String nom;
    private String telephone;
    @OneToMany(mappedBy = "magasin")
    private List<Stock> stocks;

    public Magasin() {
    }

    public Magasin(String id) {
        this.id = id;
    }

    public Magasin(String id, String adresse, String ville, String nom, String telephone) {
        this.id = id;
        this.adresse = adresse;
        this.ville = ville;
        this.nom = nom;
        this.telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Stock> getStocks() {
        if (stocks == null) {
            stocks = new ArrayList();
        }
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Magasin)) {
            return false;
        }
        Magasin other = (Magasin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Magasin{" + "id=" + id + ", adresse=" + adresse + ", ville=" + ville + ", nom=" + nom + ", telephone=" + telephone + '}';
    }

}
