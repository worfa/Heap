package heapPackage;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Heap heap = new Heap(100);
		Random rand = new Random();
		
		System.out.println(heap.toString());
		
		for(int i = 0; i < 32; i++) {
			heap.add(rand.nextInt(200));
		}
		
		System.out.println(heap.toString());
		
		for(int i = 0; i < 32; i++) {
			heap.get();
			System.out.println(heap.toString());
		}
	}
}
