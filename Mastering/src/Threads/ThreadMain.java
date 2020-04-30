package Threads;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // Construct myThread object.
        MyThread myThread = new MyThread("Alpha");

        // Construct an actual thread from our previous object.
        Thread newThread = new Thread(myThread);
        newThread.start();
    }
}

class MyThread implements Runnable{
    String myTread;
    public void run(){
        System.out.println(myTread + " Starting.");
        for(int count = 0; count < 10; count++){
            try {
                // Creating a sleep for 400 ms.
                Thread.sleep(1000);
                System.out.println("In " + myTread + " count is " + count);
            } catch (InterruptedException e) {
                System.out.println(myTread + " interrupted.");
                e.printStackTrace();
            }
            System.out.println(myTread + " terminated.");
        }
    }

    public MyThread(String myTread) {
        this.myTread = myTread;
    }
}
