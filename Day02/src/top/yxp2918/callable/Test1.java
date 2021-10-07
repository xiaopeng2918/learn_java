package top.yxp2918.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程方式4
 *
 * 创建一个实现Callable接口的类，并在该类中重写call方法，call方法中代码就是需要执行的线程，带有返回值
 * 在main方法里面创建实现类的实例
 * 创建FutureTask类的实例，构造器参数为实现类的实例
 * 然后调用new Thread(FutureTask的实例).start()
 *最后可以调用 FutureTask的实例.get()方法获得实现类重写call（）的返回值
 * @author yxp2918
 * @date 2021-10-01-18:48
 */
public class Test1 {
    public static void main(String[] args) {
        Number num = new Number();
        FutureTask ft = new FutureTask(num);

        new Thread(ft).start();

        try {
            // get 返回值即为FutureTask构造器参数Callable实现类重写call（）的返回值
            Object result = ft.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class Number implements Callable{
    private int sum = 0;
    @Override
    public Object call() throws Exception {
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        return sum;
    }
}
