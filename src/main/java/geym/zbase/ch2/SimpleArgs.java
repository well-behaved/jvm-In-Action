package geym.zbase.ch2;

/**
 * 可以配置-Xmx32m
 */
public class SimpleArgs {
	public static void main(String[] args) {
		//打印入参
		for(int i=0;i<args.length;i++){
			System.out.println("参数"+(i+1)+":"+args[i]);
		}
		//打印系统可用最大堆内存
		System.out.println("-Xmx"+Runtime.getRuntime().maxMemory()/1000/1000+"M");
	}
}
