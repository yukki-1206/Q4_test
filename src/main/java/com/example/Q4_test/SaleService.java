package com.example.q4_test.service;

import com.example.q4_test.model.Sale;
import com.example.q4_test.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public Sale recordSale(Long productId, int quantitySold) {
        Sale sale = new Sale();
        sale.setProductId(productId);
        sale.setQuantitySold(quantitySold);
        sale.setDate(LocalDateTime.now());
        return saleRepository.save(sale);
    }
}
