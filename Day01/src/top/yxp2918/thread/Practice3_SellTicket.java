package top.yxp2918.thread;

/**
 * 使用同步代码块解决继承Thread类的线程问题
 * @author yxp2918
 * @date 2021-09-30-20:46
 */
public class Practice3_SellTicket {
    public static void main(String[] args) {
        WindowSell ws1 = new WindowSell("窗口1");
        WindowSell ws2 = new WindowSell("窗口2");
        WindowSell ws3 = new WindowSell("窗口3");

        ws1.start();
        ws2.start();
        ws3.start();
    }
}

class WindowSell extends Thread {
    private static Object obj = new Object();
    public WindowSell(String name){
        super(name);
    }
    @Override
    public void run() {
        synchronized (obj){
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
