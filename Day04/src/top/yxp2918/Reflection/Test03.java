package top.yxp2918.Reflection;

/**
 * 对象获取Class对象的方式有哪些
 * @author yxp2918
 * @date 2021-10-07-8:54
 */
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 方式一
        Person person = new Student();
        System.out.println(person.toString());
        Class c1 = person.getClass();
        System.out.println(c1.hashCode()); // 460141958

        // 方式二
        Class c2 = Class.forName("top.yxp2918.Reflection.Student");
        System.out.println(c2.hashCode()); // 460141958

        // 方式三
        System.out.println(Student.class.hashCode()); // 460141958
    }
}

class Person{
    String name;

    public Person() {
        this.name = "人";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student() {
        this.name = "学生";
    }
}
