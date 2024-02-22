package com.mycompany.modifier;


class Person {
     private String name;
    
     public void setName(String name){
         this.name = name;
     }
     
     public String getName(){
         return this.name;
     }
     
     public class person{
         private String username;
         private String password;
         
         public person(){
             System.out.println("Eksekusi Method");
         }
     }
}
