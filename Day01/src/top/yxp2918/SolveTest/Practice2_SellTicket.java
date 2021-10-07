package top.yxp2918.SolveTest;

/**
 * 练习： 3个窗口同时出售100张票,通过实现Runnable接口的方式
 * 解决同步线程问题
 * 方式一：同步代码块
 * synchronized(同步监视器){
 *     需要被同步的代码
 * }
 * 被同步的代码: 操作共享数据的代码
 * 同步监视器（锁） 任何一个类的实例对象
 * 这些线程务必使用同一个对象实例
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

    Object obj =  new Object();
    @Override
    public void run() {
        while (true){
            synchronized(obj){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "出售票" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
