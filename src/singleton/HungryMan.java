package singleton;
/**
 * ����ʽ
 * HungryMan 
 *  
 * @author��xiaoyi
 * @2018��7��27�� ����4:22:12 
 * @version 1.0
 */
public class HungryMan {
	private static HungryMan hungryMan = new HungryMan();
	private HungryMan(){};
	public static HungryMan getInstance(){
		return hungryMan;
	}
}
