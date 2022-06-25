package br.com.zappts.magicthegathering.service;

import br.com.zappts.magicthegathering.persistence.dto.CardDTO;
import br.com.zappts.magicthegathering.persistence.model.Card;
import br.com.zappts.magicthegathering.persistence.repository.CardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardServiceImp implements CardService {

    @Autowired
    private CardRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Optional<CardDTO> createCard(CardDTO cardDTO) {
        Card card = modelMapper.map(cardDTO, Card.class);;
        return Optional.of(modelMapper.map(repository.saveAndFlush(card), CardDTO.class));
    }

    @Override
    public Optional<CardDTO> updateCard(CardDTO cardDTO) {
        return null;
    }

    @Override
    public Boolean deleteCard(CardDTO cardDTO) {
        return null;
    }

    @Override
    public Optional<CardDTO> getCard(Long id) {
        return null;
    }

    @Override
    public Optional<CardDTO> getCardByName(String name) {
        return null;
    }

    @Override
    public Iterable<CardDTO> getAllCards() {
        return null;
    }
}
