package org.example.Test20241215;

public class Test1 {

// 題目號 1114 按序查詢
     public static void main(String[] args) {
        Foo foo = new Foo();
        new First(foo).start();
        new Second(foo).start();
        new Third(foo).start();

     }


}
