package dk.cphbusiness.dat.datastructures;

public class ListNodeImpl<T> implements ListNode<T>
{
	private final T value;
	private ListNode<T> prev;
	private ListNode<T> next;

	public ListNodeImpl(T value)
	{
		this.value = value;
		this.prev = null;
		this.next = null;
	}

	public T getValue()
	{
		return value;
	}

	public ListNode<T> getPrev()
	{
		return prev;
	}

	public void setPrev(ListNode<T> prev)
	{
		this.prev = prev;
	}

	public ListNode<T> getNext()
	{
		return next;
	}

	public void setNext(ListNode<T> next)
	{
		this.next = next;
	}
}
