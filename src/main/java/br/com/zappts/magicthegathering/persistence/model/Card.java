package br.com.zappts.magicthegathering.persistence.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "edition", nullable = false)
    private String edition;
    @Enumerated(EnumType.STRING)
    @Column(name = "language", nullable = false)
    private Language language;
    @Column(name = "foil", nullable = false)
    private Boolean foil;
    @Column(name = "price", nullable = false)
    private BigDecimal price;
}
