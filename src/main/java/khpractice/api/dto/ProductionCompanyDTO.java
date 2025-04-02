package khpractice.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductionCompanyDTO {

    private int id;
    private String logoPath;
    private String name;
    private String originCountry;
}
