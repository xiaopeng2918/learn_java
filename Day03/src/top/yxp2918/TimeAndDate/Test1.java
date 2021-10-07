package top.yxp2918.TimeAndDate;

import java.util.Date;

/**
 * 时间戳
 * Date
 * @author yxp2918
 * @date 2021-10-03-20:38
 */
public class Test1 {
    public static void main(String[] args) {
        // 获取当前时间的时间戳
        System.out.println(System.currentTimeMillis()); // 1633264737787

        // 获取当前时间
        Date date = new Date(); // Sun Oct 03 20:45:13 CST 2021
        System.out.println(date);

        // 从当前时间获取年份
        System.out.println(date.getYear() + 1900); // +1900
        System.out.println(date.getMonth() + 1);// +1    0-11
        System.out.println(date.getDate());// 不加1    1-31

        // 转换为GMT时区
        System.out.println(date.toGMTString()); // 3 Oct 2021 12:48:52 GMT
        // 转换为String
        System.out.println(date.toString());// Sun Oct 03 20:48:52 CST 2021
        // 转换为本地时区
        System.out.println(date.toLocaleString());// 2021-10-3 20:48:52
    }
}
