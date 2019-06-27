package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Коля", "Саша", "Маша"};
        for (String s : names) {
            switch (s) {
                case "Коля":
                    System.out.println(s + " Good Morning!");
                    break;
                case "Саша":
                    System.out.println(s+" Good day!");
                    break;
                case "Маша":
                    System.out.println(s + " Good Evening!");
                    break;

            }


        }
    }
}

