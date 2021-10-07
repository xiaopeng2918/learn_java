package top.yxp2918.Reflection;

/**
 * 类加载器的种类及各种用途
 * @author yxp2918
 * @date 2021-10-07-12:44
 */
public class Test04 {
    public static void main(String[] args) throws ClassNotFoundException {
        // jvm根加载器  c++编写  Java获取不到
        ClassLoader loader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(loader1); // null
        // 系统类加载器
        ClassLoader loader2 = ClassLoader.getSystemClassLoader();
        System.out.println(loader2); // sun.misc.Launcher$AppClassLoader@18b4aac2

        // 系统扩展类加载器
        System.out.println(loader2.getParent()); // sun.misc.Launcher$ExtClassLoader@1b6d3586

        // 获取系统类可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        /*
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\charsets.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\deploy.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\access-bridge-64.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\cldrdata.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\dnsns.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\jaccess.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\jfxrt.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\localedata.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\nashorn.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\sunec.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\sunjce_provider.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\sunmscapi.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\sunpkcs11.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\ext\zipfs.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\javaws.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\jce.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\jfr.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\jfxswt.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\jsse.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\management-agent.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\plugin.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\resources.jar;
        * D:\develop\develop_tools\jdk1.8.0_291\jre\lib\rt.jar;
        * E:\code\IDEA_workplace\JAVA_SENIOR\out\production\Day04;
        * D:\develop\develop_tools\IDEA\IntelliJ IDEA 2020.3.3\lib\idea_rt.jar
        * */
    }
}

class Bank{

}
