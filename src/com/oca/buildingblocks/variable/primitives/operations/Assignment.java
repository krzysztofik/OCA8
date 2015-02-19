package com.oca.buildingblocks.variable.primitives.operations;


public class Assignment {


    public static void main(String... args) {

     /*
        int x = 1.0; // DOES NOT COMPILE
        short y = 1921222; // DOES NOT COMPILE
        int z = 9f; // DOES NOT COMPILE
        long t = 192301398193810323; // DOES NOT COMPILE
        short z = x * y; // DOES NOT COMPILE

     */
        int x = (int)1.0;
        short y = (short)1921222; // Stored as 20678
        int z = (int)9L;
        long t = 192301398193810323L;
        short zz = (short)(x * y);

        long xx = 5;
        long yy = (xx=3); //it returns a value of the assignment, which is 3
        System.out.println(xx); // Outputs 3
        System.out.println(yy); // Also, outputs 3

        int a = 10, b = 20, c = 10;



    }
}
