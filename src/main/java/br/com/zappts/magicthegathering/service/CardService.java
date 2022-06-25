package br.com.zappts.magicthegathering.service;

import br.com.zappts.magicthegathering.persistence.dto.CardDTO;

import java.util.Optional;

public interface CardService {
    public Optional<CardDTO> createCard(CardDTO cardDTO);

    public Optional<CardDTO> updateCard(CardDTO cardDTO);

    public Boolean deleteCard(CardDTO cardDTO);

    public Optional<CardDTO> getCard(Long id);

    public Optional<CardDTO> getCardByName(String name);

    public Iterable<CardDTO> getAllCards();
}
