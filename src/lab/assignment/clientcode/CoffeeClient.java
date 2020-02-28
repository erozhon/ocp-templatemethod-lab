package lab.assignment.clientcode;

import lab.assignment.beforerefactoring.CoffeeMaker;
import lab.assignment.beforerefactoring.*;


public class CoffeeClient {


    public static void main(String[] args) {
        System.out.println("*******");
        CoffeeMaker coffeeType = new Capuccino();
        System.out.println("Capuccino");
        coffeeType.prepareCoffee();
        
        System.out.println("********************");
        coffeeType = new Mocha();
        System.out.println("Mocha");
        coffeeType.prepareCoffee();

        System.out.println("*********");
        coffeeType = new Americano();
        System.out.println("Americano");
        coffeeType.prepareCoffee();

        System.out.println("WOOOO");
    }

}
