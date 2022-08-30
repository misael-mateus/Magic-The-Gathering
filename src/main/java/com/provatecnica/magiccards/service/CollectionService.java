package com.provatecnica.magiccards.service;

import com.provatecnica.magiccards.model.ItemCard;
import com.provatecnica.magiccards.repository.CollectionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {

    @Autowired
    private CollectionRepository repository;
    private CardService cardService;
    private PlayerService playerService;
    private ItemCardService itemCardService;

    @Autowired
    private ModelMapper mapper;



}
