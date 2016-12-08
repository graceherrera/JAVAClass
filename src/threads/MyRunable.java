/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

//import static java.lang.Thread.sleep;

/**
 *
 * @author grace
 */
public class MyRunable implements Runnable {

    @Override
    public void run() {
        int iterations = 5;
        try {
            for (int i = 0; i < iterations; i++) {
                System.out.println("From runable");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
    
}
