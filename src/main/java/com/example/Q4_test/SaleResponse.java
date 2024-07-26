package com.example.q4_test.controller;

import com.example.q4_test.model.Sale;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SaleResponse {
    private String message;
    private SaleDetail sale;

    public SaleResponse(String message, Sale sale) {
        this.message = message;
        this.sale = new SaleDetail(sale);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SaleDetail getSale() {
        return sale;
    }

    public void setSale(SaleDetail sale) {
        this.sale = sale;
    }

    public static class SaleDetail {
        @JsonProperty("product_id")
        private Long productId;

        @JsonProperty("quantity_sold")
        private int quantitySold;

        @JsonProperty("date")
        private String date;

        public SaleDetail(Sale sale) {
            this.productId = sale.getProductId();
            this.quantitySold = sale.getQuantitySold();
            this.date = sale.getDate().toString();
        }

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

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
}
