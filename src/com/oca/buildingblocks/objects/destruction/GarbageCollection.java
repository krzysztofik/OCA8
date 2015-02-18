package com.oca.buildingblocks.objects.destruction;


import java.util.ArrayList;
import java.util.List;

public class GarbageCollection {


    private static List<GarbageCollection> objects = new ArrayList<>();

    // This method gets called if the garbage collector tries to collect the object.
    //If the garbage collector doesn’t run, the method doesn’t get called.
    // If the garbage collector fails to collect the object
    //and tries to run it again later, the method doesn’t get called a second time
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        objects.add(this); //ups object is no longer eligible for garbage collection because a static variable is referring to it
    }

    public static void main(String[] args) {

        System.gc(); //suggests that now might be a good time for Java to kick off a garbage collection run. Java is free to ignore the request.

        /*
        * An object will remain on the heap until it is no longer reachable. An object is no longer
        * reachable when one of two situations occurs:
        * - The object no longer has any references pointing to it.
        * - All references to the object have gone out of scope.
        */

     }
}
