package org.example.Test20241215;

public class Second extends Thread {

    private Foo foo;
    public Second(Foo foo) {
        this.foo = foo;
    }

    public void run() {
        synchronized (foo) {
            if (foo.diYi == true){
                System.out.println("Second");
                foo.diEr = true;
            }
        }
    }
}
