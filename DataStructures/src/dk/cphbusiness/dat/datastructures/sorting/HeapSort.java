package dk.cphbusiness.dat.datastructures.sorting;

import java.util.Comparator;

public class HeapSort<T>
{
	private T[] array;
	private int treeSize;
	private Comparator<T> comp;

	public HeapSort(T[] array, Comparator<T> comp)
	{
		this.array = array;
		this.comp = comp;
		this.treeSize = array.length;
	}

	public T[] sort()
	{
		if(array.length <= 1) return array;
		initialHeapify();
		heapSort();
		return array;
	}

	private void initialHeapify()
	{
		for(int x = treeSize/2; x >= 0; --x)
		{
			heapifyNode(x);
		}
	}

	private void heapSort()
	{
		while(treeSize > 0)
		{
			swap(0, treeSize - 1);
			--treeSize;
			heapifyNode(0);
		}
	}

	private void heapifyNode(int x)
	{
		int left = leftChild(x);
		if(left == -1) return;
		int largestChild = left;
		int right = rightChild(x);
		if(right != -1 && comp.compare(array[right], array[left]) > 0)
		{
			largestChild = right;
		}
		//Now largestChild contains the index of the largest child
		if(comp.compare(array[largestChild], array[x]) <= 0) return;

		//We have to swap largestchild with this node
		swap(largestChild, x);

		heapifyNode(largestChild);
	}

	private void swap(int a, int b)
	{
		T tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

	private int leftChild(int x)
	{
		int res = 2*x+1;
		return (res < treeSize) ? res : -1;
	}

	private int rightChild(int x)
	{
		int res = 2*x+2;
		return (res < treeSize) ? res : -1;
	}
}
