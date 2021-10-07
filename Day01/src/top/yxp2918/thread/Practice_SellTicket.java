package top.yxp2918.thread;

/**
 * 练习： 3个窗口同时卖100张票
 * @author yxp2918
 * @date 2021-09-28-12:57
 */
public class Practice_SellTicket {
    public static void main(String[] args) {
        WindowTicket t1 = new WindowTicket("窗口一");
        WindowTicket t2 = new WindowTicket("窗口二");
        WindowTicket t3 = new WindowTicket("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}

class WindowTicket extends Thread{
    public WindowTicket(String str){
        super(str);
    }
    private static int ticket = 100;
    @Override
    public void run() {
        while (true){
            System.out.println(getName() + "卖出票" + WindowTicket.ticket);
            WindowTicket.ticket--;
            if(ticket <= 0){
                break;
            }
        }
    }
}
