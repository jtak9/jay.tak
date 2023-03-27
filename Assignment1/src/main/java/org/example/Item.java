package org.example;

public class Item {
    private String itemName;
    private String itemDesc;

    public Item (String itemName, String itemDesc) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }
}
