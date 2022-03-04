package GRACELABSIT1ACandyMachine;

import java.util.Scanner;
public class CandyMachine {
static Scanner s = new Scanner(System.in);

public static int Choice(){
  int price = -1;
 System.out.println("Products Available:");
 System.out.println("A.       Candy       [15]");
 System.out.println("B.       Chips       [15]");
 System.out.println("C.       Gum         [10]");
 System.out.println("D.       Cookies     [30]");
 System.out.println("E.       Drinks      [20]");
 
 System.out.println();
 System.out.print("Which Candies do you like to purchase (Select letter): ");
 String Choices = s.next().toUpperCase();
 
 if(Choices.equals("A")){
   price = 15;
   return 15;
 }
  else if(Choices.equals("B")){
    price = 15;
    return 15;
  }
  else if(Choices.equals("C")){
    price = 10;
    return 10;
  }
  else if(Choices.equals("D")){
    price = 30;
    return 30;
  }
  else if(Choices.equals("E")){
    price = 20;
    return 20;
  }
  else{
    return price;
  }
}

public static void Dispenser(int Money,int CandiesPrice){
  if(Money > CandiesPrice){
    System.out.println("Thank you for choosing this shop");
    System.out.println("Here's your Order, I hope you like it!");
    int Change = Money - CandiesPrice;
    System.out.println("Here's your = " + Change + " in Change, Thank you for coming!!"); 
    System.out.println();
System.out.println("Please Come Again!");
  }
  else{
    System.out.println("Sorry your money is not enough, Here's your " + Money + "your Change");
  }
}

public static void main(String[] args){
  System.out.println("WELCOME TO GRACELA'S CANDY MACHINE");
  System.out.print("Enter your money's do you have : ");
  int Money = s.nextInt();
  
 int CandiesPrice = Choice();
 
 Dispenser(Money, CandiesPrice);
}
}