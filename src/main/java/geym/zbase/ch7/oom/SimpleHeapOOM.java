package geym.zbase.ch7.oom;

import java.util.ArrayList;

/**
 * -Xmx5m
 * @author Geym
 *
 */
public class SimpleHeapOOM {
    public static void main(String args[]){
        ArrayList<byte[]> list=new ArrayList<byte[]>();
        for(int i=0;i<2248;i++){
            System.out.println(i);
            list.add(new byte[10*1024]);
        }
    }
}
