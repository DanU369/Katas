package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(explode("321"));

    }

    public static String explode(String digits) {
        String exploded="";
        for (int i = 0; i < digits.length(); i++) {
            int number=Character.getNumericValue(digits.charAt(i));
            int j=0;
            while (j<number) {
                exploded += digits.charAt(i);
                j++;
            }
        }
        return exploded;
    }
}
