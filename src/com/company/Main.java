package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rm = new Random();

        // Get a random number of ingredients
        int minMax = 0;  // range 5-9
          while(minMax < 5) {
              minMax = rm.nextInt(10);
          }

        // Random number of random numbers, into an ArrayList
          ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
          for (int i = 1; i < minMax; i++){
              randomNumbers.add(rm.nextInt(9));
          }

          String[] ingredients = {"rice", "meat", "beans", "salsa", "veggies","cheese","guac", "queso", "sour cream"};
          //String[] ingredients2 = {"ris", "carn", "frijoles", "sauce", "veg", "che", "que", "sour"};

          // Ingredient list based on random number list
          ArrayList<String> ingredientList1 = new ArrayList<String>();
          for (int i = 0; i < randomNumbers.size(); i++){
              ingredientList1.add(ingredients[i]);
          }

//          ArrayList<String> ingredientList2 = new ArrayList<String>();
//          for (int i = 0; i < randomNumbers.size(); i++){
//              ingredientList2.add(ingredients2[i]);
//          }

          // Works. Next step: loop into the chosen ingredients
          // don't use: String ingrid = ingredients[rm.nextInt(9)]; // [0,1,2,3,4,5,6,7,8]

          String[] rice = {"white", "brown", "none", "all"};
          //String ris = rice[rm.nextInt(4)]; // 4 = [0,1,2,3]
          String[] meat = {"chicken", "steak", "carnidas", "chorizo", "veggies", "none", "all"};
          //String carn = meat[rm.nextInt(7)]; //[0,1,2,3,4,5,6]
          String[] beans = {"pinto", "black", "none", "all"};
          //String frijoles = beans[rm.nextInt(4)]; // 5 = 0 - 4
          String[] salsa = {"mild", "medium", "hot", "none", "all"};
          //String sauce = salsa[rm.nextInt(5)];  // 6 = 0 - 5;
          String[] veggies = {"lettuce", "fajita veggies", "none", "all"};
          //String veg = veggies[rm.nextInt(4)];
          Boolean[] cheese = {true, false};
          //Boolean che = cheese[rm.nextInt(2)];
          Boolean[] queso = {true, false};
          //Boolean que = queso[rm.nextInt(2)];
          Boolean[] sourCream = {true, false};
          //Boolean sour = sourCream[rm.nextInt(2)];

        //Goal: Loop through each of these based on the ingredientsList1 list of names
        // from another array?  {"rice"}... arr[0]... {"brown"}
        // the list of names ... will not let me access the arrays they represent
        System.out.println(ingredientList1.get(0));
        System.out.println(ingredientList1.get(0));

           for (int i = 0; i < ingredientList1.size(); i++) {
                //SIMPLE: just get first of each array, then add randomness
// I have an array of array names
// Why can't I use an array name from that array, and use it to access another array?

               // i. how about random number bound based on array size?
               // ii. then use the random number to take from array?
               // System.out.println(ingredientList1.get(i));

           }
     }
}





// variable interpolation does not work #{}, ${};



// These are going to throw off the total ingredients:
// Control logic: if(all...
// Control logic: if(none...

// Essential:
// Polya Step 1: Build ONE random burrito, ONE ingredient, no for loop
// Polya Step 2: Build One random burrito, randomly 5-9 total ingredients
// Polya Step 3: Calculate ONE burrito price
// Polya Step 4: Loop 25 randomly generated burritos, calculate prices

// Bonus:
// Add all ingredients, display
// Add all prices, display
// Print receipt
// Optimal receipt

