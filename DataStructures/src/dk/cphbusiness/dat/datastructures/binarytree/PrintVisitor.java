package dk.cphbusiness.dat.datastructures.binarytree;

public class PrintVisitor<T> implements Visitor<T>
{
	@Override
	public void visit(T value)
	{
		System.out.println(value.toString());
	}
}
