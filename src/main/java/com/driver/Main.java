package com.driver;

class A {
    public static String meth() {
        return "Invoking method from class A";
    }
}
class B extends A{
    public static String meth(){
        return "Method is overridden in Extended class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(A.meth());
        System.out.println(B.meth());
    }
}
