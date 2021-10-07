package top.yxp2918.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * - @interface来声明一个注解 格式：public @interface 注解名{定义内容}
 * - 其中的每一个类似方法的代码  实际上声明了一个配置参数
 * - 方法的名称就是参数的名称
 * - 返回值类型就是参数的类型
 * - 可以通过default来声明参数的默认值
 * - 如果只有一个参数成员，一般参数名为value
 * - 注解元素必须要有值，我们定义注解元素时，经常使用空字符串，0作为默认值
 * @author yxp2918
 * @date 2021-10-07-8:21
 */
@MyAnnotation1("yxp")
public class Test02 {

    @MyAnnotation1("yxp")
    public void test01(){

    }
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1{
    String name() default "";
    int age() default 0;
    boolean men() default true;

    String value();
}
