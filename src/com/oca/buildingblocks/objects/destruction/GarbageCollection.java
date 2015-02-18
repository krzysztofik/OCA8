package com.oca.buildingblocks.objects.destruction;



public class GarbageCollection {

    // This method gets called if the garbage collector tries to collect the object.
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
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
