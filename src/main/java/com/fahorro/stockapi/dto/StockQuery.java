package com.fahorro.stockapi.dto;

import java.util.List;

public class StockQuery {
    private List<Location> _locations;
        
    private List<Item> _items;

    private int _pageNumber;

    private int _pageSize;

    public List<Location> getLocations() {
        return _locations;
    }

    public void setLocations(List<Location> locations) {
        _locations = locations;
    }

    public List<Item> getItems() {
        return _items;
    }

    public void setItems(List<Item> items) {
        _items = items;
    }

    public int getPageNumber() {
        return _pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        _pageNumber = pageNumber;
    }

    public int getPageSize(){
        return _pageSize;
    }

    public void setPageSize(int pageSize){
        _pageSize = pageSize;
    }
}
