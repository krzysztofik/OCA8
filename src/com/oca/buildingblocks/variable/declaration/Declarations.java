package com.oca.buildingblocks.variable.declaration;



public class Declarations {

    public static void main(String[] args) {
        String s1, s2;
        String s3 = "yes", s4 = "no";
        int i1, i2, i3 = 0; // only one of those values was initialized: i3 !!

        // int num, String value; // DOES NOT COMPILE
        // double d1, double d2; // not legal

        /* NOT LEGAL identifier names

            abstract assert boolean break byte
            case catch char class const*
            continue default do double else
            enum extends false final finally
            float for goto* if implements
            import instanceof int interface long
            native new null package private
            protected public return short static
            strictfp super switch synchronized this
            throw throws transient true try
            void volatile while
             */
    }
}
