package top.yxp2918.thread;

/**
 *
 * 使用同步方法解决 继承Thread类多线程同步问题
 * @author yxp2918
 * @date 2021-09-30-21:55
 */
public class Practice5_SellTicket {
    public static void main(String[] args) {
        TicketSell1 ts1 = new TicketSell1("窗口1");
        TicketSell1 ts2 = new TicketSell1("窗口2");
        TicketSell1 ts3 = new TicketSell1("窗口3");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}

class TicketSell1 extends Thread{
    public TicketSell1(String name){
        super(name);
    }
    private static int ticket = 100;
    @Override
    public void run() {
        while(true){
            TicketSell();
        }
    }

    private static synchronized void TicketSell(){
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