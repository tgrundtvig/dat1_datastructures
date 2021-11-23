package dk.cphbusiness.dat.datastructures;

public class ListNodeImpl implements ListNode
{
	private final int value;
	private ListNode prev;
	private ListNode next;

	public ListNodeImpl(int value)
	{
		this.value = value;
		this.prev = null;
		this.next = null;
	}

	public int getValue()
	{
		return value;
	}

	public ListNode getPrev()
	{
		return prev;
	}

	public void setPrev(ListNode prev)
	{
		this.prev = prev;
	}

	public ListNode getNext()
	{
		return next;
	}

	public void setNext(ListNode next)
	{
		this.next = next;
	}
}
