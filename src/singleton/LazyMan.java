package singleton;
/**
 * 懒汉式
 * LazyMan 
 *  
 * @author：xiaoyi
 * @2018年7月27日 下午4:22:03 
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
