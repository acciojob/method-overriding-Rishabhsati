package com.driver;

class A {
    public static String meth() {
        return "Invoking method from class A";
    }
}
class B extends A{
    public static String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        String str = A.meth();
        System.out.println(str);
        String str2 = B.meth();
        System.out.println(str2);
    }
}
