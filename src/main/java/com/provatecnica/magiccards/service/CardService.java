package com.provatecnica.magiccards.service;

import com.provatecnica.magiccards.dto.CardDTO;
import com.provatecnica.magiccards.model.Card;
import com.provatecnica.magiccards.repository.CardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Transactional
    public void newCard(CardDTO cardDTO) {
        this.repository.saveAndFlush(this.mapper.map(cardDTO, Card.class));
    }

    @Transactional
    public Optional<Card> findCardById(Long id) {
        return this.repository.findById(id);
    }

    @Transactional
    public Optional<CardDTO> alterCardById(Long id, CardDTO changedCard) {
        Optional<Card> card = this.repository.findById(id);
        card.map(c -> {
            c.setName(changedCard.getName());
            c.setFoil(changedCard.getFoil());
            c.setPrice(changedCard.getPrice());
            c.setEdition(changedCard.getEdition());
            c.setLanguage(changedCard.getLanguage());
            return c;
        });
        card.ifPresent(value -> this.repository.saveAndFlush(value));
        return Optional.of(this.mapper.map(card, CardDTO.class));
    }

    @Transactional
    public void deleteCardById(Long id) {
        this.repository.deleteById(id);
    }

}
