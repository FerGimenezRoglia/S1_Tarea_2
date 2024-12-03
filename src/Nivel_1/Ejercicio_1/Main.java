package Nivel_1.Ejercicio_1;

import Nivel_1.Ejercicio_1.Excepcion.EmptySaleException;
import Nivel_1.Ejercicio_1.Modulos.Product;
import Nivel_1.Ejercicio_1.Modulos.Sale;

public class Main {
    public static void main(String[] args) {

        Sale sale = new Sale(0);

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        Sale secondSale = new Sale(0);
        secondSale.addProduct(new Product("table", 50.4));
        secondSale.addProduct(new Product("table", 72.4));

        try {
            secondSale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        for (Product product : secondSale.getProducts()) {
            System.out.println(product.toString());
        }

        try {
            System.out.println(secondSale.getProducts().get(4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}