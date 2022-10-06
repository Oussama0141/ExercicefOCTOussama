package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue("Uni")
public class Université extends Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUniversite;
    private String nomUniversite;

    public Université() {
    }

    public Université(long idDepartement, String nomDepartement) {
        super(idDepartement, nomDepartement);
    }
}
