package dk.cphbusiness.dat.datastructures;

public class StackImpl<T> implements Stack<T>
{
	private final SimpleList<T> list;

	public StackImpl(SimpleList<T> list)
	{
		this.list = list;
	}

	@Override
	public int size()
	{
		return list.size();
	}

	@Override
	public void push(T value)
	{
		list.addFirst(value);
	}

	@Override
	public T pop()
	{
		return list.takeFirst();
	}
}
