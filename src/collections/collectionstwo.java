/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.*;

/**
 *
 * @author grace
 */
public class collectionstwo {
    
    public static void main(String[] args){
        int[] numbers = {5, 3, 17, 25, 4, 33, 45, 12};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean[] responses = {true, false, false, true, true};
        boolean[] responses2 = {false, true, false, true, true};
        
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorting: " +  Arrays.toString(numbers));
        
        int key = 25;
        int keyPosition = Arrays. binarySearch(numbers, key);
        System.out.println("Your key was found in position " + keyPosition);
        
        char keychar = 'b';
        int charposition = Arrays.binarySearch(vowels, keychar);    
        System.out.println("Your letter is in position " + charposition);
        
       if(Arrays.equals(responses, responses2)== true)
           System.out.println("The two boolean arrays are equal");
       else
           System.out.println("The two boolean arrays are different");
       int[] numbers2 = Arrays.copyOf(numbers, numbers.length*2);
       System.out.println("Copy array: "+ Arrays.toString(numbers2));
       
        
    }
}
