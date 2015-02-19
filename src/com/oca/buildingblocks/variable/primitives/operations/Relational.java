package com.oca.buildingblocks.variable.primitives.operations;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Relational {

    /*
    1.  Comparing two numeric primitive types. If the numeric values are of different data
        types, the values are automatically promoted as previously described. For example,
        5 == 5.00 returns true since the left side is promoted to a double.
    2. Comparing two boolean values.
    3. Comparing two objects, including null and String values.

    */

    public static void main(String... args) {

        List example = new ArrayList();
        example.add(new Date());
        Object element = example.get(0);

        if (element instanceof String) {
            element = ((String) element).toLowerCase();
        }
        System.out.print(element);

        /*
        boolean x = true == 3; // DOES NOT COMPILE
        boolean y = false != "Giraffe"; // DOES NOT COMPILE
        boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE
        */

        /*
        if(x != null & x.getValue() < 5) { // Throws an exception if x is null
        // Do something
        }


        if(x != null && x.getValue() < 5) { // now is better
        // Do something
        }
         */
    }
}
