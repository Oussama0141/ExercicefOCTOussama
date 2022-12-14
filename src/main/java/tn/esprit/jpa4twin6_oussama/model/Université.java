package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue("Uni")
public class Universit√© extends Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUniversite;
    private String nomUniversite;

    public Universit√©() {
    }

    public Universit√©(long idDepartement, String nomDepartement) {
        super(idDepartement, nomDepartement);
    }
}
