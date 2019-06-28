package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Коля", "Саша", "Маша"};
        names=Arrays.copyOf(names,names.length + 1);
        names[3]="Андрей";

        for (String s : names) {
            switch (s) {
                case "Коля":
                    System.out.println(s + " Good Morning!");
                    break;
                case "Саша":
                    System.out.println(s + " Good day!");
                    break;
                case "Маша":
                    System.out.println(s + " Good Evening!");
                    break;
                case "Андрей":
                    System.out.println(s + " Good buy!");
                    break;

            }









            }
        }


    }

