package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		list.get(2);
		list.addLast(4);
		list.addFirst(0);
		
		list.getLast();
		System.out.println(list);
		
		list.removeIf(x -> x%2 ==0);     //remove even number --> java8 feature
		
		System.out.println(list);
		
		LinkedList<String> animal = new LinkedList<String>(Arrays.asList("Cat","Dog","Elephant"));
		LinkedList<String> animalToRemove = new LinkedList<String>(Arrays.asList("Dog","Lion"));
		animal.removeAll(animalToRemove);
		System.out.println(animal);
		
		

	}

}
