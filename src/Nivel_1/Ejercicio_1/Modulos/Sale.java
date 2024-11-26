package Nivel_1.Ejercicio_1.Modulos;

import Nivel_1.Ejercicio_1.Excepcion.EmptySaleException;

import java.util.ArrayList;

public class Sale {

    private double totalSalePrice;
    private static ArrayList<Product> collection;

    public Sale(double totalSalePrice) {
        this.totalSalePrice = totalSalePrice;
        this.collection = new ArrayList<>();
    }

    public double getTotalSalePrice() {
        return totalSalePrice;
    }

    public ArrayList<Product> getCollection() {
        return collection;
    }

    public void calculateTotal() throws EmptySaleException {

        if (collection.isEmpty()) {
            throw new EmptySaleException("To make a sale, you must first add products.");

        } else {
            for (Product product : collection) {
                totalSalePrice += product.getPrice();
                totalSalePrice = Math.round(totalSalePrice * 100.0) / 100.0;
            }
        }
    }

    @Override
    public String toString() {
        return "\nSale:" +
                "\nCollection --> " + collection +
                "\nTotal sale price = " + totalSalePrice + " €.";

    }
}
