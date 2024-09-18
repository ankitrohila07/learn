package com.spring;


public class Dev {
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public Dev(Laptop laptop){
        this.laptop=laptop;
    }
//    public Dev(){
//        System.out.println("Dev Constructor");
//    }

    public void build(){
        System.out.println("working on Awesome Project");
        laptop.compile();
    }
}
