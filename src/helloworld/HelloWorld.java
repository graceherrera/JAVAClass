/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static kiss.API.*;

/**
 *
 * @author grace
 */
public class HelloWorld {
    void testRun() {
        try (Close out = outExpect("Hello!")) {
            run();
        }
    }
    
    void testAdd(){
        assert 1+1 ==2;
    }
    void run() {
        println("Hello!");
   
    }
    
}
