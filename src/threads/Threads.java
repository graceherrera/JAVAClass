/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author grace
 */
public class Threads {
    
    public static void main(String[] args){
        int iterations = 3;
        
        MyThread thread = new MyThread();
        
        thread.start();
        
        try {
            for (int i = 0; i < iterations; i++) {
                System.out.println("from main process");
                Thread.sleep(3000);

            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
