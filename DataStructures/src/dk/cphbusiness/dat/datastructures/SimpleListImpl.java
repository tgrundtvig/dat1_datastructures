package dk.cphbusiness.dat.datastructures;

import java.util.NoSuchElementException;

public class SimpleListImpl<T> implements SimpleList<T>, ListNode<T>
{
	private ListNode<T> first;
	private ListNode<T> last;
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
	public void addFirst(T value)
	{
		ListNode newNode = new ListNodeImpl(value);
		newNode.setNext(first);
		newNode.setPrev(this);
		first.setPrev(newNode);
		first = newNode;
		++size;
	}

	@Override
	public void addLast(T value)
	{
		ListNode newNode = new ListNodeImpl(value);
		newNode.setPrev(last);
		newNode.setNext(this);
		last.setNext(newNode);
		last = newNode;
		++size;
	}

	@Override
	public T takeFirst()
	{
		if(size == 0)
		{
			throw new NoSuchElementException("The list is empty!");
		}
		T res = first.getValue();
		first.getNext().setPrev(this);
		first = first.getNext();
		--size;
		return res;
	}

	@Override
	public T takeLast()
	{
		if(size == 0)
		{
			throw new NoSuchElementException("The list is empty!");
		}
		T res = last.getValue();
		last.getPrev().setNext(this);
		last = last.getPrev();
		--size;
		return res;
	}

	@Override
	public T getValue()
	{
		throw new UnsupportedOperationException("The list itself has no value!");
	}

	@Override
	public ListNode<T> getPrev()
	{
		return last;
	}

	@Override
	public void setPrev(ListNode<T> prev)
	{
		last = prev;
	}

	@Override
	public ListNode<T> getNext()
	{
		return first;
	}

	@Override
	public void setNext(ListNode<T> next)
	{
		first = next;
	}
}
