package hu.iit.me.controller.model;

import java.util.Collection;

public class Shop {
    private String shopID;
    private String shopName;
    private Collection<Product> productList;

    public Shop(String shopID, String shopName, Collection<Product> productList) {
        this.shopID = shopID;
        this.shopName = shopName;
        this.productList = productList;
    }

    public String getShopID() {
        return shopID;
    }

    public void setShopID(String shopID) {
        this.shopID = shopID;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Collection<Product> getProductList() {
        return productList;
    }

    public void setProductList(Collection<Product> productList) {
        this.productList = productList;
    }
}
