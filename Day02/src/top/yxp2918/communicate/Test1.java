package top.yxp2918.communicate;

/**
 * 线程通信
 * 2个线程依次交替打印1 - 100的数字
 * notify():解除一个线程的阻塞（wait）状态，如果有多个，那么优先级高的解除
 * notifyAll():解除其他线程的阻塞状态
 * wait(): 当前线程进入阻塞状态，并释放同步监视器
 *
 * 这三个方法只能适用于同步方法与同步代码块的线程通信问题
 * @author yxp2918
 * @date 2021-10-01-15:21
 */
public class Test1 {
    public static void main(String[] args) {
        Number num = new Number();

        Thread th1 = new Thread(num);
        Thread th2 = new Thread(num);

        th1.setName("线程1");
        th2.setName("线程2");

        th1.start();
        th2.start();

    }
}

class Number implements Runnable{
    private int num = 1;
    @Override
    public void run() {
        while(true){
            synchronized (this) {
                notify();
                if (num <= 100){
                    System.out.println(Thread.currentThread().getName() + "-" + num);
                    num++;

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else{
                    break;
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
