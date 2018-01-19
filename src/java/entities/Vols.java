/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Anouar
 */
@Entity
@Table(name = "vols")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vols.findAll", query = "SELECT v FROM Vols v")
    , @NamedQuery(name = "Vols.findById", query = "SELECT v FROM Vols v WHERE v.id = :id")
    , @NamedQuery(name = "Vols.findByDateDepart", query = "SELECT v FROM Vols v WHERE v.dateDepart = :dateDepart")
    , @NamedQuery(name = "Vols.findByDateArrivee", query = "SELECT v FROM Vols v WHERE v.dateArrivee = :dateArrivee")
    , @NamedQuery(name = "Vols.findByPrix", query = "SELECT v FROM Vols v WHERE v.prix = :prix")})
public class Vols implements Serializable {

    @OneToMany(mappedBy = "vols")
    private Collection<Reservation> reservationCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "dateDepart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDepart;
    @Column(name = "dateArrivee")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateArrivee;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Prix")
    private Float prix;
    @JoinColumn(name = "aereport_Depart", referencedColumnName = "id")
    @ManyToOne
    private Aereport aereportDepart;
    @JoinColumn(name = "Aereport_Arrivee", referencedColumnName = "id")
    @ManyToOne
    private Aereport aereportArrivee;

    public Vols() {
    }

    public Vols(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Aereport getAereportDepart() {
        return aereportDepart;
    }

    public void setAereportDepart(Aereport aereportDepart) {
        this.aereportDepart = aereportDepart;
    }

    public Aereport getAereportArrivee() {
        return aereportArrivee;
    }

    public void setAereportArrivee(Aereport aereportArrivee) {
        this.aereportArrivee = aereportArrivee;
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
        if (!(object instanceof Vols)) {
            return false;
        }
        Vols other = (Vols) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Vols[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Reservation> getReservationCollection() {
        return reservationCollection;
    }

    public void setReservationCollection(Collection<Reservation> reservationCollection) {
        this.reservationCollection = reservationCollection;
    }
    
}
