package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter a set of numbers");
            String usrinput = scanner.nextLine().trim();
            char[] charslt = usrinput.toCharArray();
            if (isNumber(usrinput)){
                if (isEvenChar(charslt)) {
                    System.out.println("All numbers are even");
                } else {
                    System.out.println("Not all numbers are even");
                }
            }
        }

    }

    public static boolean isEvenChar(char[] chars) {
        int count = 0;
        int intarr[] = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            intarr[i] = chars[i];
        }
		
        for (int j = 0; j < intarr.length; j++) {
            if (intarr[j] % 2 != 0){
                count ++;
            }
            if (count > 0){
                return false;
            }

        }
        return true;

    }

    public static boolean isNumber(String input){
        long validate = 0;
        try{
            validate = Integer.parseInt(input);
            return true;
        }catch (Exception e){
            System.out.println("You must input numbers only!");
            return false;
        }

    }


}
