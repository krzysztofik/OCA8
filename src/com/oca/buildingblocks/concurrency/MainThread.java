package com.oca.buildingblocks.concurrency;

import static java.lang.Thread.State;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {

        Thread mainThread = Thread.currentThread();

        long id = mainThread.getId();
        String name = mainThread.getName();
        int priority = mainThread.getPriority();
        State state = mainThread.getState();
        String threadGroupName = mainThread.getThreadGroup().getName();
        System.out.println("id="+id+"; name="+name+"; priority="+priority+"; state="+state+"; threadGroupName="+threadGroupName);
    }
}
