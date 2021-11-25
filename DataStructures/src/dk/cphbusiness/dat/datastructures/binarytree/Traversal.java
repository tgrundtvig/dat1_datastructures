package dk.cphbusiness.dat.datastructures.binarytree;

import dk.cphbusiness.dat.datastructures.Queue;

public class Traversal
{
	public static <T> void depthFirstPreOrder(TreeNode<T> root, Visitor<T> visitor)
	{
		if(root == null)
		{
			return;
		}
		visitor.visit(root.getValue());
		depthFirstPreOrder(root.getLeftChild(), visitor);
		depthFirstPreOrder(root.getRightChild(), visitor);
	}

	public static <T> void depthFirstInOrder(TreeNode<T> root, Visitor<T> visitor)
	{
		if(root == null)
		{
			return;
		}
		depthFirstInOrder(root.getLeftChild(), visitor);
		visitor.visit(root.getValue());
		depthFirstInOrder(root.getRightChild(), visitor);
	}

	public static <T> void breadthFirst(TreeNode<T> root, Visitor<T> visitor)
	{
		Queue<TreeNode<T>> queue;
		if(root == null)
		{
			return;
		}
		depthFirstInOrder(root.getLeftChild(), visitor);
		visitor.visit(root.getValue());
		depthFirstInOrder(root.getRightChild(), visitor);
	}
}
