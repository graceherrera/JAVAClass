/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;
import static kiss.API.outClose;
import static kiss.API.outExpect;
import static kiss.API.println;

/**
 *
 * @author grace
 */
public class Boxing {
    void testRun() {
        outExpect("Hello World!");
        run();
        outClose();
    }
    void run() {
        println ("Hello World!");
    }
    
    
    void testBoxing(){
        Integer x = new Integer(3);
        Integer y = x;
        //++x; same thing 
        x = new Integer(x.intValue() +1);
        assert x.intValue() == 4;
        assert y.intValue() == 3;
        assert y != new Integer(3);// references a new box that references 3
        assert y.equals(new Integer(3));
        assert y.compareTo(new Integer(3)) == 0;
    }
    
    void testArrayListInt() {
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //This is an empty list for integers 
    }
}
