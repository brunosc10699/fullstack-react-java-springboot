package com.bruno.dsvendas.repositories;

import com.bruno.dsvendas.dto.SaleSuccessDTO;
import com.bruno.dsvendas.dto.SaleSumDTO;
import com.bruno.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.bruno.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            "FROM Sale AS obj " +
            "GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.bruno.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            "FROM Sale AS obj " +
            "GROUP BY obj.seller")
    List<SaleSuccessDTO> successGropedBySeller();
}
