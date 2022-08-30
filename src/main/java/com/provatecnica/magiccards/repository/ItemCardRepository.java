package com.provatecnica.magiccards.repository;

import com.provatecnica.magiccards.model.ItemCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCardRepository extends JpaRepository<ItemCard,Long> {
}
