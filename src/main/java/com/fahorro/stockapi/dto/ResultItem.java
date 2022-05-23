package com.fahorro.stockapi.dto;

import java.util.Date;

public class ResultItem {
    private String id;

    private int availableQty;

    public Date updateDate;

    public ResultItem() {

    }

    public ResultItem(String id, int availableQty) {
        this.id = id;
        this.availableQty = availableQty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty){
        this.availableQty = availableQty;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
