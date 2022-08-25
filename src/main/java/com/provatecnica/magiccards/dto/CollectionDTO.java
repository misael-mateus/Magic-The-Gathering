package com.provatecnica.magiccards.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CollectionDTO {
    private List<CardDTO> cards;

}
