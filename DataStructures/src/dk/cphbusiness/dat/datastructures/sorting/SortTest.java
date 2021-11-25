package dk.cphbusiness.dat.datastructures.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class SortTest
{
	public static void main(String[] args)
	{
		CountComparator<Integer> cc = new CountComparator<>(new MyComparator());
		int arraySize = 100000;
		Integer[] array = new Integer[arraySize];
		for(int i  = 0; i < arraySize; ++i)
		{
			array[i] = i+1;
		}
		shuffle(array);
		Integer[] arrayCopy = Arrays.copyOf(array, array.length);
		/*
		BubbleSort<Integer> bs = new BubbleSort<Integer>(array, cc);
		System.out.println("Start BubbleSort");
		bs.sort();
		System.out.println("BubbleSort finished: compares -> " + cc.getCount());
		*/
		cc.resetCount();
		HeapSort<Integer> hs = new HeapSort<Integer>(arrayCopy, cc);
		System.out.println("Start HeapSort");
		hs.sort();
		System.out.println("HeapSort finished: compares -> " + cc.getCount());
		cc.resetCount();
		System.out.println("Arrays.sort start");
		Arrays.sort(array, cc);
		System.out.println("Arrays.Sort finished: compares -> " + cc.getCount());
	}
	private static <T> void shuffle(T[] array)
	{
		Random rnd = new Random();
		for(int i = 0; i < array.length; ++i)
		{
			int index = rnd.nextInt(array.length-i) + i;
			swap(array, i, index);
		}
	}

	private static <T> void swap(T[] array, int a, int b)
	{
		T tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

	private static <T> void printArray(T[] array)
	{
		for(T element : array)
		{
			System.out.println(element.toString());
		}
	}
}
