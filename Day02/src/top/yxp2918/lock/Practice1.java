package top.yxp2918.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 练习
 * 两个人共用一个账户，每个人给账户存3000，分三次存
 *
 * @author yxp2918
 * @date 2021-10-01-14:27
 */
public class Practice1 {
    public static void main(String[] args) {
        Count count = new Count(0);
        Customer cus1 = new Customer("1号客户", count);
        Customer cus2 = new Customer("2号客户", count);

        cus1.start();
        cus2.start();
    }
}

class Count {
    private double balance = 0;
    private ReentrantLock lock = new ReentrantLock(true);

    public Count(double balance) {
        this.balance = balance;
    }

    public void saveMoney(double money) {
        lock.lock();
        this.balance += money;
        System.out.println(Thread.currentThread().getName() + "存钱成功，余额为" + balance);
        lock.unlock();
    }
}

class Customer extends Thread {
    public Customer(String name, Count count) {
        super(name);
        this.count = count;
    }

    private Count count;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            count.saveMoney(1000);
        }
    }
}
