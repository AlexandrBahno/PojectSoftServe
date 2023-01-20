package edu.com.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Product {

    private int id;
    private String name;
    private int quantityOfGoods;
    private double price;
    private String manufacturer;
    private String category;
    private double depth;
    private double width;
    private double height;

    public Product() {
    }

    public Product(int id, String name, int quantityOfGoods, double price, String manufacturer, String category, double depth, double width, double height) {
        this.id = id;
        this.name = name;
        this.quantityOfGoods = quantityOfGoods;
        this.price = price;
        this.manufacturer = manufacturer;
        this.category = category;
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityOfGoods() {
        return quantityOfGoods;
    }

    public void setQuantityOfGoods(int quantityOfGoods) {
        this.quantityOfGoods = quantityOfGoods;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantityOfGoods=" + quantityOfGoods +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", category='" + category + '\'' +
                ", depth=" + depth +
                ", width=" + width +
                ", height=" + height +
                '}';
    }


    public List<String> manufacturerName(ArrayList<Product> goods) {

        List<String> manufacturerSet = goods.stream()
                .map(Product::getManufacturer)
                .distinct()
                .toList();
        return manufacturerSet;
    }

    public Map<String, Integer> nameQuantity(ArrayList<Product> goods) {
        Map<String, Integer> nameQuantity = goods.stream()
                .collect(toMap(Product::getName, Product::getQuantityOfGoods));
        return nameQuantity;
    }

    public ArrayList<Product> changePrice(ArrayList<Product> goods, double n) {  // change price by %
        ArrayList<Product> newGoods = goods.stream()
                .map(product -> product.setPrice(product.getPrice() * n));
        return newGoods;
    }

}
