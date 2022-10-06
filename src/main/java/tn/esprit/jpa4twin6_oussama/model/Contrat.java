package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutC;
    @Temporal(TemporalType.DATE)
    private Date dateFinC;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private boolean archive;
    private float MontantC;

    public Contrat() {
    }

    public Contrat(long idContrat, Date dateDebutC, Date dateFinC, Specialite specialite, boolean archive, float montantC) {
        this.idContrat = idContrat;
        this.dateDebutC = dateDebutC;
        this.dateFinC = dateFinC;
        this.specialite = specialite;
        this.archive = archive;
        MontantC = montantC;
    }

    public long getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(long idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutC() {
        return dateDebutC;
    }

    public void setDateDebutC(Date dateDebutC) {
        this.dateDebutC = dateDebutC;
    }

    public Date getDateFinC() {
        return dateFinC;
    }

    public void setDateFinC(Date dateFinC) {
        this.dateFinC = dateFinC;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    public float getMontantC() {
        return MontantC;
    }

    public void setMontantC(float montantC) {
        MontantC = montantC;
    }
}
