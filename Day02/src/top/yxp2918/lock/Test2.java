package top.yxp2918.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * lock锁解决实现Runnable接口的 线程问题
 *
 * @author yxp2918
 * @date 2021-10-01-13:59
 */
public class Test2 {
    public static void main(String[] args) {
        WindowTicket1 wt = new WindowTicket1();

        Thread t1 = new Thread(wt);
        Thread t2 = new Thread(wt);
        Thread t3 = new Thread(wt);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class WindowTicket1 implements Runnable {
    private int ticket = 100;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();

            try {
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "-" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }

        }
    }
}
