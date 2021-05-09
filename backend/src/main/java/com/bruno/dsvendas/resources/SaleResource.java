package com.bruno.dsvendas.resources;

import com.bruno.dsvendas.dto.SaleDTO;
import com.bruno.dsvendas.entities.Sale;
import com.bruno.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/sales")
public class SaleResource {

    @Autowired
    private SaleService saleService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        return ResponseEntity.ok().body(saleService.findAll(pageable));
    }
}
