package dk.cphbusiness.dat.datastructures.binarytree;

public class TreeNode<T>
{
	private final T value;
	private TreeNode<T> leftChild;
	private TreeNode<T> rightChild;

	public TreeNode(T value)
	{
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
	}

	public T getValue()
	{
		return value;
	}

	public TreeNode<T> getLeftChild()
	{
		return leftChild;
	}

	public void setLeftChild(TreeNode<T> leftChild)
	{
		this.leftChild = leftChild;
	}

	public TreeNode<T> getRightChild()
	{
		return rightChild;
	}

	public void setRightChild(TreeNode<T> rightChild)
	{
		this.rightChild = rightChild;
	}
}
