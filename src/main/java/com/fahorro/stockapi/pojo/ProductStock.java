package com.fahorro.stockapi.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("product")
public class ProductStock {

        @Id
        private String id;

        @Indexed(unique = true)
        private String name;
        private int quantityParsed;
        private String storeId;
        private String ITEM_ID;
        
        public ProductStock(String id, String name, int quantityParsed, String storeId, String ITEM_ID) {
            super();
            this.id = id;
            this.name = name;
            this.quantityParsed = quantityParsed;
            this.storeId = storeId;
            this.ITEM_ID = ITEM_ID;
        }

        public String getStoreId() {
            return storeId;
        }

        public void setStoreId(String storeId) {
            this.storeId = storeId;
        }

        public int getQuantityParsed() {
            return quantityParsed;
        }

        public void setQuantityParsed(int quantityParsed) {
            this.quantityParsed = quantityParsed;
        }

        public String getITEM_ID() {
            return ITEM_ID;
        }

        public void setITEM_ID(String ITEM_ID) {
            this.ITEM_ID = ITEM_ID;
        }
}