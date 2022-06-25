package br.com.zappts.magicthegathering.persistence.repository;

import br.com.zappts.magicthegathering.persistence.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
