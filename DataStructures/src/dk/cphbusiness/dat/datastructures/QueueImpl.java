package dk.cphbusiness.dat.datastructures;

public class QueueImpl<T> implements Queue<T>
{
	private final SimpleList<T> list;

	public QueueImpl(SimpleList<T> list)
	{
		this.list = list;
	}

	@Override
	public int size()
	{
		return list.size();
	}

	@Override
	public void enqueue(T value)
	{
		list.addLast(value);
	}

	@Override
	public T dequeue()
	{
		return list.takeFirst();
	}
}
