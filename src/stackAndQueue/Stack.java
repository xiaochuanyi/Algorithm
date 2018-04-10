package stackAndQueue;
/*
 * 数组实现一个栈
 */
public class Stack {
	private Integer[] arr;
	private Integer index;//指向栈最上方元素的上一个位
	public Stack(int initsize) throws Exception{
		if(initsize < 0)
			throw new Exception1("栈长度不能为负数");
		else
		{
			arr = new Integer[index];
			index = 0;
		}
	}
	/*
	 * 返回当前栈顶的值，不删除栈顶的值
	 */
	public Integer peek(){
		if(index == 0)
			return null;
		return arr[index-1];
	}
	/*
	 * 从向栈中加元素
	 */
	public void push(Integer s) throws Exception{
		if(index == arr.length)
			throw new Exception1("栈已经满");
		arr[index++] = s;
	}
	/*
	 * 从栈中弹出元素
	 */
	public Integer pool() throws Exception{
		if(index == 0)
			throw new Exception("栈为空");
		else
			return arr[--index];
	}
}
