package compare;

import java.util.Comparator;

import bean.Student;

public class ClassAscendingComparator implements Comparator<Student> {
/*
 * (non-Javadoc)
 * ���ս�����
 * ���ظ��������һ������ǰ��������������ڶ�������ǰ
 */
	public int compare(Student o1, Student o2) {
		if(o1.getAge() > o2.getAge()){//��o1��������ǰ��
		return -1;
		}else if(o1.getAge() < o2.getAge()){//����o2��������ǰ��
			return 1;
		}else{//����age��ȣ���������
			return 0;
		}
		//�������п���ʡ��Ϊrenturn o2.getAge()-01.getAge()
	}
	
}
