/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class q4 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("size of array:");
        int sizeOfArray =sc.nextInt();
          System.out.println("No of elements");
        int numberOfElement=sc.nextInt();
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<numberOfElement;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched :");
        int element=sc.nextInt();
        for(int i=0;i<numberOfElement;i++){
            if(arr[i]==element){
                System.out.println("Element "+element+" found at index "+i);
            }
        }

        
    }
        
        
    
}

