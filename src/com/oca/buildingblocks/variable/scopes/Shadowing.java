package com.oca.buildingblocks.variable.scopes;


public class Shadowing {

    public static void main(String[] args) {
        int x = 2;
        {
            //int x = 3; will not compile !!! it is not allowed to shadow local variable by local variable from inner block
        }

        {
            int a = 2;
        }
        {
            int a = 3; // it is ok since both are in separate scopes
        }
    }

}
