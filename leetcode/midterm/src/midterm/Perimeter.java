package midterm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Perimeter {
	public static void main(String[] args) {
		TreeNode bt = new TreeNode(1);
		TreeNode bt1 = new TreeNode(2);
		TreeNode bt3 = new TreeNode(3);
		bt.left= bt1;
		bt.right= bt3;
	    printPerimeter(bt);
	}
	
	public static void printPerimeter(TreeNode root) {
		if (root == null) return;
		if (root.left == null && root.right == null) {
			System.out.println(root.val);
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();
		ArrayList<Integer> bottom = new ArrayList<>();
		right.add(root.val);
		q.add(root.left);
		q.add(root.right);
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode cur = q.remove();
				if (i == 0) left.add(cur.val);
				else if (i == size - 1) right.add(cur.val);
				else if (cur.left == null && cur.right == null) bottom.add(cur.val);
				q.add(cur.left);
				q.add(cur.right);
			}
		}
		for (int val : right) {
			System.out.print(val);
		}
		for (int i = bottom.size() - 1; i >= 0; i--) {
			System.out.print(bottom.get(i));
		}
		for (int i = left.size() - 1; i >= 0; i--) {
			System.out.print(left.get(i));
		}
	}
}
