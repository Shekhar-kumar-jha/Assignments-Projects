package CollectionQues1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortCollectionElement {

	public static void main(String[] args) {
		List<Integer> items=new ArrayList<>();
		items.add(10);
		items.add(20);
		Collections.sort(items);
		for(int al:items)
		{
			System.out.println(al);
		}

	}

}
