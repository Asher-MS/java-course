// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner; // Needed for the Scanner class to read input

public class custom_order {

  // STEP 1 PRINTING HELLO WORLD TO CONSOLE
  public static void main(String[] args) {

    // System.out.println("Hello World!"); // print Hello World to console

    // TEST CODE

    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, &
    // PRINT STATEMENTS
    Scanner keyboard = new Scanner(System.in);
    String firstName;
    String itemOrder;
    String frostingType;
    String fillingType;
    String toppings;
    String input;

    double cost = 15.00;
    final double TAX_RATE = 0.08;
    double tax;

    System.out.println("Welcome to Java's Cake and Cupcake Shop");
    System.out.println("We make custom cakes with our secret cake batter");
    System.out.println("What is your name");
    firstName = keyboard.nextLine();
    System.out.print(firstName + " please see our menu below");
    System.out.print("\n");
    System.out.println("_______________________________________________");
    System.out.println("        MENU         QUANTITY    BASE COST  ");
    System.out.println("_______________________________________________");
    System.out.println("        Cake                     1            $15     ");
    System.out.println("   Set of Cupcakes       6            $15     ");
    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
    System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
    System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
    System.out.println("_______________________________________________");

    System.out.println("Do you want CUPCAKES or a CAKE");
    itemOrder = keyboard.nextLine();
    System.out.println("What type of FROSTING do you want? ");
    System.out.println("Vanilla, Chocolate, Strawberry or Coco");
    frostingType = keyboard.nextLine();

    System.out.println("What type of FILLING do you want? ");
    System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
    fillingType = keyboard.nextLine();

    System.out.println("What type of TOPPINGS do you want? ");
    System.out.println("Sprinkles, Cinnamon, Cocoa, Nuts");
    toppings = keyboard.nextLine();

    System.out.println("________________");
    System.out.println("Item" + itemOrder);
    System.out.println("Frosting" + frostingType);
    System.out.println("Filling" + fillingType);
    System.out.println("Toppings" + toppings);
    System.out.println("________________");
  }
}