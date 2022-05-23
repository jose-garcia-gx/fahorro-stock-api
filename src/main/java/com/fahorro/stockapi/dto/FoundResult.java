package com.fahorro.stockapi.dto;

import java.util.List;

public class FoundResult {
    private List<ResultItem> _items;

    private String _locationId;

    private String _version = "sim";

    private String _message;

    public FoundResult() {

    }

    public FoundResult(String message) {
        _message = message;
    }

    public FoundResult(String locationId, String message) {
        _locationId = locationId;
        _message = message;
    }

    public List<ResultItem> getItems() {
        return _items;
    }

    public void setItems(List<ResultItem> items) {
        _items = items;
    }

    public String getLocationId() {
        return _locationId;
    }

    public void setLocationId(String locationId) {
        _locationId = locationId;
    }

    public String getVersion() {
        return _version;
    }

    public void setVersion(String version) {
        _version = version;
    }

    public String getMessage() {
        return _message;
    }

    public void setMessage(String message){
        _message = message;
    }
}
