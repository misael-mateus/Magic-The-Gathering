package br.com.zappts.magicthegathering.service;

import br.com.zappts.magicthegathering.persistence.dto.PlayerDTO;

import java.util.Optional;

public interface PlayerService {
    public Optional<PlayerDTO> createPlayer(PlayerDTO playerDTO);

    public Optional<PlayerDTO> updatePlayer(PlayerDTO playerDTO);

    public Boolean deletePlayer(PlayerDTO playerDTO);

    public Optional<PlayerDTO> getPlayer(Long id);

    public Optional<PlayerDTO> getPlayerByName(String name);

    public Iterable<PlayerDTO> getAllPlayers();
}
