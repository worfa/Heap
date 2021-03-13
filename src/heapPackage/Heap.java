package heapPackage;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> arrayList;

	
	public Heap(int firstValue) {
		arrayList = new ArrayList<Integer>();
		arrayList.add(Integer.valueOf(firstValue));
	};
	
	public Heap() {
		arrayList = new ArrayList<Integer>();
	};
	
	public int peek() {
		return arrayList.get(0);
	}
	
	public String toString() {
		return arrayList.toString();
	}
	
	public void add(int value) {
		arrayList.add(value);
		int iterator = arrayList.size() - 1;
		int indRootVertex = (iterator - 1)/2;
		System.out.println(arrayList.toString());
		
		while(iterator > 0 && arrayList.get(indRootVertex) < arrayList.get(iterator)) {
			
			int temp = arrayList.get(indRootVertex);
			arrayList.set(indRootVertex, arrayList.get(iterator));
			arrayList.set(iterator, temp);
			
			iterator = indRootVertex;
			indRootVertex = (indRootVertex - 1) / 2;
		}
	}
	
	public int get() {
		int result = arrayList.get(0);
		arrayList.set(0, arrayList.get(arrayList.size() - 1));
		arrayList.remove(arrayList.size() - 1);
		heapify(0);
		return result;
	}
	
	private void heapify(int i) {
		int leftChild;
		int rightChild;
		int largestChild;
		
		for(;;) {
			
			leftChild = i * 2 + 1;
			rightChild = i * 2 + 2;
			largestChild = i;
			
			if(leftChild < arrayList.size() - 1 && arrayList.get(leftChild) > arrayList.get(largestChild)) {
				largestChild = leftChild;
			}
			
			if(rightChild < arrayList.size() - 1 && arrayList.get(rightChild) > arrayList.get(largestChild)) {
				largestChild = rightChild;
			}
			
			if(largestChild == i) {
				break;
			}
			
			int temp = arrayList.get(i);
			arrayList.set(i, arrayList.get(largestChild));
			arrayList.set(largestChild, temp);
			i = largestChild;
		}
	}
	
	
}


//сделать добавление
//сделать удаление
//сортировку