//q1
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author acer
 */
public class Q1 {
    public void area(int l,int b){
        System.out.println("area of Rectangle ="+l*b);
        
    }
    public void area(double r ){
        System.out.println(" area of circle ="+(3.14)*r*r);
        
    }
    public void area(int r ){
        System.out.println(" area of square ="+r*r);
        
    }
    public void perimeter(int l,int b){
        System.out.println("Perimeter of Rectangle ="+2*(l+b));
        
    }
    public void perimeter(double r ){
        System.out.println(" perimeter of circle ="+(3.14)*r*2);
        
    }
    public void perimeter(int r ){
        System.out.println(" perimetert of square ="+4*r);
        
    }
    
}
class main{
        public static void main(String[] args) {
            Q1 t=new Q1();
            t.area(3,4);
            t.area(3.5);
            t.area(3);
            t.perimeter(3,4);
            t.perimeter(3.5);
            t.perimeter(3);
            
            
        }
}

    


///q2
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Q2 {
    
    
    static boolean validate(String s){
        for(int i=0;i<s.length();i++){
            if(!Character.isLetter(s.charAt(i))){
                return false;
            
            }
                
        }
        return true;
        
    }
    static boolean validate(int age){
        if(age>3 && age<15){
            return true;
        }
        return false;
        
    }
    
}

class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name:");
        String name =s.nextLine();
        System.out.println("Enter Age");
        int Age=s.nextInt();
        Q2 t=new Q2();
        if(t.validate(name)){
            System.out.println("All char is Alphbhet");
        }
        if(t.validate(Age)){
            System.out.println("Age is between 3 and 15");
        }
        
        
    }
}

////q3
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author acer
 */
class Q3 {
    public void no_of_Arguments(int...a){
        System.out.println("Length of arguments "+a.length);
    }
    public void max(int...a){
        int max=-1000000;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("Max number is "+ max);
    }
    public void sum(int...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum is "+ sum);
        
    }

    void lower(String s1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
        
}

class gk{
        public static void main(String[] args) {
            Q3 t=new Q3();
            t.no_of_Arguments(10,20,30,40);
            t.max(10,20,30,40);
            t.sum(10,20,30,40);
            //t.no_of_Arguments(10,20,30,40,c);
        }
}
    

    

   


/////q4
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author acer
 */
public class Q4 {
    public void lower(String s){
        String lower=s.toLowerCase();
        System.out.println("after conversion string becomes "+ lower);
    }
    public void length(String s){
        int n=s.length();
        System.out.println("length of string is = "+n);
    }
    
}
class kt{
    public static void main(String[] args){ 
        Q4 t=new Q4();
        char c[]={'S','a','n','C','h','i','t'};
        String s1= new String(c);
        t.lower(s1);
        t.length(s1);
    
        
    }
    
    
}

////q5
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author acer
 */
public class q5{
        public void sum(int arr[]){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            System.out.println("sum ="+sum);
        }
        public void reverse(int arr[]){
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]+" ");
                
            }
        }
    
}
class ck{
    public static void main(String[] args) {
        q5 t = new q5();
        t.sum(new int[]{10,20,30,40});
        t.reverse(new int[]{10,20,30,40});
    
        
    }
        
    
    

    
}

///q6
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author acer
 */
public class q6 {
    public void dispaly(int a){
        System.out.println(" int "+a);
    }
    public void display(double a){
        System.out.println("double "+a);
    }
        
    
}
class tk{
    public static void main(String[] args) {
        q6 t=new q6();
        t.display('s');
        t.display(3);
        t.display(4.7);
    }
        
 
       
        
     
}

