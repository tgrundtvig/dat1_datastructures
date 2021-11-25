package dk.cphbusiness.dat.datastructures;

public interface ListNode<T>
{
	public T getValue();
	public ListNode<T> getPrev();
	public void setPrev(ListNode<T> prev);
	public ListNode<T> getNext();
	public void setNext(ListNode<T> next);
}
