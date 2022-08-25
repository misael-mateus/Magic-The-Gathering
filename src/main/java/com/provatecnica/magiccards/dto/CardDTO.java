package com.provatecnica.magiccards.dto;

import com.provatecnica.magiccards.model.Language;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class CardDTO {
    private String name;
    private String edition;
    private Language language;
    private Boolean foil;
    private BigDecimal price;
}
