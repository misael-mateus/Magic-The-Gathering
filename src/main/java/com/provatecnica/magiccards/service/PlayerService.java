package com.provatecnica.magiccards.service;

import com.provatecnica.magiccards.dto.PlayerDTO;
import com.provatecnica.magiccards.model.Player;
import com.provatecnica.magiccards.repository.PlayerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private ModelMapper mapper;

    public void newPlayer(PlayerDTO playerDTO){
        this.repository.saveAndFlush(this.mapper.map(playerDTO,Player.class));
    }

    public Optional<PlayerDTO> findPlayerById(Long id){
        return Optional.of(this.mapper.map(this.repository.findById(id),PlayerDTO.class));
    }

    public Optional<PlayerDTO> alterPlayer(Long id, PlayerDTO changePlayer){
        var player = this.repository.findById(id);
        var changedPlayer = player.map(p -> {
            p.setName(changePlayer.getName());
            p.setCollection(changePlayer.getCollection());
            return p;
        });
        changedPlayer.ifPresent(value -> this.repository.saveAndFlush(value));
        return Optional.of(this.mapper.map(changedPlayer, PlayerDTO.class));
    }


}
