package dk.cphbusiness.dat.datastructures.listprinter;

import java.util.ArrayList;
import java.util.List;

public class ListPrinterTest
{
	public static void main(String[] args)
	{
		List<String> stringList = new ArrayList<>();
		stringList.add("One");
		stringList.add("Two");
		stringList.add("Three");
		stringList.add("Four");

		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);

		ListPrinter printer = new SimpleListPrinter();

		printer.printList(stringList);
		printer.printList(integerList);

	}
}
