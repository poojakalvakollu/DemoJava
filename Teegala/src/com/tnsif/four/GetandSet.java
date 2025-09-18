package com.tnsif.four;

public class GetandSet {
    private String name; 

   
    public void setName(String name) {
        this.name = name;
    }

  
    public String getName() {
        return name;
    }

    
    public static void main(String[] args) {
        GetandSet obj = new GetandSet();  

        obj.setName("Pooja"); 
        System.out.println("Name: " + obj.getName()); 
    }
}
