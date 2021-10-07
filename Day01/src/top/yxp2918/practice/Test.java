package top.yxp2918.practice;

/**
 * 练习： 创建2个线程，一个线程遍历100以内偶数，一个遍历100以内奇数
 * @author yxp2918
 * @date 2021-09-28-8:15
 */
public class Test {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        new Thread(){
            @Override
            public void run() {
                // 需要另开线程执行的代码
            }
        }.start();
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
