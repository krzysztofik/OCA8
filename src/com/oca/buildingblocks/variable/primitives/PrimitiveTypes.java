package com.oca.buildingblocks.variable.primitives;


public class PrimitiveTypes {

    // read JLS 5.2 Assignment Conversion
    // when you're "converting" from int to byte, you're just truncating the bytes
    // when you're converting from double to float, you're making a complex not trivial operation, which can't be implicit

    //Java will automatically promote from smaller to larger data types
    //but it will throw a compiler exception if it detects
    //you are trying to convert from larger to smaller data types.


    public static void main(String[] args) throws NoSuchFieldException {

        // long x = 3_333_333_333;
        // compilation would fail due to integer number too large
        // need to tell compilator to treat literal as long
        long x = 3_333_333_333L;

        /*
            int x = 1.0; // DOES NOT COMPILE
            short y = 1921222; // DOES NOT COMPILE
            int z = 9f; // DOES NOT COMPILE
            long t = 192301398193810323; // DOES NOT COMPILE
        */

        //it works thanks to the compile-time narrowing of constants
        byte y = 3;

        //Without the narrowing, the fact that the integer literal 42 has type int would mean that a cast to byte would be required:
        byte z = (byte) 4; // cast is permitted but not required


        byte a = (byte)129; // casting is require since compile-time narrowing will not work (literal out of the byte range), then it gives -127

        System.out.println(a);

        //float b = 3.9;
        //will not compile, default float literal is double

        float b = 3.9F; //now it will compile. This conversion can lose precision, but also lose range.

        int bb = (int)1.0;

        float c = 3.999_999F;
        System.out.println(c);

        float cc = 3.999_999_9F;
        System.out.println(cc); //gives 4.0

        float d = (float)3.999_999_9; //gives 4.0
        System.out.println(d);

        double e = 3.999_999_999_9; // gives 3.9999999999
        System.out.println(e);

        int octal = 077; //63
        int hex = 0x11;  //17, can be also 0X
        int binary = 0b1111_1111; // 255, can be also 0B

        byte negative_binary =(byte) 0b1000_0001; //gives -127, why in this case need casting???

        System.out.println(octal + " " + hex + " " + binary + " " + negative_binary);

    }
}
