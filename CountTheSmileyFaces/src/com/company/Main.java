package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":D");
        a.add("X-}");
        a.add("xo)");
        a.add(":X");
        a.add(":-3");
        a.add(":3");
        System.out.println(countSmileys(a));
    }

    public static int countSmileys(List<String> arr) {
        int numberOfSmileys = 0;
        for (String smiley : arr) {
            String[] splitSmiley = smiley.split("");
            if (smiley.length() == 2) {
                if (validEyes(splitSmiley[0]) && validMouth(splitSmiley[1])) {
                    numberOfSmileys++;
                }
            } else if (smiley.length() == 3) {
                if (validEyes(splitSmiley[0]) && validNose(splitSmiley[1]) && validMouth(splitSmiley[2])) {
                    numberOfSmileys++;
                }
            }
        }
        return numberOfSmileys;
    }

    public static boolean validEyes(String symbol) {
        return symbol.equals(":") || symbol.equals(";");
    }

    public static boolean validNose(String symbol) {
        return symbol.equals("-") || symbol.equals("~");
    }

    public static boolean validMouth(String symbol) {
        return symbol.equals(")") || symbol.equals("D");
    }
}
