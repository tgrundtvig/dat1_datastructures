package dk.cphbusiness.dat.datastructures;

public interface Stack extends Bag
{
	int size();
	void push(int value);
	int pop();
}
