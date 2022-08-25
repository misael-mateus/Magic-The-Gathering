package com.provatecnica.magiccards.dto;

import com.provatecnica.magiccards.model.Collection;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PlayerDTO{
    private String name;
    private List<Collection> collection;
}
