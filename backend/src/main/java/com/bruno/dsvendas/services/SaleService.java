package com.bruno.dsvendas.services;

import com.bruno.dsvendas.dto.SaleDTO;
import com.bruno.dsvendas.entities.Sale;
import com.bruno.dsvendas.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<SaleDTO> findAll(){
        return saleRepository.findAll().stream().map(SaleDTO::new).collect(Collectors.toList());
    }
}
