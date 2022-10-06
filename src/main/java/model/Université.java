package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue("Uni")
public class Université extends Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long idUniversite;
    public String nomUniversite;

}
