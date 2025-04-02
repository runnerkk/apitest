package khpractice.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductionCountry {

    @Id
    private String iso_3166_1;
    private String name;
}
