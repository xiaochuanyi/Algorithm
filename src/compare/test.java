package compare;

import java.util.Arrays;

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
		Arrays.sort(stu, new ClassAscendingComparator());
		for(int i = 0;i < stu.length;i++){
			System.out.println(stu[i]);
		}
	}
	
}
