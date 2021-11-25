package dk.cphbusiness.dat.datastructures;

public interface SimpleList<T>
{
	int size();

	void addFirst(T value);

	void addLast(T value);

	T takeFirst();

	T takeLast();
}
