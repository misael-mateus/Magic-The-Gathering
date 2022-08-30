package com.provatecnica.magiccards.dto;

import com.provatecnica.magiccards.model.ItemCard;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class CollectionDTO {
    private String name;
    private Set<ItemCard> cards;
    private Integer quantityFoil;
}
