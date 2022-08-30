package com.provatecnica.magiccards.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "item_card")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(targetEntity = ItemCard.class)
    private Card card;
    @ManyToMany
    @JoinTable(name = "collection_itemcard",joinColumns =
            {@JoinColumn(name = "itemcard_id")},
            inverseJoinColumns = {@JoinColumn(name = "collection_id")})
    private Set<Collection> collections;
    private Integer quantity;
}
