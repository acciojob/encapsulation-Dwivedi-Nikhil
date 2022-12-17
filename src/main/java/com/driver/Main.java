package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj= new RWOnly();

       //obj.name= "Nikhil";    task 3 accessing name without getter setter
       // error: name has private access in com.driver.RWOnly

        obj.setName("Nikhil");
        System.out.println(obj.getName());

    }
}