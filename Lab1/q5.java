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
public class q5 {
              public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                  System.out.println("size of array :");
        int sizeOfArray =sc.nextInt();
                  System.out.println("No of elements");
        int numberOfElement=sc.nextInt();
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<numberOfElement;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<numberOfElement;i++){
            int c=0;
            for(int j=0;j<numberOfElement;j++){
                if(arr[i]==arr[j]){
                    c++;
                    
                    
                    
                } 
                
            } 
            System.out.println("Element "+arr[i]+" has frequency "+c);
                    
        }
            
    }

    
}
