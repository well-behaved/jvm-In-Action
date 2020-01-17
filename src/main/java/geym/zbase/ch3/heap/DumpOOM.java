package geym.zbase.ch3.heap;

import geym.zbase.Model.UserModel;

import java.util.Vector;

/**
 * -Xmx20m -Xms5m -XX:+HeapDumpOnOutOfMemoryError -XX:+PrintGCDetails -XX:HeapDumpPath=/Users/xuexiong/Desktop/临时/
 * 发生oom时将当时的堆栈信息导入到指定文件夹下
 * 
 * -Xmx20m -Xms5m  "-XX:OnOutOfMemoryError=D:/tools/jdk1.7_40/bin/printstack.bat %p"  -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:/a.dump
 * 发生oom时执行指定的脚本
 *
 * printstack.bat:
 * D:/tools/jdk1.7_40/bin/jstack -F %1 > D:/a.txt
 * @author Geym
 *
 */
public class DumpOOM {
    public static void main(String[] args) {
        Vector v=new Vector();
        for(int i=0;i<25;i++){
            UserModel userModel = new UserModel();
            userModel.setName(new String(new char[1024*1024*1]));
            v.add(userModel);
            System.out.println("num is "+i);
        }
    }
}
