///q2*********
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
public class Assignment2a {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int sizeOfArray =sc.nextInt();
        System.out.println("Enter the number of elements of Array: ");
        int numberOfElement=sc.nextInt();
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<numberOfElement;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<numberOfElement;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("Index of Inserttion : ");
        int  position=sc.nextInt();
        System.out.println("Enter the value to be inserted ; ");
        int element=sc.nextInt();
        for(int j=numberOfElement-1;j>=position;j--){
            arr[j+1]=arr[j];
        }
        arr[position]=element;
        numberOfElement++;
        for(int i=0;i<numberOfElement;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

