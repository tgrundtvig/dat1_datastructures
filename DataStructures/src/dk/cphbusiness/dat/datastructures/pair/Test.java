package dk.cphbusiness.dat.datastructures.pair;

public class Test
{
	public static void main(String[] args)
	{
		Pair<String> p = new PairImpl<>("First", "Second");
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
	}
}
