/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortinginteger;

import java.util.Arrays;

public class BubbleSortingInteger {

    public static void main(String[] args) {
        int[] array = { 01, 34, 25, 12, 92, 11, 90 };
        
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
   
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j=0; j< n-1;j ++){
               if(arr[j] < arr[j +1]){
                //swap temp and arr[i]
                int temp = arr[j];
                arr [j] = arr[j + 1];
                arr [j+1] = temp;
            }
        }
        
    }
    }
            
  
}
