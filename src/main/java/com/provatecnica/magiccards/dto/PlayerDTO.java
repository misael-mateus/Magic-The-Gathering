package com.provatecnica.magiccards.dto;

import com.provatecnica.magiccards.model.Collection;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class PlayerDTO{
    private String name;
    private Set<Collection> collection;
}
