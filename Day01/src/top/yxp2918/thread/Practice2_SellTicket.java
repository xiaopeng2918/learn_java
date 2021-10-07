package top.yxp2918.thread;

/**
 * 练习： 3个窗口同时出售100张票,通过实现Runnable接口的方式
 * 未解决同步线程问题
 * @author yxp2918
 * @date 2021-09-28-18:57
 */
public class Practice2_SellTicket {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "出售票" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
