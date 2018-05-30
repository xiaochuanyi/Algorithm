package binaryTree;
/**
 * 判断是否为一个平衡二叉树
 * @author xiaoyi
 *
 */
public class IsBalancedTree {
	/**
	 * 自己定义的数据结构，用于返回二叉树子树是否平衡和其深度
	 * @author xiaoyi
	 *
	 */
	static class ReturnData{
		public boolean isBalanced;
		public int hight;
		public ReturnData(boolean isBanlanced,int hight){
			this.isBalanced= isBanlanced;
			this.hight = hight;
		}
	}
	/**
	 * 递归过程
	 * @param head
	 * @return
	 */
	public static ReturnData process(Node head){
		if(head == null){
			return new ReturnData(true, 0);
		}
		ReturnData leftData = process(head.left);
		ReturnData rightData = process(head.right);
		if(!leftData.isBalanced){
			return new ReturnData(false, -1);
		}
		if(!rightData.isBalanced){
			return new ReturnData(false, -1);
		}
		if(Math.abs(leftData.hight-rightData.hight) > 1){
			return new ReturnData(false, -1);
		}
		return new ReturnData(true, Math.max(leftData.hight, rightData.hight+1));
		
	}
}
