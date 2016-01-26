package com.decor.item.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DecorItem {
    public List<Item> items = new ArrayList<Item>();

    public void addItem(HashMap itemDetail) {
        Item item = createDecorItem(itemDetail);
        this.items.add(item);
    }

    public List<Item> getItems(){
        return this.items;
    }

    private Item createDecorItem(HashMap itemDetail) {
        return new Item(itemDetail);
    }

    public class Item {
        public String name;
        public String range;
//        public blob image;
        public String dimension;
        public String seller;
        public String description;

        public Item(HashMap<String, String> itemDetail) {
            this.name = itemDetail.get("name");
            this.range = itemDetail.get("range");
            this.dimension = itemDetail.get("dimension");
            this.seller = itemDetail.get("seller");
            this.description = itemDetail.get("description");
        }

        @Override
        public String toString() {
            return this.name +" "+this.description;
        }
    }
}