package com.bruno.dsvendas.resources;

import com.bruno.dsvendas.dto.SellerDTO;
import com.bruno.dsvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerResource {

    @Autowired
    private SellerService sellerService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<SellerDTO>> findAll(){
        return ResponseEntity.ok().body(sellerService.findAll());
    }

}
