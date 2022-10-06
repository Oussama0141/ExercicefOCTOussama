package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Etudiants")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEtudiant ;
    private String prenomE;
    private String NomE;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;

    public Etudiant() {
    }

    public Etudiant(long idEtudiant, String prenomE, String nomE, Domaine domaine) {
        this.idEtudiant = idEtudiant;
        this.prenomE = prenomE;
        NomE = nomE;
        this.domaine = domaine;
    }

    public long getIdEtudiant() {
        return idEtudiant;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public String getNomE() {
        return NomE;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public void setNomE(String nomE) {
        NomE = nomE;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }
}
