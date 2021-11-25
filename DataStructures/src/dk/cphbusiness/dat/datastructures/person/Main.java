package dk.cphbusiness.dat.datastructures.person;

public class Main
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Tobias");
		Person p2 = new Person("Tobias");
		Object o1 = p1;
		Object o2 = p2;
		int[][] aa = new int[1000][];
		for(int i = 0; i < 1000; ++i)
		{
			aa[i] = new int[2000000000];
		}

		System.out.println(o1.equals(o2));
	}

}
