package org.my;

class AppMain
{

     public static void main(String[] args)
     {
         for (int i = 0; i < 10; i++) {
             Method1(args[0]);
         }

     }

     static void Method1(String argument){
         System.out.println("Method 1");     	
              Method2(argument);	
     }

     static void Method2(String argument){
         System.out.println("Method 2");        
         System.out.println(argument);      
     }
}
