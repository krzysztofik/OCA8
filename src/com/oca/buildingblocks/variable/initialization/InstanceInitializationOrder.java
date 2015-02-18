package com.oca.buildingblocks.variable.initialization;



// The code between the braces is called a code block
// Sometimes code blocks are inside a method. These are run when the method is called.
// Other times, code blocks appear outside a method. These are called instance initializers

public class InstanceInitializationOrder {

    // The constructor runs after all fields and instance initializer blocks have run.
    public InstanceInitializationOrder() {
        number = 5;
    }

    public static void main(String[] args) {
        InstanceInitializationOrder example = new InstanceInitializationOrder();
        System.out.println(example.number);
        {   int  innerLocalVariable = 3;
            System.out.println(example.number + innerLocalVariable);
        }
        // innerLocalVariable is not visible outside code block
        //
        //System.out.println(innerLocalVariable);
    }

    private int number = 3;

    // Fields and instance initializer blocks are run in the order in which they appear in the file.
    { number = 4; }
}
