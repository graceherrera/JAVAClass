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
    
    void run() {
        println("Hello!");
   
    }
    
    void testBooleans(){
        assert true !=false;
        assert true == true;
        assert false == false;
    }   
    
    void testInts(){
        assert Integer.MAX_VALUE == Math.pow(2,31)-1;
        println(Integer.MAX_VALUE);
        assert Integer.MAX_VALUE == 2_147_483_647;
        assert Integer.MAX_VALUE == 0b0111_1111_111111111111111111111111;
       
        assert Integer.MIN_VALUE == -Math.pow(2,31);
        println(Integer.MIN_VALUE);
        assert Integer.MIN_VALUE == -2_147_483_648;
        assert Integer.MIN_VALUE == 0b1000_0000_0000_00000000000000000000;
       
        assert Integer.MIN_VALUE - 1 == Integer.MAX_VALUE;
        assert Integer.MAX_VALUE + 1 == Integer.MIN_VALUE;
        
        int x = 3;
        int y = 0xff_ff;
        int z = 0b1001;
        
        assert x ==3;
        println (y);
        assert y == 65_535;
        assert z == 9;
                //bitewise and
        assert(0b1111_0000 & 0b1010_1010) == 0b1010_0000;
        //bitwise or
        assert(0b1111_0000 | 0b1010_1010) == 0b1111_1010;
        //bitwise shift operator 
        assert (0b1010_1111_0000 >> 4) == 0b1010_1111;
        assert (0b1010_1111_0000 << 4) == 0b1010_1111_0000_0000;
        
        int b = random (0, 1_000_000);
       
        assert ((b >> 1) == b/2);
        assert (((-b) >> 1) == -b/2);
        assert ((b << 1) == 2*b);
        assert (((-b)<<1) == 2*(-b));
        
        
        println(b);
        
        int c = random(-1_000_000, 1_000_000);
        assert ((~c)+1) == -c;
        assert -2 == 0b1111_1111_1111_1111_1111_1111_1111_1110;
        
        //right shifts shift the sign bit in (highest order bit)
        assert (-2 >> 1) == 0b1111_1111_1111_1111_1111_1111_1111_1111;
        
        //how do- you represent -2 in two's complement
        println(Integer.toString(-2, 2));
        
        
    }
      
    void testConvert(){
        byte x = -1;
        //casting notation
        assert x == (byte) 0b1111_1111;
        int y = x;
        assert y == -1;
    }
    
    void untesttestLoop(){
        try (Close out = outExpect (0, EOL, 1, EOL, 3, EOL)) {
            int n =4;
            int i = 0;
            while (i < n){
                if (i == 2){
                    ++i;
                    continue;
                }
                println(i);
                ++i;
            }
        }
    }
    
    void testString(){
        String hi = "hello";
        assert hi.length() == 5;
        assert hi.substring (1, 3).equals("el");
        
        hi = hi + " world";
        
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append (" world");
        sb.append(" #");
        sb.append(13);
        String hw = sb.toString();
        println(hw);
    }
    
    void testClock(){
    Clock clock = test(new Clock ());
}
    void untestTimezoneClock() {
        TimezoneClock tzClock = testAlways (new TimezoneClock());
    }
    
    void testBoxing(){
        Boxing boxing = test(new Boxing ());
    }
    
    
    

}

