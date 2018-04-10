package stackAndQueue;

public class Queue {
	private Integer[] arr;
	private Integer first;
	private Integer last;
	private Integer size;//定义队列的长度，用来约束首尾指针是否该到了队列底部
	public Queue(Integer initsize) throws Exception1{
		if(initsize < 0){
			throw new Exception1("队列长度不为负数");
		}
		else {
			arr = new Integer[initsize];
			size = 0;
			first = 0;
			last = 0;
		}
		}
	/*
	 * 返回队列首部元素
	 */
	public Integer peek(){
		if(size == 0)
			return null;
		return arr[first];
	}
	/*
	 * 向队列加元素
	 */
	public void push(Integer i) throws Exception1{
		if(size == arr.length)
			throw new Exception1("队列已经满了");
		size++;
		arr[last] = i;
		last = last == arr.length-1? 0 : last+1;//如果队列未到底部，则last加1 到底部则令其回到顶部
	}
	/*
	 * 从队列中取元素
	 */
	public Integer poll() throws Exception1{
		if(size == 0)
			throw new Exception1("队列已空");
		size--;
		int temp = first;
		first = first == arr.length-1 ? 0:first+1;
		return arr[temp];
	}
}
