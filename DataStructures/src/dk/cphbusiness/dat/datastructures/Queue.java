package dk.cphbusiness.dat.datastructures;

public interface Queue<T>
{
	int size();
	void enqueue(T value);
	T dequeue();
}
