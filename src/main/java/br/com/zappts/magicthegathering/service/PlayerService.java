package br.com.zappts.magicthegathering.service;

import br.com.zappts.magicthegathering.persistence.dto.PlayerDTO;

public interface PlayerService {
    public PlayerDTO createPlayer(PlayerDTO player);
    public PlayerDTO updatePlayer(PlayerDTO player);
    public PlayerDTO deletePlayer(PlayerDTO player);
    public PlayerDTO getPlayer(Long id);
    public PlayerDTO getPlayerByName(String name);
    public Iterable<PlayerDTO> getAllPlayers();
}
