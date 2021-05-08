package com.bruno.dsvendas.dto;

import com.bruno.dsvendas.entities.Sale;
import com.bruno.dsvendas.entities.Seller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    public SellerDTO(){}

    public SellerDTO(Seller seller) {
        id = seller.getId();
        name = seller.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
