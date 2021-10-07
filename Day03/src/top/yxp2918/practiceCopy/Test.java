package top.yxp2918.practiceCopy;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 使用OutputStream与InputStream实现一个复制文件的程序
 *
 * @author yxp2918
 * @date 2021-10-03-19:35
 */
public class Test {
    public static void main(String[] args) throws IOException {
        // 复制项目根目录下的copy1.txt文件
        copyFile(new FileInputStream("copy1.txt"), new FileOutputStream("copy2.txt"));
    }

    /**
     *
     * @param file 需要复制的文件路径
     * @param fileCopy  文件复制品的路径
     * @throws IOException
     */
    public static void copyFile(InputStream file, OutputStream fileCopy) throws IOException {
        // 读取
        StringBuilder str = new StringBuilder();
        try (InputStream input1 = file) {
            int n;
            while (true) {
                if ((n = input1.read()) == -1) {
                    break;
                }
                str.append((char) n);
            }
        }

        // 写入
        try (OutputStream output1 = fileCopy) {
            output1.write(str.toString().getBytes(StandardCharsets.UTF_8));
        }

    }
}

