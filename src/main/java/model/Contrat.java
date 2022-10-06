package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long idContrat;
    @Temporal(TemporalType.DATE)
    public Date dateDebutC;
    @Temporal(TemporalType.DATE)
    public Date dateFinC;
    @Enumerated(EnumType.STRING)
    public Specialite specialite;
    public boolean archive;
    public float MontantC;

}
