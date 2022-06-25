package br.com.zappts.magicthegathering.persistence.dto;

import br.com.zappts.magicthegathering.persistence.model.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlayerDTO {
    private String name;
    private List<Card> cards;
}
