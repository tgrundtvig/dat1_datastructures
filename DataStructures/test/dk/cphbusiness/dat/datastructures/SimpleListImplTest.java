package dk.cphbusiness.dat.datastructures;

public class SimpleListImplTest implements SimpleListTest
{
	@Override
	public SimpleList<Integer> createNewSimpleList()
	{
		return new SimpleListImpl<Integer>();
	}
}
