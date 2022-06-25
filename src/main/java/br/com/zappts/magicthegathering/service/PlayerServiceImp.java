package br.com.zappts.magicthegathering.service;

import br.com.zappts.magicthegathering.persistence.dto.PlayerDTO;
import br.com.zappts.magicthegathering.persistence.repository.PlayerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerServiceImp implements PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Optional<PlayerDTO> createPlayer(PlayerDTO playerDTO) {
        return Optional.empty();
    }

    @Override
    public Optional<PlayerDTO> updatePlayer(PlayerDTO playerDTO) {
        return Optional.empty();
    }

    @Override
    public Boolean deletePlayer(PlayerDTO playerDTO) {
        return null;
    }

    @Override
    public Optional<PlayerDTO> getPlayer(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<PlayerDTO> getPlayerByName(String name) {
        return Optional.empty();
    }

    @Override
    public Iterable<PlayerDTO> getAllPlayers() {
        return null;
    }
}