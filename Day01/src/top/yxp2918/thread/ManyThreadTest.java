package top.yxp2918.thread;

/**
 * @author yxp2918
 * @date 2021-09-28-8:03
 */
public class ManyThreadTest {
    public static void main(String[] args) {
        // 另开一个线程
        ManyThread t1 = new ManyThread();
        t1.start();
        // 再开一个线程
        ManyThread t2 = new ManyThread();
        t2.start();
        for (int i = 0; i < 1000; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() +"*****" + i);
            }
        }
    }
}
class ManyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() +"*****" + i);
            }
        }
    }
}