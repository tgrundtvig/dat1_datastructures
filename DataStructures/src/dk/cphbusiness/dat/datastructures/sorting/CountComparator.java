package dk.cphbusiness.dat.datastructures.sorting;

import java.util.Comparator;

public class CountComparator<T> implements Comparator<T>
{
	private int count;
	private Comparator<T> actual;

	public CountComparator(Comparator<T> actual)
	{
		this.actual = actual;
		this.count = 0;
	}

	public int getCount()
	{
		return count;
	}

	public void resetCount()
	{
		count = 0;
	}

	@Override
	public int compare(T o1, T o2)
	{
		++count;
		return actual.compare(o1, o2);
	}
}
