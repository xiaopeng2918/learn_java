package top.yxp2918.thread;

/**
 * 创建thread的第一种方式
 * 1.创建一个继承Thread的子类
 * 2.子类重写Thread的run方法  run方法里面写的分线程需要做的事情
 * 3.创建子类的实例化对象
 * 4.运行子类对象的start方法
 *
 * @author
 * @date 2021-09-27-23:11
 */
public class ThreadFirst {
    public static void main(String[] args) {
        // 第三步
        MyThread t1 = new MyThread();
        // 第四步
        t1.start();

        // 执行run方法里的代码才进入到分线程， run方法里面的遍历偶数代码和下面主线程main方法里的遍历奇数代码同时执行，不分先后
        for (int i = 0; i < 1000; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
// 第一步
class MyThread extends Thread {
    // 第二步
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

