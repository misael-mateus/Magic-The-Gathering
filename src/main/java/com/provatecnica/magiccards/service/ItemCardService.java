package com.provatecnica.magiccards.service;

import com.provatecnica.magiccards.repository.ItemCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemCardService {

    @Autowired
    private ItemCardRepository repository;


}
