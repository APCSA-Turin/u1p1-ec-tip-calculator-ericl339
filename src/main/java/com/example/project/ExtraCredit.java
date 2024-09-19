package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                //COPY AND PASTE YOUR CODE HERE 
                       
        double tipAmount = (((double) percent / 100) * cost) - 0.000001;
        tipAmount = Math.round(tipAmount * 100.0) / 100.0; // I learned this from https://www.educative.io/answers/how-to-use-the-java-mathround-method

        double totalBillWithTip = tipAmount + cost;

        double perCostBeforeTip = (cost / people) - 0.000001;
        perCostBeforeTip = Math.round(perCostBeforeTip * 100.0) / 100.0;

        double tipPerPerson = (tipAmount / people) - 0.000001;
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;

        double totalCostPerPerson = (totalBillWithTip / people) - 0.000001;
        totalCostPerPerson = Math.round(totalCostPerPerson * 100.0) / 100.0;


        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("\n");
        result.append("Total percentage: " + percent + "%");
        result.append("\n");
        result.append("Total tip: " + "$" + tipAmount);
        result.append("\n");
        result.append("Total Bill with tip: " + "$" + totalBillWithTip);
        result.append("\n");
        result.append("Per person cost before tip: " + "$" + perCostBeforeTip);
        result.append("\n");
        result.append("Tip per person: " + "$" + tipPerPerson);
        result.append("\n");
        result.append("Total cost per person: " + "$" + totalCostPerPerson);
        result.append("\n");
        result.append("-------------------------------\n");


        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items = ""; 

        //Your scanner object and while loop should go here

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an item name or type '-1' to finish: ");
        String name = scan.nextLine();
        
        if (!"-1".equals(name)) {
            items += name;
            items += "\n";;
        }

        while (!"-1".equals(name)) { //I learned this from https://stackoverflow.com/questions/8484668/java-does-not-equal-not-working
            System.out.print("Enter an item name or type '-1' to finish: ");
            name = scan.nextLine();
            if (!"-1".equals(name)) {
                items += name;
                items += "\n";;
            }
        }

        System.out.println(calculateTip(people,percent,cost,items));
    }
}
