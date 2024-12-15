package org.example.Test20241215;

public class First extends Thread{

    private Foo foo;
    public First(Foo foo) {
        this.foo = foo;
    }

    public void run(){
        synchronized(foo){
            System.out.println("first");
            foo.diYi = true;
        }
    }

}
