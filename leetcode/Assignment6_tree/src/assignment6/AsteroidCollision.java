package assignment6;

import java.util.Stack;

public class AsteroidCollision {
	 public int[] asteroidCollision(int[] asteroids) {
	        if (asteroids == null || asteroids.length < 2) return asteroids;
	        Stack<Integer> stack = new Stack<>();
	        for (int ast: asteroids) {
	            coll : {
	                while (!stack.isEmpty() && ast < 0 && 0 < stack.peek()) {
	                    if (stack.peek() < -ast) {
	                        stack.pop();
	                        continue;
	                    } else if (stack.peek() == -ast) {
	                        stack.pop();
	                    }
	                    break coll;
	                }
	                stack.push(ast);
	            }
	        }
	        int[] ans = new int[stack.size()];
	        int i = 0;
	        for (int num : stack) {
	            ans[i++] = num;
	        } 
	        return ans;
	    }
}
