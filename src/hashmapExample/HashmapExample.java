package hashmapExample;

import java.text.MessageFormat;
import java.util.HashMap;

public class HashmapExample {

	public static void hashExample() {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany","Berlin");
		capitalCities.put("Brazil", "Brasilia");
		capitalCities.put("Argentina", "Buenos Aires");
		
		capitalCities.forEach((k, v) -> System.out.println(MessageFormat.format("Key: {0} Value: {0}", k, v)));
		System.out.println();
		
		System.out.println(capitalCities.get("Brazil"));
		System.out.println();
		
		capitalCities.remove("Brazil");
		capitalCities.clear();
	}
	
	public static void main(String[] args) {
		hashExample();
	}
}
