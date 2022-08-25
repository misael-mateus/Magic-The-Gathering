package com.provatecnica.magiccards.repository;

import com.provatecnica.magiccards.model.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionRepository extends JpaRepository<Collection, Long> {
}
