package top.yxp2918.Reflection;

/**
 *
 * 反射
 * @author yxp2918
 * @date 2021-10-07-8:39
 */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("top.yxp2918.Reflection.Info");
        System.out.println(c1);


        Class c2 = Class.forName("top.yxp2918.Reflection.Info");
        Class c3 = Class.forName("top.yxp2918.Reflection.Info");
        Class c4 = Class.forName("top.yxp2918.Reflection.Info");

        // 一个类存在唯一的Class的实例对象
        // 类被加载后，结构都被封装在这个Class实例对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        //460141958
        //460141958
        //460141958
    }
}

// 实体类  pojo
// 只定义了一些属性的类
class Info{
    private String name;
    private int age;
    private String pwd;

    public Info() {
    }

    public Info(String name, int age, String pwd) {
        this.name = name;
        this.age = age;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}