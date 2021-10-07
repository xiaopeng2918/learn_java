package top.yxp2918.OutputStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 输出流
 * @author yxp2918
 * @date 2021-10-03-19:17
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        OutputStream output1 = new FileOutputStream("output.txt");

        // 写入 会覆盖原有文件的内容
        // 单次写入一个字节 效率差
        output1.write(97);
        output1.write(97);
        output1.write(97);

        // 单次写入多个字节  定义writeFile方法
        writeFile("hello", new FileOutputStream("outputDemo.txt"));

        // 关闭流
        output1.close();

        // 读取验证
        String result = readAsString(new FileInputStream("output.txt"));
        System.out.println(result);
    }

    // 读取文件方法
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

    // 写入字符串到指定文件 的 方法
    public static void writeFile(String str, FileOutputStream file) throws IOException {
        OutputStream output = file;

        output.write(str.getBytes(StandardCharsets.UTF_8));

        output.close();
    }
}
