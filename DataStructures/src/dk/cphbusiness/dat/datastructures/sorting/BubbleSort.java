package dk.cphbusiness.dat.datastructures.sorting;

import java.util.Comparator;

public class BubbleSort<T>
{
	private T[] array;
	private Comparator<T> comp;

	public BubbleSort(T[] array, Comparator<T> comp)
	{
		this.array = array;
		this.comp = comp;
	}

	public T[] sort()
	{
		if(array.length <= 1) return array;
		boolean done = false;
		while(!done)
		{
			done = true;
			for(int i = 0; i < array.length-1; ++i)
			{
				if(comp.compare(array[i], array[i+1]) > 0)
				{
					swap(i, i+1);
					done = false;
				}
			}
		}
		return array;
	}

	private void swap(int a, int b)
	{
		T tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}
