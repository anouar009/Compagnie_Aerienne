/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Anouar
 */
@Entity
@Table(name = "aereport")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aereport.findAll", query = "SELECT a FROM Aereport a")
    , @NamedQuery(name = "Aereport.findById", query = "SELECT a FROM Aereport a WHERE a.id = :id")
    , @NamedQuery(name = "Aereport.findByNom", query = "SELECT a FROM Aereport a WHERE a.nom = :nom")
    , @NamedQuery(name = "Aereport.findByPays", query = "SELECT a FROM Aereport a WHERE a.pays = :pays")})
public class Aereport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "Nom")
    private String nom;
    @Size(max = 45)
    @Column(name = "Pays")
    private String pays;
    @OneToMany(mappedBy = "aereportDepart")
    private Collection<Vols> volsCollection;
    @OneToMany(mappedBy = "aereportArrivee")
    private Collection<Vols> volsCollection1;

    public Aereport() {
    }

    public Aereport(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @XmlTransient
    public Collection<Vols> getVolsCollection() {
        return volsCollection;
    }

    public void setVolsCollection(Collection<Vols> volsCollection) {
        this.volsCollection = volsCollection;
    }

    @XmlTransient
    public Collection<Vols> getVolsCollection1() {
        return volsCollection1;
    }

    public void setVolsCollection1(Collection<Vols> volsCollection1) {
        this.volsCollection1 = volsCollection1;
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
        if (!(object instanceof Aereport)) {
            return false;
        }
        Aereport other = (Aereport) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nom;
    }
    
}
