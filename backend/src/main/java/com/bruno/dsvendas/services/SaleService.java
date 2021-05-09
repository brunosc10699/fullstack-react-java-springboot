package com.bruno.dsvendas.services;

import com.bruno.dsvendas.dto.SaleDTO;
import com.bruno.dsvendas.entities.Sale;
import com.bruno.dsvendas.repositories.SaleRepository;
import com.bruno.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    //evita locking no banco, já que é apenas uma consulta
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        //Armazena os vendedores na memória
        //A JPA vai armazenar os vendedores em cache
        //Isso evita que o hibernate faça uma consulta no banco para cada vendedor cadastrado
        //Esse não é recomendado quando se tem um número grande de registros no banco
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(SaleDTO::new);
    }


}
