package top.yxp2918.thread;

/**
 * 线程的调度： 优先级
 * @author yxp2918
 * @date 2021-09-28-12:26
 */
public class ThreadPriority {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(1);
        Thread.currentThread().setName("主线程");
        SubThread t1 = new SubThread();
        t1.setName("分线程");
        // 设置优先级
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        // 获取优先级
        System.out.println(t1.getPriority()); // 10
        System.out.println(Thread.currentThread().getPriority()); // 1
        System.out.println(Thread.currentThread().getName() + "执行");
    }
}

class SubThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}
