package singleton;
/**
 * ����ʽ
 * LazyMan 
 *  
 * @author��xiaoyi
 * @2018��7��27�� ����4:22:03 
 * @version 1.0
 */
public class LazyMan {
	private static LazyMan lazyMan = null;
	private LazyMan(){};
	public static LazyMan getInstance(){
		if(lazyMan == null){
			synchronized (LazyMan.class) {
				if(lazyMan == null){
					return lazyMan = new LazyMan();
				}
			}
		}
		return lazyMan;
	}
}
