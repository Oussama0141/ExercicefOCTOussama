package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long idEquipe ;
    public String nomEquipe;
    @Enumerated(EnumType.STRING)
    public Niveau niveau;

}
