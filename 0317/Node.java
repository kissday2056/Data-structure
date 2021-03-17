package arrList;

class Node <E> { //데이터와 링크가 있는것 
	private E item;
	private Node<E> next;
	/////////////////////////////////////
	public Node(E item, Node<E> node) {
		super();
		this.item = item;
		this.next = node;
	}
	
	public E getItem() {
		return item;
	}
	
	public Node<E> getNext() {
		return next;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public void setItem(E item) {
		this.item = item;
	}
	
	//그러면 주소는 데이터 타입이 따로 지정 안해주고 클래스면 ㅗ딘다 ?
	
}