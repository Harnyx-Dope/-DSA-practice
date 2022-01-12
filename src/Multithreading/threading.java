package Multithreading;

public class threading
{
    public static void main(String[] args) {
        Thread obj=Thread.currentThread();
        System.out.println(obj.getState());
        obj.setName("Harsh Vardhan gupta");
        System.out.println(obj.isAlive());
        System.out.println(obj.getName());
        System.out.println(obj.isDaemon());
        obj.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj.getPriority());
        System.out.println(obj.getId());
        System.out.println(obj.getThreadGroup());


        //  System.out.println(10 / 0);
    }
    }

