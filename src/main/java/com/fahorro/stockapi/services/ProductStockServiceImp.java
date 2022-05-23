package com.fahorro.stockapi.services;

import java.util.ArrayList;
import java.util.List;

import com.fahorro.stockapi.dto.FoundResult;
import com.fahorro.stockapi.dto.ResultItem;
import com.fahorro.stockapi.dto.StockQuery;
import com.fahorro.stockapi.dto.StockResult;
import com.fahorro.stockapi.repository.ProductStockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductStockServiceImp implements ProductStockService {

    @Autowired
    ProductStockRepository productRepository;

    private String missMessage = "No se encontro el articulo asociado a la sucursal";

    public StockResult getProductStock(StockQuery query) {
        StockResult res = new StockResult();
        List<FoundResult> results = new ArrayList<>();

        query.getLocations().forEach(l -> {
                var match = new FoundResult(l.getId(), missMessage);
                List<ResultItem> items = new ArrayList<>();
            query.getItems().forEach(i -> {
                var item = productRepository.findFirstByName(l.getId() + i.getId());

                if(item != null) {
                    items.add(new ResultItem(item.getITEM_ID(), item.getQuantityParsed()));
                }
            });

            if(items.size() > 0) {
                match.setMessage("ok");
                match.setItems(items);
            }

            results.add(match);
        });

        res.setFounds(results);

        return res;
    }
}
