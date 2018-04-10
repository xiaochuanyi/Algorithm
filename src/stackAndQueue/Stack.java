package stackAndQueue;
/*
 * ����ʵ��һ��ջ
 */
public class Stack {
	private Integer[] arr;
	private Integer index;//ָ��ջ���Ϸ�Ԫ�ص���һ��λ
	public Stack(int initsize) throws Exception{
		if(initsize < 0)
			throw new Exception1("ջ���Ȳ���Ϊ����");
		else
		{
			arr = new Integer[index];
			index = 0;
		}
	}
	/*
	 * ���ص�ǰջ����ֵ����ɾ��ջ����ֵ
	 */
	public Integer peek(){
		if(index == 0)
			return null;
		return arr[index-1];
	}
	/*
	 * ����ջ�м�Ԫ��
	 */
	public void push(Integer s) throws Exception{
		if(index == arr.length)
			throw new Exception1("ջ�Ѿ���");
		arr[index++] = s;
	}
	/*
	 * ��ջ�е���Ԫ��
	 */
	public Integer pool() throws Exception{
		if(index == 0)
			throw new Exception("ջΪ��");
		else
			return arr[--index];
	}
}
