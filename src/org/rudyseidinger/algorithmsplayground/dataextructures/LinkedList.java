package org.rudyseidinger.algorithmsplayground.dataextructures;

public class LinkedList {
	private LinkedListNode<?> rootNode;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void append(LinkedListNode node){
		if (notAssignedToRootNode(node)){
			LinkedListNode currentNode = rootNode;
			LinkedListNode nodeToAddNextItem = null;
			while (currentNode != null) {
				nodeToAddNextItem = currentNode;
				currentNode = currentNode.getNextItem();				
			}
			nodeToAddNextItem.setNextItem(node);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void prepend(LinkedListNode node){
		if (notAssignedToRootNode(node)){
			node.setNextItem(rootNode);
			this.rootNode = node;
		}
	}
	
	@SuppressWarnings("rawtypes")
	private boolean notAssignedToRootNode(LinkedListNode node) {
		if (rootNode == null)
			rootNode = node;
		return rootNode != node;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public String toString() {
		LinkedListNode currentNode = rootNode;
		StringBuilder stringList = new StringBuilder();
		while (currentNode != null) {
			stringList.append(currentNode.toString());			
			currentNode = currentNode.getNextItem();
			if (currentNode != null)
				stringList.append("=>");
		}
		return stringList.toString();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void remove(LinkedListNode node) {
		LinkedListNode currentNode = rootNode;
		if (currentNode == node){
			this.rootNode = node.getNextItem();
			return;
		}
		while (currentNode != null) {
			if (currentNode.getNextItem() == node){
				currentNode.setNextItem(node.getNextItem());
			}
			currentNode = currentNode.getNextItem();				
		}
		
	}

}
