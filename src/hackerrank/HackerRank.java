/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package hackerrank;

import java.io.*;
import java.util.*;

/**
 *
 * @author grace
 */
//https://www.hackerrank.com/challenges/alternating-characters
public class HackerRank {

    /**
     * @param args the command line arguments
    */
    
    public static int delete(String str){
        int count=0;
   
        for(int i = 1; i<str.length(); ++i){
            if(str.charAt(i) == str.charAt(i-1)){
                ++count;
            }
            
        }
        return count;
    }
    
    public static void main(String[] args) {
       
      int del = 0;
        
      System.out.println("Please input a number less than 10 and a sequence"
              + "of A's and B's");
      Scanner input = new Scanner(System.in);
      
      int num = Integer.parseInt(input.next());
      
      String[] s = new String[(num+1)];
      for(int i = 0; i<(num+1); i++){
          s[i] = input.nextLine();
      }
      for(int i =0; i<(num+1); i++){
          System.out.println(delete(s[i]));
      }
     
     
      
    }
    
}
