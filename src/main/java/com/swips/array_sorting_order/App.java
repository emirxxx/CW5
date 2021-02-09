package com.swips.array_sorting_order;

import java.util.Scanner;




public class App {
 
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int numInput = Integer.parseInt(s.nextLine());
        String stringInput = s.nextLine();
        
        
        String[] stringArr = stringInput.split(" ");
        int[] intArr = new int[stringArr.length];
        
        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        
        System.out.println(fixedPointRecursive(intArr, 0, intArr.length - 1));
        
                
                
                
    }
    
    public static boolean fixedPointLinear(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            if (i == arr[i]) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean fixedPointBinary(int[] arr, int left, int right) {
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mid == arr[mid]) {
                return true;
            } else if (mid < arr[mid]) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        
        return false;
    }
    
    public static boolean fixedPointRecursive(int[] arr, int left, int right) {
        if (left > right) {
            return false;
        }
        
        int mid = left + (right - left) / 2;
        
        if (mid == arr[mid]) {
            return true;
        } else if (mid < arr[mid]) {
            return fixedPointRecursive(arr, left, mid - 1);
        } else {
            return fixedPointRecursive(arr, mid + 1, right);
        }
    }



    
}