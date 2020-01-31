package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rm = new Random();

        int minMax = 0;  // range 5-9
          while(minMax < 5) {
              minMax = rm.nextInt(10);
          }
          System.out.println(minMax); // I have the number, 5-9

          String[] ingredients = {"rice", "meat", "beans", "salsa", "veggies","cheese","guac", "queso", "sour cream"};
          String ingrid = ingredients[rm.nextInt(9)]; // [0,1,2,3,4,5,6,7,8]

        //Use number to loop ingredients list... Error: getting same ingredient vs. num of random choices
        for(int i = 1; i < minMax; i++){
            System.out.println(ingrid);
        }



          String[] rice = {"white", "brown", "none", "all"};
          String ris = rice[rm.nextInt(4)]; // 4 = [0,1,2,3]
          String[] meat = {"chicken", "steak", "carnidas", "chorizo", "veggies", "none", "all"};
          String carn = meat[rm.nextInt(8)]; // 8 = 0 - 7
          String[] beans = {"pinto", "black", "none", "all"};
          String frijoles = beans[rm.nextInt(4)]; // 5 = 0 - 4
          String[] salsa = {"mild", "medium", "hot", "none", "all"};
          String sauce = salsa[rm.nextInt(5)];  // 6 = 0 - 5;
          String[] veggies = {"lettuce", "fajita veggies", "none", "all"};
          String veg = veggies[rm.nextInt(5)];
          Boolean[] cheese = {true, false};
          Boolean che = cheese[rm.nextInt(2)];
          Boolean[] queso = {true, false};
          Boolean que = queso[rm.nextInt(2)];
          Boolean[] sourCream = {true, false};
          Boolean sour = sourCream[rm.nextInt(2)];


// random number ranged 5-9 to select which ingredients to random select
// random number is bound, 0 to bound -1. For example, 5 = 0 - 4.

     }
}





// choose random num 5-9
// num loops main array, ingredients
// next loop goes through each chosen ingredient
// data can be .put() into a new array or ArrayList?
// continued: these arrays will be inside an array of burritos
// loop this new array of arrays, 24 burritos with each particular
// get ingredients, price total


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

/*
        Rice: white, brown, none, all
        Meat: chicken, steak, carnidas, chorizo, sofritas, veggies, none, all
        Beans: pinto, black, none, all
        Salsa: mild, medium, hot, none, all
        Veggies: lettuce, fajita veggies, none, all
        Cheese: yes/no
        Guac: yes/no
        Queso: yes/no
        Sour cream: yes/no
*/