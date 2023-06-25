package com.example.task02;

public class ModelProductShort {

    private String ProductName;
    private String ProductComposition;

     public static enum ProductCategory{Пицца, Комбо, Десерты, Напитки};
    ProductCategory productCategory;
    private int Price;


    private int idImage;
    public  ModelProductShort(String ProductName, int Price, ProductCategory productCat, int idImage){
        this.ProductName = ProductName;
        this.Price = Price;
        this.idImage = idImage;
        this.productCategory = productCat;
        switch (productCategory){
            case Пицца:
                this.ProductComposition = "колбаска, сырок, грибочки, соус, майонезик, зелень";
                break;
            case Комбо:
                this.ProductComposition = "Пицца, Кока-кола, картофель фри";
                break;
            case Десерты:
                this.ProductComposition = "творог, ореховый сироп, канапе";
                break;
            case Напитки:
                this.ProductComposition = "мохито, лед, швепс, лайм";
                break;
        }

    }
    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }
    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
    public String getProductComposition() {
        return ProductComposition;
    }

    public void setProductComposition(String productComposition) {
        ProductComposition = productComposition;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCat) {
        productCategory = productCat;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }
}
