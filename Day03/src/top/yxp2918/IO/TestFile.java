package top.yxp2918.IO;

import java.io.File;

/**
 * @author yxp2918
 * @date 2021-10-03-16:26
 */
public class TestFile {
    public static void main(String[] args) {
        File f = new File("E:\\code\\IDEA_workplace\\JAVA_SENIOR\\Day03\\src\\top\\yxp2918\\IO\\a.txt");
        System.out.println(f);
        // 判断是否为文件
        System.out.println(f.isFile()); // true
        // 判断是否为目录
        System.out.println(f.isDirectory()); // false
        // 获取文件路径
        System.out.println(f.getPath()); // 返回构造方法传入的路径
        System.out.println(f.getAbsolutePath()); // 返回文件的绝对路径
        // 打印当前系统分隔符
        System.out.println(File.separator); // \
    }
}
