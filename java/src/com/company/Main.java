package com.company;

import java.util.Scanner;

class employee
{
    void get()
    {
        System.out.println("getting");
    }



}
class student extends employee
{
    void get()
    {
        System.out.println("getting from student");
    }
    student()
    {
        System.out.println("constructor");
    }
    void set()
    {
        System.out.println("setting");
    }
}
 public class Main {



    public static void main(String[] args) {
        employee obj=new student();
        obj.get();
    }
}
