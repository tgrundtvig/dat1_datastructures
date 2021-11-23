package dk.cphbusiness.dat.datastructures;

public interface ListNode
{
	public int getValue();
	public ListNode getPrev();
	public void setPrev(ListNode prev);
	public ListNode getNext();
	public void setNext(ListNode next);
}
