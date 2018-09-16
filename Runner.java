import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeriodicTable pt1 = new PeriodicTable();
		System.out.println(pt1.checkSymbol("Zockurijirium", "Zr"));
		
		String fileName = "C:\\Users\\manis\\eclipse-workspace\\Periodic\\src\\elements.txt";
		List<String> list = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			//1. filter line 3
			//2. convert all content to upper case
			//3. convert it into a List
			list = stream
					.map(String::toLowerCase)
					.collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}
		pt1.getSymbol(list);
//		list.forEach(System.out::println);

		
	}

}
