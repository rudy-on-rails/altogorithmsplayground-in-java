package org.rudyseidinger.algorithmsplayground.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.rudyseidinger.algorithmsplayground.*;
import org.rudyseidinger.algorithmsplayground.datastructures.LinkedList;
import org.rudyseidinger.algorithmsplayground.datastructures.LinkedListNode;

public class LinkedListTest {
	LinkedList myList = new LinkedList();
	
	@Test
	public void testAppend() {		
		LinkedListNode<String> node = new LinkedListNode<>("1");
		myList.append(node);
		LinkedListNode<String> node2 = new LinkedListNode<>("2");
		myList.append(node2);
		assertEquals("[1]=>[2]", myList.toString());
	}
	
	@Test
	public void testPrepend() {		
		LinkedListNode<String> node = new LinkedListNode<>("1");
		myList.append(node);
		LinkedListNode<String> node2 = new LinkedListNode<>("2");
		myList.prepend(node2);
		assertEquals("[2]=>[1]", myList.toString());
	}
	
	@Test
	public void testRemoveIntermediaryElement() {		
		LinkedListNode<String> node = new LinkedListNode<>("1");
		myList.append(node);
		LinkedListNode<String> node2 = new LinkedListNode<>("2");
		myList.append(node2);
		LinkedListNode<String> node3 = new LinkedListNode<>("3");
		myList.append(node3);
		myList.remove(node2);
		assertEquals("[1]=>[3]", myList.toString());
	}
	
	@Test
	public void testRemoveLastElement() {		
		LinkedListNode<String> node = new LinkedListNode<>("1");
		myList.append(node);
		LinkedListNode<String> node2 = new LinkedListNode<>("2");
		myList.append(node2);
		LinkedListNode<String> node3 = new LinkedListNode<>("3");
		myList.append(node3);
		myList.remove(node3);
		assertEquals("[1]=>[2]", myList.toString());
	}
	
	@Test
	public void testRemoveFirstElement() {		
		LinkedListNode<String> node = new LinkedListNode<>("1");
		myList.append(node);
		LinkedListNode<String> node2 = new LinkedListNode<>("2");
		myList.append(node2);
		LinkedListNode<String> node3 = new LinkedListNode<>("3");
		myList.append(node3);
		myList.remove(node);
		assertEquals("[2]=>[3]", myList.toString());
	}

}
