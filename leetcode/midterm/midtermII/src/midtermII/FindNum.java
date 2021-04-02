package midtermII;

public class FindNum {
	public static void main(String[] args) {
		int[] nums = new int[] {2,4,4,4,6,7,7,7,8,9,9,9};
		int[] nums2 = new int[] {2};
		System.out.println(getIndex(nums, 7));
		System.out.println(getIndex(nums2, 7));
		System.out.println(getIndex(nums2, 2));
	}
	
	// Time: O(N)
	// Space: O(1)
	public static int getIndex(int[] nums, int x) {
		if (nums == null || nums.length == 0) return Integer.MIN_VALUE;
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == x) return mid;
			else if (nums[mid] < x) left = mid + 1;
			else right = mid - 1;
		}
		return Integer.MIN_VALUE;
	}
}
