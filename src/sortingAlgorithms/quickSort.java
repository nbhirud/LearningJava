package sortingAlgorithms;

import java.util.ArrayList;

public class quickSort {
	ArrayList<Integer> list = new ArrayList<>();
	
	public quickSort() {
		super();
	}
	
	public quickSort(ArrayList<Integer> list) {
		super();
		this.list = list;
	}
	
	public quickSort(int[] list) {
		super();
		this.list = new ArrayList<Integer>();
		for (int i : list) {
			this.list.add(i);
		}
	}
	
	public ArrayList<Integer> quickSorter() {
		quickSorter(0, list.size()-1);
		return list;
	}
	
	public void quickSorter(int left, int right) {
		if (left >= right) {
			return;	
		}
		return;
	}
}
