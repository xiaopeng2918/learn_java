package top.yxp2918.InputStream;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 输入流（输入内存当中）
 *
 * @author yxp2918
 * @date 2021-10-03-18:11
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        // ""代表的是项目的根目录
        // a.txt 文件内容为 aaa
        InputStream input = new FileInputStream("Day03\\src\\top\\yxp2918\\InputStream\\a.txt");

        // 手动关闭流
        while (true) {
            int result = input.read();
            if (result == -1) {
                break;
            }
            System.out.println(result); // 97 97 97
        }

        // 关闭读取
        input.close();

        // 利用Java 7引入的新的try(resource)的语法  解决关闭流
        try(InputStream input1 = new FileInputStream("Day03\\src\\top\\yxp2918\\InputStream\\a.txt")){
            while(true){
                int result = input1.read();

                if(result == -1){
                    break;
                }
                System.out.println(result);
            }
        }

        System.out.println("***********1");
        // 读取缓冲
        try(InputStream input2 = new FileInputStream("b.txt")){
            while(true){
                // 缓冲100
                byte[] bytes = new byte[100];
                // 返回读取的字节数，每100 100 读取
                int result = input2.read(bytes);

                if(result == -1){
                    break;
                }
                System.out.println(result);
            }
        }
        System.out.println("***************2");
        // 读取文件内容拼接为字符串
        String resultStr1 = readAsString(new FileInputStream("b.txt"));
        System.out.println(resultStr1); // bbbbbbbbbbbbb....
        // byte[] 作为InputStream
        byte[] bytes = {97, 97, 97};
        System.out.println("********************3");
        String s = readAsString(new ByteArrayInputStream(bytes));
        System.out.println(s); // aaa
    }
    public static String readAsString(InputStream input) throws IOException {
        int n;
        StringBuilder str = new StringBuilder();
        while(true){
            if((n = input.read()) == -1){
                break;
            }
            str.append((char) n);
        }
        return str.toString();
    }
}
