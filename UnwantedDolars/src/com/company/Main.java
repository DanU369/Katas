package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(moneyValue("$-2.34zz56"));
    }

    public static double moneyValue(String money){
        double amount;
        try {
            amount=Double.parseDouble(money.replace(" ","").replace("$",""));
        }catch (Exception e){
            amount=0;
        }

        return amount;
    }
}
