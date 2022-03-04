package Basics;

public class Variable1
{  
    static int m=100;//static variable  
    void method()  
    {    
        int n=90;//local variable  
        System.out.println(n);
    }  
    public static void main(String args[])  
    {  
        int data=50;//instance variable
        Variable1 v = new Variable1();
        v.method();
        System.out.println(data);
        
        
    }  
    
}