package org.example.Test20241216;

class FooBar {
    private int n;
    boolean toFoo = true;
    boolean toBal = false;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while(toFoo == false){

            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            toFoo = false;
            toBal = true;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while(toBal == false){

            }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            toFoo = true;
            toBal = false;
        }
    }
}