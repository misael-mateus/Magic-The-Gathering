package com.provatecnica.magiccards.repository;

import com.provatecnica.magiccards.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
