package khpractice.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductionCompanyDTO {

    private int id;
    @JsonProperty("logo_path")
    private String logoPath;
    private String name;
    @JsonProperty("origin_country")
    private String originCountry;
}
