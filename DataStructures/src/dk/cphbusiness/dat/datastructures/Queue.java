package dk.cphbusiness.dat.datastructures;

public interface Queue extends Bag
{
	int size();
	void enqueue(int value);
	int dequeue();
}
