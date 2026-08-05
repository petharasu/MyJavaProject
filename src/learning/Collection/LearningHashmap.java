package learning.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import jdk.javadoc.internal.doclets.toolkit.util.Comparators;

//import jdk.javadoc.internal.doclets.toolkit.util.Comparators;

public class LearningHashmap {

	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		Map<Students,Boolean> ls=new HashMap<>();
		List<Students> stulist=new ArrayList<Students>();
		
//		Integer<>
		
		Students s1=new Students("petharasu", 1);
		Students s2=new Students("karthi", 3);
		Students s3=new Students("petharasu", 1);
		
		ls.put(s1,false);
		ls.put(s2,false);
		ls.put(s3,false);
		
		stulist.add(s2);
		stulist.add(s1);
		Collections.sort(stulist);
		
		System.out.println("Map Values "+ls);
		System.out.println("list values "+stulist);
		System.out.println(stulist.contains(s3));
		
		
	}

}
