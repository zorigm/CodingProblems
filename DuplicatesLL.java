package endstarttesting;

public class DuplicatesLL {
	
	public void removeDuplicates(Node head)
	{
		if(head==null)
		{
			return;
		}
		
		Node tracker = head;
		int[] values = new int[21];
		
		//first run through keep track of duplicates
		while(tracker != null)
		{
			tracker = tracker.next;
			values[tracker.data]++;
		}
		
		//second run through remove duplicates
		while(tracker != null)
		{
			
			if(values[tracker.data] > 0)
			{
				values[tracker.data] = 0;
				Node temp = tracker.next;
				tracker.next = temp.next;
				
			}
			tracker = tracker.next;
		}
		
	}

}
