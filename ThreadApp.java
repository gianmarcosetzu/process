package threadapp;

import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread extends Thread{
   
    @Override
    public void run(){
        for(int c=0;c<10;c++){
            System.out.println(this.getName() + " value: " +c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
               
            }
            
        } 
    }
}
public class ThreadApp {

    
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.setName("thread one");
       t1.start();
       
       MyThread t2=new MyThread();
        t2.setName("thread two");
       t2.start();
    }
    
}
