package com.oca.buildingblocks.concurrency;

import static java.lang.Thread.State;

public class Threads {

    public static void main(String[] args) throws InterruptedException {

        Thread mainThread = Thread.currentThread();

        long id = mainThread.getId();
        String name = mainThread.getName();
        int priority = mainThread.getPriority();
        State state = mainThread.getState();
        String threadGroupName = mainThread.getThreadGroup().getName();
        System.out.println("id="+id+"; name="+name+"; priority="+priority+"; state="+state+"; threadGroupName="+threadGroupName);

        Thread threadOne = new Thread(Threads::iterate);
        threadOne.setPriority(10);

        Thread threadTwo = new Thread(Threads::iterate);
        threadTwo.setName("lowerPriority");
        threadTwo.setPriority(1);

        System.out.println("threadOneGroupName = "+threadOne.getThreadGroup().getName());
        System.out.println("threadTwoGroupName = "+threadTwo.getThreadGroup().getName());
        threadOne.start();
        threadTwo.start();

        iterate();

    }

    private static void iterate() {
        for (int i = 0; i < 99999999; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
