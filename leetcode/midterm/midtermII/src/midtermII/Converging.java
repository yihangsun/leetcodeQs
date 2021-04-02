package midtermII;

import java.util.HashSet;
import java.util.Set;

public class Converging {
	public static void main(String[] args) {
		ListNode n1 = null;
		ListNode n2 = new ListNode(2);
		System.out.println("Test1: Answer = false, Output: " + areConverging(n1, n2));
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(3);
		System.out.println("Test2: Answer = false, Output: " + areConverging(n3, n4));
		System.out.println("Test3: Answer = true, Output: " + areConverging(n3, n2));
		ListNode n5 = new ListNode(5, n3);
		System.out.println("Test4: Answer = true, Output: " + areConverging(n5, n2));
	}
	
// Time Complexity: O(n1 + n2 + n1) = O(N)
// Space Complecity = O(n1) = O(N)
	public static boolean areConverging(ListNode n1, ListNode n2) {
		if (n1 == null && n2 == null) return true;
		if (n1 == null || n2 == null) return false;
		Set<Integer> set = new HashSet<Integer>();
		ListNode temp = n1;
		while (temp != null) {
			set.add(temp.val);
			temp = temp.next;
		}
		temp = n2;
		while (temp != null) {
			if (set.contains(temp.val)) return true;
			temp = temp.next;
		}
		return false;
	}
}
