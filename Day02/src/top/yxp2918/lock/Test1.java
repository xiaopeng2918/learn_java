package top.yxp2918.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程问题方式三： 锁 --lock  JDK5.0新增
 * lock锁解决继承Thread类的线程问题
 *
 * @author yxp2918
 * @date 2021-10-01-13:33
 */
public class Test1 {
    public static void main(String[] args) {
        WindowTicket wt1 = new WindowTicket("窗口1");
        WindowTicket wt2 = new WindowTicket("窗口2");
        WindowTicket wt3 = new WindowTicket("窗口3");

        wt1.start();
        wt2.start();
        wt3.start();
    }
}

class WindowTicket extends Thread {

    private static int ticket = 100;
    private static ReentrantLock lock = new ReentrantLock();

    public WindowTicket(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + ":" + ticket);
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
