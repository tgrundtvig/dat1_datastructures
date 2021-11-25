package dk.cphbusiness.dat.datastructures.listprinter;

import java.util.List;

public class SimpleListPrinter implements ListPrinter
{
	@Override
	public <T> void printList(List<T> list)
	{
		for(T element : list)
		{
			System.out.println(element.toString());
		}
	}
}
