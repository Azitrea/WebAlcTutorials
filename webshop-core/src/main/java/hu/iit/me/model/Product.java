package hu.iit.me.model;

import java.util.Map;

public class Product {
    private String itemID;
    private String itemName;
    private int price;
    private String manufacturer;
    private String description;
    private Map<Integer, Integer> warranty;

    public Product(String itemID, String itemName, int price, String manufacturer, String description, Map<Integer, Integer> warranty) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
        this.warranty = warranty;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<Integer, Integer> getWarranty() {
        return warranty;
    }

    public void setWarranty(Map<Integer, Integer> warranty) {
        this.warranty = warranty;
    }
}
