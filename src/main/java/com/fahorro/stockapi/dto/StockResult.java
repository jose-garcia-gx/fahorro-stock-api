package com.fahorro.stockapi.dto;

import java.util.List;

public class StockResult {
    private List<FoundResult> _founds;
        
    private int _pageNumber;

    private int _pageSize;

    private int _totalElements;

    public List<FoundResult> getFounds() {
        return _founds;
    }

    public void setFounds(List<FoundResult> founds) {
        _founds = founds;
    }

    public int getPageNumber() {
        return _pageNumber;
    }

    public void setPageNumber(int pageNumber){
        _pageNumber = pageNumber;
    }

    public int getTotalElements() {
        return _totalElements;
    }

    public void setTotalElements(int totalElements) {
        _totalElements = totalElements;
    }
}
