package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Коля", "Саша", "Маша"};
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println(names[i] + " Good Morning!");
                    break;
                case 1:
                    System.out.println(names[i] + " Good day!");
                    break;
                case 2:
                    System.out.println(names[i] + " Good Evening!");
                    break;

            }


        }
    }
}

