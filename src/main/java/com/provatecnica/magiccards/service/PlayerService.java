package com.provatecnica.magiccards.service;

import com.provatecnica.magiccards.dto.PlayerDTO;
import com.provatecnica.magiccards.model.Player;
import com.provatecnica.magiccards.repository.PlayerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Transactional
    public void newPlayer(PlayerDTO playerDTO) {
        this.repository.saveAndFlush(this.mapper.map(playerDTO, Player.class));
    }

    @Transactional
    public Optional<Player> findPlayerById(Long id) {
        return this.repository.findById(id);
    }

    @Transactional
    public Optional<PlayerDTO> alterPlayer(Long id, PlayerDTO changePlayer) {
        var player = this.repository.findById(id);
        var changedPlayer = player.map(p -> {
            p.setName(changePlayer.getName());
            p.setCollection(changePlayer.getCollection());
            return p;
        });
        changedPlayer.ifPresent(value -> this.repository.saveAndFlush(value));
        return Optional.of(this.mapper.map(changedPlayer, PlayerDTO.class));
    }

    @Transactional
    public void deletePlayer(Long id) {
        this.repository.deleteById(id);
    }

}
