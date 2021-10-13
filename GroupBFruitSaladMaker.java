// Java program for getter and setter 
/*
Assignment 4: COMP 1130.
Group B.
Group Members: Anthony, Jay, Ujjwal and Vinit.

Date: October 9th, 2021.
*/

package Assignment_4;

import java.util.Scanner;

public class GroupBFruitSaladMaker {

	public static void main(String[] args) {
	
	FruitIngredients object = new FruitIngredients(); //Class object created.
		
	Scanner input = new Scanner(System.in); //Scanner object created.
	  
	System.out.println("Enter how many grams of pineapple you want: ");
	double pineapple = input.nextDouble();
	System.out.println("Enter how many grams of cherry you want: ");
	double cherry = input.nextDouble();
	System.out.println("Enter how many grams of apple you want: ");
	double apple = input.nextDouble();
	System.out.println("Enter how many grams of dragonfruit you want: ");
	double dragonfruit = input.nextDouble();
		
	String show = "";
        double sum = pineapple + cherry + dragonfruit + apple;	// Calculation for total ingredients.
	
	/* Nested if else created.*/
 	if(pineapple <= 0){
		show = "Cherry, DragonFruit, and Apple\n";
		if(cherry <= 0){
			show = "DragonFruit, and Apple\n";
			if(dragonfruit <= 0){
				show = "Apple\n";
				if(apple <= 0){
					show = "Nothing Selected :(\n";
				}
			}
		}
	}
	else{
		show = "PineApple, Cherry, DragonFruit, and Apple\n";
		if(cherry <= 0){
			show = "PineApple, DragonFruit, and Apple\n";
		}
		else{
			show = "PineApple, Cherry, DragonFruit, and Apple\n";
			if(dragonfruit <= 0){
				show = "PineApple, Cherry, and Apple\n";
			}
			else{
				show = "PineApple, Cherry, DragonFruit, and Apple\n";
				if(apple <= 0){
					show = "PineApple, Cherry, and DragonFruit\n";
				}
				else{
					show = "PineApple, Cherry, DragonFruit, and Apple\n";
				}
			}
		}
	}
	
	object.setWeigth(sum); // setter function called for weight.
        object.setIngredients(show); // setter function called for ingredients.
		
	System.out.print("Thank you for your order! Your fruit salad is ready.");
        System.out.printf("Total weight of your salad is %.2fg, Ingredients: %s",object.getWeigth(), object.getIngredients());
	scan.close();
	
	}
}

class FruitIngredients{
    private double weigth; // private variable
    private String ingredients; // private variable

    public double getWeigth(){return weigth;} //Getter method for weigth.
    public String getIngredients(){return ingredients;} //Getter method for ingredients.
    public double setWeigth(double product){ return this.weigth = product;} //Setter method for weigth.
    public String setIngredients(String taken){ return this.ingredients = taken; } //Setter method for ingredients.
}

