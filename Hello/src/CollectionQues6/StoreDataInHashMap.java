package CollectionQues6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StoreDataInHashMap {

	public static void main(String[] args) {
		TreeMap<String,Integer> hm=new TreeMap<>();
		hm.put("pune", 1200);
		hm.put("indore", 2500);
		hm.put("jamshedpur", 800);
		for(Map.Entry<String, Integer>hs:hm.entrySet())
		{
			System.out.println(hs.getKey()+" "+hs.getValue());
		}

	}

}
