package dk.cphbusiness.dat.datastructures;

public class StackImplTest implements StackTest
{
	@Override
	public Stack<Integer> createNewStack()
	{
		return new StackImpl<Integer>(new SimpleListImpl<Integer>());
	}
}
