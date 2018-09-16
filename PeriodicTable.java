import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PeriodicTable {
	

	public boolean checkSymbol(String ele, String sym) {
		ele = ele.toLowerCase();
		sym = sym.toLowerCase();
		String[] symArray = sym.split("");
		if(ele.contains(symArray[0])) {
			ele = ele.substring(ele.indexOf(symArray[0])+1);
			if(ele.contains(symArray[1])) {
				return true;
			}
		}
		return false;
	}
	
	public void getSymbol(List<String> elements) {
		HashMap<String, String> symbols = new HashMap<>();
		for(String element:elements) {
			for(int j=0, i=j+1;i<element.length();i++) {
				if(symbols.get(Character.toString(element.charAt(j))+Character.toString(element.charAt(i)))==null) {
					symbols.put(Character.toString(element.charAt(j))+Character.toString(element.charAt(i)), element);
					System.out.println(symbols.get(Character.toString(element.charAt(j))+Character.toString(element.charAt(i)))+":"+Character.toString(element.charAt(j))+Character.toString(element.charAt(i)));
					break;
				}
				else {
					j++;
				}
			}
		}
//		for(String key:symbols.keySet()) {
//			System.out.println(key+":"+symbols.get(key));
//			if(!elements.contains(symbols.get(key))) {
//				System.out.println("No symbol for: "+symbols.get(key));
//			}
//		}
		
	}


}
