package khpractice.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SpokenLanguageDTO {

    private String englishName;
    private String iso_639_1;
    private String name;
}
