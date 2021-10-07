package top.yxp2918.thread;

/**
 * 线程安全解决方式二：同步方法
 * 如果一个方法代码块内所有代码都是对线程共享数据的操作，那么可以把这个方法设置为synchronized
 * @author yxp2918
 * @date 2021-09-30-21:30
 */
public class Practice4_SellTicket {
    public static void main(String[] args) {
        WindowSell1 ws = new WindowSell1();
        Thread th1 = new Thread(ws);
        Thread th2 = new Thread(ws);
        Thread th3 = new Thread(ws);

        th1.setName("窗口1");
        th2.setName("窗口2");
        th3.setName("窗口3");

        th1.start();
        th2.start();
        th3.start();
    }
}

class WindowSell1 implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
            sellTicket();
        }
    }
    private synchronized void sellTicket(){
        if(ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + ticket);
            ticket--;
        }
    }
}
