package com.driver;

class classA{
    public String meth(){
        return "Invoking method from class A";
    }
}
class classB extends classA{
    public String meth(){
        super.meth();
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        classB obj1 = new classB();
        String str = obj1.meth();
        System.out.println(str);
        String str2 = obj1.meth();
        System.out.println(str2);
    }
}