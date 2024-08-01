package bill;

import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        System.out.println(".................WELCOME TO PIZZA-XPRESS.................");
        System.out.println("Which Pizza:  (1.Veg Pizza  2.Non-Veg Pizza  3.Deluxe Veg Pizza  4.Deluxe Non-Veg Pizza)");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                Pizza vegPizza = new Pizza(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeAway();
                vegPizza.getBill();
                break;
            case 2:
                Pizza nonvegPizza = new Pizza(false);
                nonvegPizza.addExtraToppings();
                nonvegPizza.addExtraCheese();
                nonvegPizza.takeAway();
                nonvegPizza.getBill();
                break;
            case 3:
                DeluxePizza veg = new DeluxePizza(true);
                veg.basePizzaPrice = 550;
                veg.addExtraToppings();
                veg.addExtraCheese();
                veg.takeAway();
                veg.getBill();
                break;
            case 4:
                DeluxePizza nonveg = new DeluxePizza(false);
                nonveg.basePizzaPrice = 650;
                nonveg.addExtraToppings();
                nonveg.addExtraCheese();
                nonveg.takeAway();
                nonveg.getBill();
                break;
            default:
                System.out.println("Wrong Input!!!!");
                return;
        }
        sc.close();
    }
}
