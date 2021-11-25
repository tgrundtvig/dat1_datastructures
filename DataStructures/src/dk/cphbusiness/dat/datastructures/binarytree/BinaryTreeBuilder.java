package dk.cphbusiness.dat.datastructures.binarytree;

import com.sun.source.tree.Tree;

import java.util.Comparator;

public class BinaryTreeBuilder<T>
{
	private TreeNode<T> root;
	private final Comparator<T> comp;

	public BinaryTreeBuilder(Comparator<T> comp)
	{
		this.comp = comp;
	}

	public TreeNode<T> getRootNode()
	{
		return root;
	}

	public void add(T value)
	{
		root = add(root, value);
	}

	private TreeNode<T> add(TreeNode<T> cur, T value)
	{
		if(cur == null) return new TreeNode<>(value);
		if(comp.compare(value, cur.getValue()) < 0)
		{
			cur.setLeftChild(add(cur.getLeftChild(), value));
		}
		else if(comp.compare(value, cur.getValue()) > 0)
		{
			cur.setRightChild(add(cur.getRightChild(), value));
		}
		return cur;
	}
}
