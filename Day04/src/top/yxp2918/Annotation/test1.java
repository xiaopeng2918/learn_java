package top.yxp2918.Annotation;

import java.lang.annotation.*;

/**
 * 元注解的使用
 * @author yxp2918
 * @date 2021-10-07-8:16
 */
public class test1 {
}
// Target 表示我们的注解都能用在哪里   type method field ...
@Target(ElementType.TYPE)

// Retention 表示注解声明周期 source < class < runtime
@Retention(RetentionPolicy.RUNTIME)

//Documented 表示是否将我们的注解生成在JAVAdoc中
@Documented

// 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}