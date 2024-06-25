import java.util.Iterator;

public class LinkedList<E> {
	private class ListNode {
		E data;
		ListNode next;

		ListNode(E data, ListNode next) {
			this.data = data;
			this.next = next;
		}
	}

	private ListNode head = new ListNode(null, null);
	private int length = 0;

	public void append(E data) {
		ListNode n = new ListNode(data, null);
		ListNode curr = head;
		while (curr.next != null)
			curr = curr.next;
		curr.next = n;
		++length;
	}

	public void prepend(E data) {
		ListNode n = new ListNode(data, head.next);
		head.next = n;
		++length;
	}

	public boolean compare(LinkedList<E> other){
		if (length != other.length) return false;
		ListNode p = head.next;
		ListNode q = other.head.next;
		while (p != null) {
			if (! p.data.equals(q.data)) return false;
			p = p.next;
			q = q.next;
		}
		return true;
	}

	public E removeSecond(){
		if (length < 2) return null;
		ListNode first = head.next;
		ListNode second = first.next;
		ListNode third = second.next;

		first.next = third;
		second.next = null;
		--length;
		return second.data;
	}

	public E removeSecondLast(){
		if (length < 2) return null;
		ListNode curr = head.next;
		ListNode prev = head;
		while (curr.next.next != null) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = curr.next;
		curr.next = null;
		--length;
		return curr.data;
	}


	public int remove(E d){
		int count = 0;
		ListNode curr = head.next;
		ListNode prev = head;
		while (curr != null) {
			if (curr.data.equals(d)){
				prev.next = curr.next;
				curr.next = null;
				curr = prev.next;
				--length;
				count++;
			} else {
				prev = curr;
				curr = curr.next;
			}
		}
		return count;
	}

	public String toString() {
		ListNode current = head.next;
		String out = "[";
		while(current != null) {
			out += current.data;
			if(current.next != null) {
				out += ", ";
			}
			current = current.next;
		}
		out += "]";
		return out;
	}

	//method from Iterable interface makes for-each loops work
	public Iterator<E> iterator() {
		return new ListIterator(head);
	}

	private class ListIterator implements Iterator<E> {

		ListNode current;

		public ListIterator(ListNode head) {
			current = head;
		}

		@Override
		public boolean hasNext() {
			return current.next != null;
		}

		@Override
		public E next() {
			current = current.next;
			return current.data;
		}

	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.append("3");
		list.append("4");
		list.append("1");
		list.prepend("2");
		list.prepend("1");
		list.prepend("1");
		System.out.println(list);

		LinkedList<String> list1 = new LinkedList<>();
		list1.append("3");
		list1.append("4");
		list1.append("1");
		list1.prepend("2");
		list1.prepend("1");
		list1.prepend("1");

		LinkedList<String> list2 = new LinkedList<>();
		list2.append("3");
		list2.append("4");
		list2.append("4");
		list2.prepend("2");
		list2.prepend("1");
		list2.prepend("1");

		if (list.compare(list1)) System.out.println("list1: same linked list");
		if (list.compare(list2)) System.out.println("list2: same linked list");

		list.removeSecond();
		System.out.println("After removing the second element: " + list);
		list.removeSecondLast();
		System.out.println("After removing the second last element: " + list);
		list.remove("1");
		System.out.println("After removing \"1\": " + list);

	}

}
