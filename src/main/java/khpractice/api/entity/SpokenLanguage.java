package khpractice.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SpokenLanguage {

    @Id
    private String englishName;
    private String iso_639_1;
    private String name;
}
