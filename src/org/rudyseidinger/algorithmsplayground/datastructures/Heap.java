package org.rudyseidinger.algorithmsplayground.datastructures;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
class Heap<T> {	
	private Heap parentNode;
	private List<Heap> childNodes;
	private T object;
		
	public Heap(T object) {
		this.setObject(object);
		this.setChildNodes(new ArrayList<Heap>());
	}
	
	public Heap(T object, Heap parentNode) {
		this.setObject(object);
		this.setParentNode(parentNode);
	}
	
	public Heap(T object, Heap parentNode, List<Heap> childNodes) {
		this.setObject(object);
		this.setParentNode(parentNode);
		this.setChildNodes(childNodes);
		this.sortTree();
	}

	private void sortTree() {
		
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public Heap getParentNode() {
		return parentNode;
	}

	public void setParentNode(Heap parentNode) {
		this.parentNode = parentNode;
	}

	public List<Heap> getChildNodes() {
		return childNodes;
	}

	private void setChildNodes(List<Heap> childNodes) {
		this.childNodes = childNodes;
	}
}