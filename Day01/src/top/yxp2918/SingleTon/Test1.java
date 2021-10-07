package top.yxp2918.SingleTon;

/**
 * 解决单例设计模式饿汉式
 * @author yxp2918
 * @date 2021-09-30-22:31
 */
public class Test1 {
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();

        System.out.println(s1 == s2);
    }
}

class SingleTon {
    private SingleTon(){

    }
    private static SingleTon st = null;

    public static synchronized SingleTon getInstance(){
        if(st == null){
            st = new SingleTon();
            return st;
        }else{
            return st;
        }
    }
}
