package midtermII;

public class Consecutive {
	public static void main(String[] args) {
		int[] nums = new int[] {0,1,0,1,1,0,1,1,1,0,0,0};
		int[] nums2 = new int[] {};
		System.out.println(getMaxConsucutives(nums));
		System.out.println(getMaxConsucutives(nums2));
	}
	
	// Time: O(N)
	// Space: O(1)
	public static int getMaxConsucutives(int[] nums) {
		if (nums.length < 2) return 0;
		int global = 0;
		for (int i = 0; i < nums.length; i++) {
			int cur = nums[i];
			int pointer = i + 1;
			int sum = 1;
			while (pointer < nums.length && nums[pointer++] == cur) sum++;
			global = Math.max(global, sum);
		}
		return global;
	}
}
