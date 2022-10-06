package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Etudiants")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long idEtudiant ;
    public String prenomE;
    public String NomE;
    @Enumerated(EnumType.STRING)
    public Domaine domaine;

}
