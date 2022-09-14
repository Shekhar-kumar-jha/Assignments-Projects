package CollectionQues5;

import java.util.Collections;
import java.util.Vector;

public class StoreItemInVectorAndSort {

	public static void main(String[] args) {
		Vector<Integer> items=new Vector<>();
		items.add(50);
		items.add(30);
		items.add(40);
		items.add(20);
		items.add(10);
		Collections.sort(items);
		for(int v:items)
		{
			System.out.println(v);
		}

	}

}
