package compare;

import java.util.Comparator;

import bean.Student;

public class ClassAscendingComparator implements Comparator<Student> {
/*
 * (non-Javadoc)
 * 按照降序排
 * 返回负数代表第一个排在前，返回整数代表第二个放在前
 */
	public int compare(Student o1, Student o2) {
		if(o1.getAge() > o2.getAge()){//让o1对象排在前面
		return -1;
		}else if(o1.getAge() < o2.getAge()){//让噢o2对象排在前面
			return 1;
		}else{//两个age相等，无需排序
			return 0;
		}
		//上述三行可以省略为renturn o2.getAge()-01.getAge()
	}
	
}
