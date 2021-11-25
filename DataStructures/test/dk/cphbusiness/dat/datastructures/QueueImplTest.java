package dk.cphbusiness.dat.datastructures;

public class QueueImplTest implements QueueTest
{
	@Override
	public Queue<Integer> createNewQueue()
	{
		return new QueueImpl<Integer>(new SimpleListImpl<Integer>());
	}
}
