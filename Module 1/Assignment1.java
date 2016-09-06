/**
 * Nestor Alvarez
 * CS 11B Spring 2016
 * 21 January 2016
 */

import java.util.Scanner;
import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) {
    
        int arr[] = {4, 3, 4, 5, 4, 3, 2, 1}; 
        
        int temp = 0;
        int count = 0;
     
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] < arr[i]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i = -1;
            }
            count++;
            System.out.println(count);
        }
        
        System.out.println(Arrays.toString(arr));
    
    }
     
//     public int[] bubble_sort(int[] arr) {
//      
//         int temp = 0;
//      
//         for(int i = 0; i < arr.length - 1; i++) {
//             if(arr[i+1] < arr[i]) {
//                 temp = arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1] = temp;
//                 i = 0;
//             }
//         }
//         
//         return arr;
//      
//     }
}