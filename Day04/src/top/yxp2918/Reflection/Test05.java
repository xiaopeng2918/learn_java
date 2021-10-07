package top.yxp2918.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 获取类的运行时结构
 * @author yxp2918
 * @date 2021-10-07-13:10
 */
public class Test05 {
    public static void main(String[] args) throws NoSuchFieldException {
        User u1 = new User();

        // 获取类所在的包 + 类名
        Class c1 = u1.getClass();
        String name = c1.getName();
        System.out.println(name); // top.yxp2918.Reflection.User

        // 只获取包名
        String simpleName = c1.getSimpleName();
        System.out.println(simpleName);// User

        // 获取public的属性值
        Field[] fields = c1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 获取所有属性值
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        // 获取指定属性的值
        Field field = c1.getDeclaredField("name"); // private java.lang.String top.yxp2918.Reflection.User.name
        System.out.println(field);

        System.out.println("*****************");
        // 获取字父类的public方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("******************");
        // 获取本类中所有方法
        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
}

class User{
    public String demo;
    private String name = "yxp";
    private int age;
    private String sex;

    public User() {
    }

    public User(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}