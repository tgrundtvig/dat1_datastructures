package dk.cphbusiness.dat.datastructures.listprinter;

import java.util.List;

public interface ListPrinter
{
	<T> void printList(List<T> list);
}
