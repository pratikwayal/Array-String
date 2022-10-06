package collections_array;

import java.util.Stack;

public class Learnstack {

	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		animals.push("x");
		animals.push("y");
		animals.push("z");
		animals.push("e");
		animals.push("r");
		System.out.println(animals);
		System.out.println(animals.peek());
		animals.pop();
		System.out.println(animals);
		System.out.println(animals.peek());
		

	}

}
