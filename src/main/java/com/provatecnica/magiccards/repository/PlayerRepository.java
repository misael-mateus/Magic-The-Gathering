package com.provatecnica.magiccards.repository;

import com.provatecnica.magiccards.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
