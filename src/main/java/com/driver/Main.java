package com.driver;

import org.w3c.dom.ls.LSOutput;

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B obj1 = new B();
        String str = obj1.meth();
        System.out.println(str);
        String str2 = obj1.meth();
        System.out.println(str2);
    }
}