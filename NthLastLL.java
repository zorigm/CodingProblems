package endstarttesting;

public class NthLastLL {
	
	public Node findNthLast(Node head, int n)
	{
		Node runner = head;
		Node current = head;
		
		if(head == null)
		{
			return;
		}
		
		for(int i = 0; i < n; i++)
		{
			runner = runner.next;
		}
		
		while(runner != null)
		{
			runner = runner.next;
			current = current.next;
		}
		
		return current;
	}

}
