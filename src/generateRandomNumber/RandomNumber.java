package generateRandomNumber;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) {
		Set<Integer> mySet = new TreeSet<Integer>();

		while (mySet.size() != 500) {
			mySet.add(ThreadLocalRandom.current().nextInt(100, 1000 + 1));
		}

		System.out.println(mySet);
		System.out.println(mySet.size());
		Object[] mySetArray = mySet.toArray();
		System.out.println("Nth smallest No :" + mySetArray[0]);

	}

}
