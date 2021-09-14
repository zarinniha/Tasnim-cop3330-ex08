/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class pizzaparty{

    public static void main(String args[])
    {
        System.out.print("How many people? ");
        Scanner sc = new Scanner(System.in); //reading the number of people
        int people = sc.nextInt();

        System.out.print("How many pizzas? ");
        double pizza = sc.nextDouble();//reading number of pizzas

        System.out.print("How many slices per pizza? ");
        double slice = sc.nextDouble();//reading the number of slices for each pizzas

        double total_slice = pizza * slice;
        double per_slice = total_slice/people;
        double leftovers = total_slice%people;

        System.out.println(people+" person gets "+per_slice+" pieces of pizzas.");
        System.out.println("There are "+leftovers+" leftover pieces");

    }
}