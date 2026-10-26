package com.pluralsight;

import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static String[] listFamousQuotas = {
            "To be, or not to be, that is the question.",
            "I can't change the direction of the wind, but I can adjust my sails to always reach my destination.",
            "Be the change that you wish to see in the world.",
            "The greatest glory in living lies not in never falling, but in rising every time we fall.",
            "Life is what happens when you're busy making other plans.",
            "Darkness cannot drive out darkness; only light can do that. Hate cannot drive out hate; only love can do that.",
            "Two roads diverged in a wood, and I—I took the one less traveled by, and that has made all the difference.",
            "A journey of a thousand miles begins with a single step.",
            "You only live once, but if you do it right, once is enough.",
            "That's one small step for a man, one giant leap for mankind.",};

    public static void main(String[] args) {
        mainDisplay();
    }

    private static void mainDisplay(){
        String abcs = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        println("""
                please enter 1-10 to see a famous quote in register""");
        try {
            String[] listFamousQuotas1 = listFamousQuotas;
            String[] abcList = abcs.split(" ");
            String result = "";

            for (String i: abcList){
                print("| enter here ->: ");
                String enterResult=scanner.nextLine();

                if (enterResult.equals(i)){
                    result = enterResult;
                    break;
                } else {
                    println("*Invalid input please enter a number(1-10)*");
                }
            }
            int index = Integer.getInteger(result);
            index--;
            println(String.valueOf(index));

            System.out.println(listFamousQuotas1[index]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void print(String text){
        System.out.print(text);
    }
    public static void println(String text){
        System.out.println(text);
    }
}