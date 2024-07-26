package com.example.q4_test.controller;

import com.example.q4_test.model.Sale;
import com.example.q4_test.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping
    public SaleResponse recordSale(@RequestBody SaleRequest saleRequest) {
        Sale sale = saleService.recordSale(saleRequest.getProductId(), saleRequest.getQuantitySold());
        return new SaleResponse("Sale recorded successfully", sale);
    }
}
