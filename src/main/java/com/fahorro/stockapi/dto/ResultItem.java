package com.fahorro.stockapi.dto;

import java.util.Date;

public class ResultItem {
    private String _id;

    private int _availableQty;

    public Date _updateDate;

    public ResultItem() {

    }

    public ResultItem(String id, int availableQty) {
        _id = id;
        _availableQty = availableQty;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id){
        _id = id;
    }

    public int getAvailableQty() {
        return _availableQty;
    }

    public void setAvailableQty(int availableQty){
        _availableQty = availableQty;
    }

    public Date getUpdateDate() {
        return _updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        _updateDate = updateDate;
    }

}
