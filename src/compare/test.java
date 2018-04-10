package compare;

import java.util.Arrays;
import java.util.PriorityQueue;

import org.junit.Test;

import bean.Student;

public class test {
	@Test
	public void test1(){
		Student stu1 = new Student("xiao",10);
		Student stu2 = new Student("xiao1",13);
		Student stu3 = new Student("xiao2",8);
		Student stu4 = new Student("xiao3",14);
		Student[] stu ={stu1,stu2,stu3,stu4};
		//Arrays.sort(stu, new ClassAscendingComparator());
		//优先级队列，即系统提供的堆，传入比较器后就会按照你传入的比较器的策略来构造堆，此时是一个大根堆
		PriorityQueue<Student> pr = new PriorityQueue<Student>( new ClassAscendingComparator());
		pr.add(stu1);
		pr.add(stu2);
		pr.add(stu3);
		pr.add(stu4);
		//for(int i = 0;i < stu.length;i++){
			//System.out.println(stu[i]);
		//}
		while(!pr.isEmpty()){
			Student s = pr.poll();
			System.out.println(s);
		}
	}
	
}
