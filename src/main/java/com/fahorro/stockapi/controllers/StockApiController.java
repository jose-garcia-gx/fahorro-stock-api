package com.fahorro.stockapi.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import com.fahorro.stockapi.dto.FoundResult;
import com.fahorro.stockapi.dto.StockQuery;
import com.fahorro.stockapi.dto.StockResult;
import com.fahorro.stockapi.services.ProductStockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path = "/proxy-inventarios/api/v1")
public class StockApiController {
    @Autowired 
    ProductStockService stockService;

    @RequestMapping(value = "/existencias", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<StockResult> postExistencias(@RequestBody StockQuery query)
    {
        var res = stockService.getProductStock(query);
        return ResponseEntity.ok(res);
    }
}
