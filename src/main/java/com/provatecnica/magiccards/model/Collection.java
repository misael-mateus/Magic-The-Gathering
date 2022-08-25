package com.provatecnica.magiccards.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Setter
@Getter
public class Collection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Collection.class)
    @JoinColumn(name = "collection_id")
    private List<Card> cards;


}
