package Nivel_1.Ejercicio_1;

import Nivel_1.Ejercicio_1.Excepcion.EmptySaleException;
import Nivel_1.Ejercicio_1.Modulos.Product;
import Nivel_1.Ejercicio_1.Modulos.Sale;

public class Main {
    public static void main(String[] args) {

        Sale sale = new Sale(0);
        //sale.getCollection().add(new Product("table", 50.4));
        //sale.getCollection().add(new Product("table", 72.4));

        try {
            sale.calculateTotal();

        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sale.toString());
    }
}