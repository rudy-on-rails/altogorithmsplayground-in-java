package org.rudyseidinger.algorithmsplayground.dataextructures;

public class LinkedListNode<T> {
	private T item;
	private LinkedListNode<T> nextItem;
	
	public LinkedListNode(T item) {
		this.item = item;
	}

	public LinkedListNode<T> getNextItem() {
		return nextItem;
	}

	public void setNextItem(LinkedListNode<T> nextItem) {
		this.nextItem = nextItem;
	}
	
	@Override
	public String toString() {
		return String.format("[%s]", this.item.toString());
	}
}