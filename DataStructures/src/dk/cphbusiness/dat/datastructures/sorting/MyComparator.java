package dk.cphbusiness.dat.datastructures.sorting;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer a, Integer b)
	{
		return across(a) - across(b);
	}

	private int across(int i)
	{
		int res = 0;
		while(i > 0)
		{
			res += i%10;
			i = i / 10;
		}
		return res;
	}
}
