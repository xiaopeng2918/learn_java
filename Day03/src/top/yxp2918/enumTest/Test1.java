package top.yxp2918.enumTest;

/**
 * 枚举
 * @author yxp2918
 * @date 2021-10-03-9:45
 */
public class Test1 {
    public static void main(String[] args) {
        Color c1 = Color.RED;

        System.out.println(c1);

        // values() 返回枚举类中所有值组成的数组
        Color[] result = Color.values();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        // ordinal() 可以找到每个枚举常量的索引，就像数组索引一样。
        System.out.println(Color.RED.ordinal()); // 0

        // valueOf() 返回指定字符串值的枚举常量。
        System.out.println(Color.valueOf("RED")); // RED


        // for循环遍历
        for (Color myVar : Color.values()) {
            System.out.println(myVar);
        }

        // switch中使用枚举
        Color c2 = Color.YELLOW;

        switch (c2){
            case RED:
                System.out.println("红色");
            case BLUE:
                System.out.println("蓝色");
            case YELLOW:
                System.out.println("黄色");
        }
    }
}

enum Color{
    RED,YELLOW,BLUE;
}
