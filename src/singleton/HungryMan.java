package singleton;
/**
 * 饿汉式
 * HungryMan 
 *  
 * @author：xiaoyi
 * @2018年7月27日 下午4:22:12 
 * @version 1.0
 */
public class HungryMan {
	private static HungryMan hungryMan = new HungryMan();
	private HungryMan(){};
	public static HungryMan getInstance(){
		return hungryMan;
	}
}
