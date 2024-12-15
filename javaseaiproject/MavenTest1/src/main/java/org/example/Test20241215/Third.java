package org.example.Test20241215;

public class Third extends Thread {
    private Foo foo;
    public Third(Foo foo) {
        this.foo = foo;
    }

    public void run() {
        synchronized (foo) {
            if (foo.diEr == true){
                System.out.println("Third");
            }
        }
    }
}
