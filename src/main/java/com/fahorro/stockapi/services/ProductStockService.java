package com.fahorro.stockapi.services;

import com.fahorro.stockapi.dto.StockQuery;
import com.fahorro.stockapi.dto.StockResult;

public interface ProductStockService {
    StockResult getProductStock(StockQuery query); 
}
