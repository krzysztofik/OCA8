package com.oca.buildingblocks.variable.initialization;


public class Local {

    //A local variable is a variable defined within a method. Local variables must be initialized
    //before use. They do not have a default value and contain garbage data until initialized
    public static void main(String[] args) {

        int y = 10;
        int x; //compile until you will not try to use it
        //int reply = x + y; // DOES NOT COMPILE
    }


    public void findAnswer(boolean check, int x) {
        int answer;
        int onlyOneBranch;
        int tricky;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }

        if (x>0) {
            tricky = 1;
        }
        if (x<=0) {
            tricky = -1;
        }

        System.out.println(answer);
        // System.out.println(onlyOneBranch); // DOES NOT COMPILE
        //System.out.println(tricky); // Not compile, because compilator treats if statement separately
    }
}
