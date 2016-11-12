/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.lang.*;
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
        
        
    }
}
