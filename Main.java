package OOPSeminar1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotDrink b1 = new HotDrink("1", 1, 1, 100);
        HotDrink b2 = new HotDrink("2", 2, 2, 10);
        HotDrink b3 = new HotDrink("5", 4, 3, 15);
        HotDrink b4 = new HotDrink("15", 123, 1, 11);
        HotDrink b5 = new HotDrink("20", 6, 5, 100);

        HotDrinkMachine vendingMachine = new HotDrinkMachine(new ArrayList<HotDrink>() {
            {
                add(b1);
                add(b2);
                add(b3);
                add(b4);
                add(b5);
            }
        });
        System.out.println(vendingMachine.getProduct("20", 5, 100));
        System.out.println(vendingMachine.getProduct("20", 6, 100));
        System.out.println(vendingMachine.getProduct("15", 1, 10));
        // for (BottleOfWater b : vendingMachine.getBottleOfWaters()) {
        // System.out.println(b);
        // }
    }

}
