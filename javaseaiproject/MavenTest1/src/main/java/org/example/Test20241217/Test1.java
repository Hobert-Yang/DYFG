package org.example.Test20241217;

import java.util.function.IntConsumer;

public class Test1 {
    // 題目號 1116 打印零奇偶數
    class ZeroEvenOdd {
        private int n;
        private volatile int flag = 1;

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i=1; i<=n; i++) {
                synchronized (this) {
                    while (flag % 2 == 0) wait();
                    printNumber.accept(0);
                    flag ++;
                    notifyAll();
                }
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i=2; i<=n; i+=2) {
                synchronized (this) {
                    while (flag % 4 != 0) wait();
                    printNumber.accept(i);
                    flag ++;
                    notifyAll();
                }
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i=1; i<=n; i+=2) {
                synchronized(this) {
                    while (flag % 4 != 2) wait();
                    printNumber.accept(i);
                    flag ++;
                    notifyAll();
                }
            }
        }
    }
}
