package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rm = new Random();
          String[] ingredients = {"rice", "meat", "beans", "salsa", "veggies","cheese","guac", "queso", "sour cream"};
          String ingrid = ingredients[rm.nextInt(10)]; // 10 = 0 -9

          String[] rice = {"white", "brown", "none", "all"};
          String ris = rice[rm.nextInt(5)]; // 5 = 0 - 4
          String[] meat = {"chicken", "steak", "carnidas", "chorizo", "veggies", "none", "all"};
          String carn = meat[rm.nextInt(8)]; // 8 = 0 - 7
          String[] beans = {"pinto", "black", "none", "all"};
          String frijoles = beans[rm.nextInt(5)]; // 5 = 0 - 4
          String[] salsa = {"mild", "medium", "hot", "none", "all"};
          String sauce = salsa[rm.nextInt(6)];  // 6 = 0 - 5;
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