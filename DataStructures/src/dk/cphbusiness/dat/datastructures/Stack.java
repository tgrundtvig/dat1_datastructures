package dk.cphbusiness.dat.datastructures;

public interface Stack<T>
{
	int size();
	void push(T value);
	T pop();
}
