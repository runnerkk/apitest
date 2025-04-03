package khpractice.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SpokenLanguageDTO {

    @JsonProperty("english_name")
    private String englishName;
    private String iso_639_1;
    private String name;
}
