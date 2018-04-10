package print;

public class xuanzhuanprint {
/*
 * ��ת��ӡһ������
 */
	public static void print(int[][] arr){
		int tr = 0;
		int tc = 0;
		//���Ͻǵ�����
		int dr = arr.length-1;
		int dc = arr[0].length-1;
		//���½ǵ�����
		while(tr <= dr && tc <= dc){
			printdge(arr,tr++,tc++,dr--,dc--);
		}
	}
	public static void printdge(int[][] arr,int tr,int tc,int dr,int dc){
		if(tr == dr){//ָ�����ϽǺ����½���ͬһ��ʱ
			for(int i = tc;i <= dc;i++ ){
				System.out.println(arr[tr][i]);
			}
		}else if(tc == dc){//ָ���ϽǺ����½���ͬһ��ʱ
				for(int i = tr;i <= dr;i++ ){
					System.out.println(arr[i][tc]);
				}
			}else{
				int cuc = tc;
				int cur = tr;
				while(cuc != dc){
					System.out.println(arr[tr][cuc]+" ");
					cuc++;
				}
				while(cur != dr){
					System.out.println(arr[cur][dc]+" ");
					cur++;
				}
				while(cuc != tc){
					System.out.println(arr[dr][cuc]+" ");
					cuc--;
				}
				while(cur != tr){
					System.out.println(arr[cur][tc]+" ");
					cur--;
				}
			}
		
		}
	}
