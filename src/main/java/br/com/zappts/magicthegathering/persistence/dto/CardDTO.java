package br.com.zappts.magicthegathering.persistence.dto;

import br.com.zappts.magicthegathering.persistence.model.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
    private String name;
    private String edition;
    private Language language;private Boolean foil;
    private BigDecimal price;
}
