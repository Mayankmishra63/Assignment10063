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
public class q3{ 
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n =sc.nextInt();
        System.out.println("Enter the number of elements of Array");
        int totalElement=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<totalElement;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<totalElement;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("Index of dleetion : ");
        int  loc=sc.nextInt();
        for(int j=loc;j<totalElement;j++){
            arr[j]=arr[j+1];
        }
       
        totalElement--;
        for(int i=0;i<totalElement;i++){
            System.out.print(arr[i]+" ");
        }        
    }
    
}

