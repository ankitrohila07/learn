package com.spring;


public class Dev {
    private Computer computer;
    public Computer getComputer(){
        return computer;
    }
    public void setComputer(Computer computer){
        this.computer=computer;
    }

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public void build(){
        System.out.println("working on Awesome Project");
        computer.compile();
    }
}
