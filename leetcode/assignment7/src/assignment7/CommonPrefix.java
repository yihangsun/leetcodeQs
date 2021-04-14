package assignment7;

public class CommonPrefix {
	
	public static void main(String[] args) {
		String[] strs = {"ab", "a"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
	   if (strs == null || strs.length == 0) return "";
	   String ans = strs[0];
	   for (int i = 0; i < strs[0].length() ; i++){
	       char cur = ans.charAt(i);
	       for (int j = 1; j < strs.length; j ++) {
	           if (i == strs[j].length() || strs[j].charAt(i) != cur)
	        	   return ans.substring(0, i);             
	       }
	   }
	   return ans;
	}
}
