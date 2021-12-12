import java.util.AbstractSequentialList;
import java.util.Collection;

class LinkedList<E> extends AbstractSequentialList<E> {
	private Element firstElement;
	private Element lastElement;
	private int size = 0;

	public LinkedList(){ }

	public E get(int index){
		Element curEl = firstElement;
		for(long i=0; i<index; i++){
			curEl = curEl.next();
			if(curEl == null)
				throw new java.lang.IndexOutOfBoundsException();
		}
		return (E) curEl.val();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public java.util.ListIterator<E> listIterator(int index) {
		return null;
	}

	@Override
	public boolean add(E el){
		if(firstElement == null){
			firstElement = new Element(el);
		}else{
			last().setNext(el);
		}
		size++;
		return true;
	}

	private Element last(){
		Element current = firstElement;
		if(current == null)
			return null;

		for(;;){
			if(current.next() == null)
				return current;
			else
				current = current.next();
		}
	}

	private class Element<E>{
		private E val;
		private Element next = null;

		Element(E val){
			this.val = val;
		}

		Element next(){
			return next;
		}

		void setNext(E val){
			next = new Element(val);
		}

		E val(){
			return val;
		}

		@Override
		public String toString(){
			return val.toString();
		}
	}

	@Override
	public String toString(){
		java.lang.StringBuilder str = new java.lang.StringBuilder();

		str.append("[");

		Element currentEl = firstElement;
		for(;;){
			str.append(currentEl.val());
			if(currentEl.next() == null) {
				str.append("]");
				break;
			}else{
				str.append(", ");
				currentEl = currentEl.next();
			}
		}
		return str.toString();
	}
}

class ListIterator<E> implements java.util.ListIterator<E>{
	Collection<E> collection;
	Collection<E> firstElement;

	ListIterator(Collection<E> collection){
		this.collection = collection;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public E next() {
		return null;
	}

	@Override
	public boolean hasPrevious() {
		return false;
	}

	@Override
	public E previous() {
		return null;
	}

	@Override
	public int nextIndex() {
		return 0;
	}

	@Override
	public int previousIndex() {
		return 0;
	}

	@Override
	public void remove() {

	}

	@Override
	public void set(E e) {

	}

	@Override
	public void add(E e) {

	}
}