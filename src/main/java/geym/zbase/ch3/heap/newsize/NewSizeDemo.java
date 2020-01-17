
package geym.zbase.ch3.heap.newsize;

/**
 * -Xmx20m -Xms20m -Xmn1m   -XX:SurvivorRatio=2 -XX:+PrintGCDetails
 * 表现为：full gc频繁，新生代太小，对象直接分配在年老代
 * -Xmx20m -Xms20m -Xmn7m   -XX:SurvivorRatio=2 -XX:+PrintGCDetails
 * 表现为：年轻代gc频繁,年老代用不上。
 * -Xmx20m -Xms20m -Xmn15m  -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * 表现为：整体gc很少，年老代用不上
 * <p>
 * -Xmx20M -Xms20M -XX:NewRatio=2  -XX:+PrintGCDetails
 *
 * @author Geym
 */
public class NewSizeDemo {
    public static void main(String[] args) throws InterruptedException {
        byte[] b = null;
        for (int i = 0; i < 1000; i++) {
            b = new byte[1 * 1024 * 1024];
            System.out.println("---- num is " + i);
//            Thread.sleep(500);
        }
    }
}
