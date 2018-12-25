
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionSample {

	public static void main(String[] args) {
		// below is the sample of list of String we can store any type of object
		// in list.
		List<String> nameList = new ArrayList<>();
		nameList.add("TCS");
		nameList.add("ACCENTURE");
		nameList.add("TECHMAHINDRA");
		nameList.add("HCL");
		nameList.add("HCL"); // list allows duplicates

		// Printing list
		System.out.println(nameList);

		// below is the sample of set of String set never allows duplicates
		Set<String> nameSet = new HashSet<>(nameList); // here we passed list to
														// remove duplicates
		System.out.println("********After removing duplicates********** ");
		System.out.println(nameSet);

		// iterator is used to loop list

		Iterator itr = nameList.iterator();
		System.out.println("********using iterator********** ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
