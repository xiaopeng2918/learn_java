package top.yxp2918.thread;

/**
 * 线程Thread的一些方法
 * run() 继承Thread类的子类需要重写此方法，将创建此线程需要执行的代码写在此方法当中
 * getName() 获取当前线程的名字
 * setName() 设置当前线程的名字
 * currentName() 静态方法，返回执行当前代码所在的线程
 * start() 启动当前线程；调用当前线程的run()
 * yield() 释放当前CPU的执行权
 * join() 线程调用，在线程a当中调用线程b，那么线程a就会停止执行，直到线程b执行完毕，线程a才会处于被CPU分配的状态
 * sleep(long millitime) 线程休眠，参数为休眠时间，单位为毫秒
 * isAlive() 判断线程是否存活
 *
 * @author yxp2918
 * @date 2021-09-28-8:29
 */
public class ThreadMethod {
    public static void main(String[] args) {
        // 设置主线程名字
        Thread.currentThread().setName("主线程");

        MyThread2 t1 = new MyThread2();
        t1.setName("分线程");
        t1.start();

        for (int i = 0; i < 100; i++) {
            if(i == 2){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + i);
            }

        }
        // 判断h1是否存活
        System.out.println(t1.isAlive()); // false
        // 判断主线程是否存活
        System.out.println(Thread.currentThread().isAlive()); // true
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                try {
                    // sleep(long millitime) 线程休眠，参数为休眠时间，单位为毫秒
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}
