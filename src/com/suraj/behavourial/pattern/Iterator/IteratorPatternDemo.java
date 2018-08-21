package com.suraj.behavourial.pattern.Iterator;

interface Iterator {
	
	public boolean hasNext();
	public Object next();
}

interface Iterable {
	public Iterator iterator();
}

class NamedList implements Iterable {

	String[] names = {"rama","sita","laxman","madhava"};
	
	@Override
	public Iterator iterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {
		
		int index;
		
		@Override
		public boolean hasNext() {
			if(index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}
public class IteratorPatternDemo {
	
	public static void main(String[] args) {
		
		NamedList list = new NamedList();
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
