package stackAndQueue;

public class Queue {
	private Integer[] arr;
	private Integer first;
	private Integer last;
	private Integer size;//������еĳ��ȣ�����Լ����βָ���Ƿ�õ��˶��еײ�
	public Queue(Integer initsize) throws Exception1{
		if(initsize < 0){
			throw new Exception1("���г��Ȳ�Ϊ����");
		}
		else {
			arr = new Integer[initsize];
			size = 0;
			first = 0;
			last = 0;
		}
		}
	/*
	 * ���ض����ײ�Ԫ��
	 */
	public Integer peek(){
		if(size == 0)
			return null;
		return arr[first];
	}
	/*
	 * ����м�Ԫ��
	 */
	public void push(Integer i) throws Exception1{
		if(size == arr.length)
			throw new Exception1("�����Ѿ�����");
		size++;
		arr[last] = i;
		last = last == arr.length-1? 0 : last+1;//�������δ���ײ�����last��1 ���ײ�������ص�����
	}
	/*
	 * �Ӷ�����ȡԪ��
	 */
	public Integer poll() throws Exception1{
		if(size == 0)
			throw new Exception1("�����ѿ�");
		size--;
		int temp = first;
		first = first == arr.length-1 ? 0:first+1;
		return arr[temp];
	}
}
