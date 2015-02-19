package com.oca.buildingblocks.variable.primitives.operations;


public class Unary {

    public static void main(String... args) {

        byte i = 127;
        byte ii = ++i; //remain byte

        //int x = !5; // DOES NOT COMPILE
        //boolean y = -true; // DOES NOT COMPILE

        int u = 3;
        int unary = ++u * 5 / u-- + --u;
        //int y = 4 * 5 / 4 + 2;


    }
}
