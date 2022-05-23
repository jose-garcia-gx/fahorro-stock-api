package com.fahorro.stockapi.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
public class ProductStock {

        @Id
        private String id;

        @Indexed(unique = true)
        private String name;
        private int QuantityParsed;
        private String storeId;
        private String ITEM_ID;
        
        public ProductStock() {
            super();
        }

        public String getStoreId() {
            return storeId;
        }

        public void setStoreId(String storeId) {
            this.storeId = storeId;
        }

        public int getQuantityParsed() {
            return QuantityParsed;
        }

        public void setQuantityParsed(int QuantityParsed) {
            this.QuantityParsed = QuantityParsed;
        }

        public String getITEM_ID() {
            return ITEM_ID;
        }

        public void setITEM_ID(String ITEM_ID) {
            this.ITEM_ID = ITEM_ID;
        }
}