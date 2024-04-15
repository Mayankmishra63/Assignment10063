//q1
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
public class Q1 {
    //<editor-fold defaultstate="collapsed" desc="/*comment*/">
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  :");    
        int sizeOfArray =sc.nextInt();
        System.out.println("Enter the number of elements :");
        int numberOfElement=sc.nextInt();
        int arr[]=new int[sizeOfArray];
        for(int i=0;i<numberOfElement;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<numberOfElement;i++){
            System.out.print(arr[i]+" ");
        }
    }
//</editor-fold>
    
    
}    
