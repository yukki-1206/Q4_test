package com.example.q4_test.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaleRequest {
    @JsonProperty("product_id")
    private Long productId;

    @JsonProperty("quantity_sold")
    private int quantitySold;

    // Getters and setters
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }
}
