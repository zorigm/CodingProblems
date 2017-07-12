package endstarttesting;

public class MiddleLL {

	public boolean removeMiddleNode(Node middle)
	{
		Node current = middle;
		
		if(middle == null || middle.next == null)
		{
			return false;
		}

		middle.data = middle.next.data;
		current = current.next;
		middle.next = current.next;
		return true;
		
	}
	
}
