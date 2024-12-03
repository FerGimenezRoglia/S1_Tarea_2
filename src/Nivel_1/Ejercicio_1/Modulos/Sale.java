package Nivel_1.Ejercicio_1.Modulos;

import Nivel_1.Ejercicio_1.Excepcion.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private double totalSalePrice;
    private ArrayList<Product> products;

    public Sale(double totalSalePrice) {
        this.totalSalePrice = totalSalePrice;
        this.products = new ArrayList<>();
    }

    public double getTotalSalePrice() {
        return totalSalePrice;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void addProduct(Product product) {

        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null.");
        }
        products.add(product);

    }

    public void calculateTotal() throws EmptySaleException {

        if (products.isEmpty()) {
            throw new EmptySaleException("To make a sale, you must first add products.");

        } else {
            for (Product product : products) {
                totalSalePrice += product.getPrice();
                totalSalePrice = Math.round(totalSalePrice * 100.0) / 100.0;
            }
        }
    }

    @Override
    public String toString() {
        return "\nSale:" +
                "\nProducts --> " + products +
                "\nTotal sale price = " + totalSalePrice + " €.";

    }
}
