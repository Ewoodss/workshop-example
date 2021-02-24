package com.avans;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Students!");
        System.out.println(sum(12, 12));
        System.out.println(mul(12, 12));
        System.out.println(mul(12.0, 12.0));
        mergeConflict("This creates a merge conflict!!");
        superCooleFunctie();
    }


    public static void superCooleFunctie()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("Coolheid laden: " + i + "% cool" );
        }
        System.out.println("Coolheid laden Voltooid");
    }

    public static int sum(int a, int b ) {
        return a+b;
    }

    public static int mul (int a, int b) {
        return a*b;
    }

    public static double mul (double a, double b) {
        return a*b;
    }

    public static void mergeConflict(String text) {
        System.out.println(text);
    }

    public static void eigenwijs () {
        System.out.println("Eigenwijs!");
    }
}
