package khpractice.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductionCompany {

    @Id
    private int id;
    private String logoPath;
    private String name;
    private String originCountry;
}
