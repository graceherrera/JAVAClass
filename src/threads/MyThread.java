/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;
import java.lang.*;
import java.util.Iterator;

/**
 *
 * @author grace
 */
public class MyThread extends Thread {

    @Override
    public void run() {
       int iterations = 5;
        try {
            for (int i = 0; i < iterations; i++) {
                System.out.println("From secondary thread");
                sleep(2000);
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
            
    }
}
