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
public class q6 {
      public static void main(String[] args) {
        Scanner sc;
          sc = new Scanner(System.in);
          System.out.println("Enter n :");
        int n =sc.nextInt();
       
        int arr[]=new int[n];
        int even[]=new int[n];
        int odd[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even[j]=arr[i];
                j++;
                
            }
            else{
                odd[k]=arr[i];
                k++;
            }
        } 
        System.out.println(" Even ");
        for(int h=0;h<j;h++){
            System.out.print(even[h]);
        }
        System.out.println(" oDD ");
        for(int h=0;h<k;h++){
            System.out.print(odd[h]);
        }
      
    }
    
}
