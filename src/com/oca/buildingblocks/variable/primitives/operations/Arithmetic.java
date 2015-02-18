package com.oca.buildingblocks.variable.primitives.operations;


public class Arithmetic {


/*    Numeric Promotion Rules
        1. If two values have different data types, Java will automatically promote one of the val-
        ues to the larger of the two data types.
        2. If one of the values is integral and the other is floating-point, Java will automatically
        promote the integral value to the floating-point value’s data type.56

        3. Smaller data types, namely byte , short , and char , are first promoted to int any time
        they’re used with a Java binary arithmetic operator, even if neither of the operands is
        int .
        4. After all promotion has occurred and the operands have the same data type, the result-
        ing value will have the same data type as its promoted operands.*/


    public static void main(String[] args) {
        short a = 1;
        byte b = 3;
        int c = a + b; // gives int

        float d = 1.1f;
        float e = 1.2f;
        float de = d + e; //gives float

        short x = 14;
        float y = 13;
        double z = 30;
        double xyz = x * y / z; //gives double

        byte i = 127;
        byte ii = ++i; //remain byte

        //int x = !5; // DOES NOT COMPILE
        //boolean y = -true; // DOES NOT COMPILE

        int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0

        int u = 3;
        int unary = ++u * 5 / u-- + --u;
        //int y = 4 * 5 / 4 + 2;


        long xx = 10;
        int yy = 5;
        yy *= xx; // compiler will automatically cast the resulting value to the data type of the value on the left-hand side of the compound operator


    }

}
