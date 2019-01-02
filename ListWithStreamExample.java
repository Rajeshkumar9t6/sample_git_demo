import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListWithStreamExample {
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();
		numberList = Arrays.asList(4, 5, 6, 7, 8, 9, 10); // assigning array of
															// numbers to list

		// printing even numbers using iterator
		Iterator itr = numberList.iterator();
		System.out.println("*******Even number using iterator*******");
		while (itr.hasNext()) {
			Integer evenNumber = (Integer) itr.next();
			if (evenNumber % 2 == 0) {
				System.out.println(evenNumber);
			}
		}

		// printing even numbers using iterator
		System.out.println("*******Even number using iterator*******");
		numberList.stream().filter(currentNumber -> currentNumber % 2 == 0).forEach(System.out::println);
		// in above line
		// stream is used instead of iterator
		// filter method is used instead of if condition
		// currentNumber represents the actual number in iteration (like variable i in for loop)
	}

}
