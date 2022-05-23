package com.fahorro.stockapi.repository;

import com.fahorro.stockapi.pojo.ProductStock;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductStockRepository extends MongoRepository<ProductStock, String> {
    ProductStock findFirstByName(String name); 
}
