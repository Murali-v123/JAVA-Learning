package thread;

import java.util.Scanner;

public class Threads {
    public static void main(String[] args) {
        Runnable obj=()->{
            for(int i=0;i<5;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

         Runnable obj1=()->{
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1=new Thread(obj);        
        Thread t2=new Thread(obj1);

        t1.start();
        t2.start();

        Scanner s=new Scanner(System.in);
        // System.out.print("Enter our age:"); to take input on the same line
        System.out.println("Enter your age:"); //to take input on the next line
        int age=s.nextInt();

        System.out.println("Age:"+age);

        s.close();
    }
}
