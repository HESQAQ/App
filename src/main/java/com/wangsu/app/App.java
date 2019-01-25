package com.wangsu.app;

public class App {

    public App(){}

    private static String msg = "Hello World!" ;

    public static void main(String[] args){
        System.out.println(new App().function());
    }

    public String function(){
        return msg;
    }
}
