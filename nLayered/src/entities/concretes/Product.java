package entities.concretes;

import entities.abstracts.Entity;

public class Product  implements Entity {

    private int id;
    private int categoryId;
    private String name;
    private double unitsPrice;
    private double unitsInStock;

    public Product() {
    }

    public Product(int id, int categoryId, String name, double unitsPrice, double unitsInStock) {

        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.unitsPrice = unitsPrice;
        this.unitsInStock = unitsInStock;

    }

    public int getId(){
        return id;

    }

    public void setId(int id){
        this.id=id;
    }

    public int getCategoryId(){
        return categoryId;
    }
    public void setCategoryId(int categoryId){
        this.categoryId=categoryId;
    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name=name;
    }

    public double getUnitPrice(){
        return unitsPrice;
    }
    public void setUnitPrice(double unitsPrice){
        this.unitsPrice=unitsPrice;
    }

    public double getUnitsInStock(){
        return unitsInStock;
    }
    public void setUnitsInStock(double unitsInStock){
        this.unitsInStock=unitsInStock;
    }
}
