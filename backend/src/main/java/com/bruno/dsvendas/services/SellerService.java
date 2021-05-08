package com.bruno.dsvendas.services;

import com.bruno.dsvendas.dto.SellerDTO;
import com.bruno.dsvendas.entities.Seller;
import com.bruno.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll(){
        return sellerRepository.findAll().stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
