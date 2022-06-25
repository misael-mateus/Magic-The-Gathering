package br.com.zappts.magicthegathering.service;

import br.com.zappts.magicthegathering.persistence.dto.CardDTO;

public interface CardService {
    public CardDTO createCard(CardDTO card);
    public CardDTO updateCard(CardDTO card);
    public CardDTO deleteCard(CardDTO card);
    public CardDTO getCard(Long id);
    public CardDTO getCardByName(String name);
    public Iterable<CardDTO> getAllCards();
}
