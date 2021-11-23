package dk.cphbusiness.dat.datastructures;

import java.util.NoSuchElementException;

public class SimpleListImpl implements SimpleList, ListNode
{
	private ListNode first;
	private ListNode last;
	private int size;

	public SimpleListImpl()
	{
		this.first = this;
		this.last = this;
		this.size = 0;
	}

	@Override
	public int size()
	{
		return size;
	}

	@Override
	public void addFirst(int value)
	{
		ListNode newNode = new ListNodeImpl(value);
		newNode.setNext(first);
		newNode.setPrev(this);
		first.setPrev(newNode);
		first = newNode;
		++size;
	}

	@Override
	public void addLast(int value)
	{
		ListNode newNode = new ListNodeImpl(value);
		newNode.setPrev(last);
		newNode.setNext(this);
		last.setNext(newNode);
		last = newNode;
		++size;
	}

	@Override
	public int takeFirst()
	{
		if(size == 0)
		{
			throw new NoSuchElementException("The list is empty!");
		}
		int res = first.getValue();
		first.getNext().setPrev(this);
		first = first.getNext();
		--size;
		return res;
	}

	@Override
	public int takeLast()
	{
		if(size == 0)
		{
			throw new NoSuchElementException("The list is empty!");
		}
		int res = last.getValue();
		last.getPrev().setNext(this);
		last = last.getPrev();
		--size;
		return res;
	}

	@Override
	public int getValue()
	{
		throw new UnsupportedOperationException("The list itself has no value!");
	}

	@Override
	public ListNode getPrev()
	{
		return last;
	}

	@Override
	public void setPrev(ListNode prev)
	{
		last = prev;
	}

	@Override
	public ListNode getNext()
	{
		return first;
	}

	@Override
	public void setNext(ListNode next)
	{
		first = next;
	}
}
