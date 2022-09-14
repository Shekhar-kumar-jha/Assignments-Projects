package CollectionQues4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesNamesItem {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Heena");
		names.add("kanchan");
		names.add("sheetal");
		names.add("vaishali");
		names.add("kanchan");
		names.add("sheetal");
		names.add("iram");
		HashSet<String> hs=new HashSet<>();
		for(String name:names)
		{
			boolean add = hs.add(name);
		}
        System.out.println(hs);
	}

}
