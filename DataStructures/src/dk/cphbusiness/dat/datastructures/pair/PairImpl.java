package dk.cphbusiness.dat.datastructures.pair;

public class PairImpl<T> implements Pair<T>
{
	private final T first;
	private final T second;

	public PairImpl(T first, T second)
	{
		this.first = first;
		this.second = second;
	}

	@Override
	public T getFirst()
	{
		return first;
	}

	@Override
	public T getSecond()
	{
		return second;
	}
}
