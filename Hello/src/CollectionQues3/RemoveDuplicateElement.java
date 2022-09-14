package CollectionQues3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		List<Integer> values=new ArrayList<>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.add(10);
		values.add(20);
		TreeSet<Integer> hs=new TreeSet<Integer>();
		for(int i:values)
		{
			boolean add = hs.add(i);
		}
		System.out.println(hs);

	}

}
