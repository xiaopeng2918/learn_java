package top.yxp2918.thread;

/**
 * 创建线程的方式二
 * 创建一个类来实现Runnable接口
 * 该类中重写接口的run方法
 * 创建该类的实例
 * 将该实例作为Thread构造器的参数
 * 调用Thread实例的start方法
 * @author yxp2918
 * @date 2021-09-28-13:17
 */
public class ThreadSecond {
    public static void main(String[] args) {
        MThread mt1 = new MThread();
        Thread t1 = new Thread(mt1);
        t1.start();
    }
}

class MThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}