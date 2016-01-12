package jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args�?-XX:PermSize=10M -XX:MaxPermSize=10M
 * @author zzm
 */
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		// 使用List保持�?常量池引用，避免Full GC回收常量池行�?
		List<String> list = new ArrayList<String>();
		// 10MB的PermSize在integer范围内足够产生OOM�?
		int i = 0; 
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}
}

