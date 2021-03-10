package com.company;

public class Main {


    // Some Variables
    static int working_hour = 28;
    static int working_rate = 7;
    static String worker_level = "Top Rated";
    static String name = "Me";
    static String student = "Java Programming";
    static String work = "Freelancer";
    static String lived = "Bangladesh";


    public static void main(String[] args) {
        // write your code here

        // main functions
        System.out.println("Welcome This is :" + name);
        System.out.println("I,m a :" + student);
        System.out.println("I,m Working As " + work + " Lived in " + lived);
        int net_work = working_hour*4;
        System.out.println("This Month You Worked => " +net_work+" Hours");
        System.out.println("Your Net Balance => " +net_work*working_rate +" USD");
        System.out.println("You Badge is =>" +worker_level);



    }
}
