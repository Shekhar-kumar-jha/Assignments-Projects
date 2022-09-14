import java.util.HashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
		
	       
	        
	        Map<Integer,String> map=new HashMap<Integer,String>();
	        map.put(10, "Yash");
	        map.put(11,"Technologies");
	        map.put(20,"jaynam");            //keySet() containing all the keys()
	        for(Map.Entry m:map.entrySet())//it returns the set  containing all keys and values
	            System.out.println("Key:"+m.getKey()+" Value:"+m.getValue());

	}

}
