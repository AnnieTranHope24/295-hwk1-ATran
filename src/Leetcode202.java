
public class Leetcode202 {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
		System.out.println("19 is expected to be happy");
		
		System.out.println(isHappy(2));
		System.out.println("2 is expected to be unhappy");
	}
	/*
	 * Write an algorithm to determine if a number n is happy.

		A happy number is a number defined by the following process:
		
		Starting with any positive integer, replace the number by the sum of the squares of its digits.
		Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
		Those numbers for which this process ends in 1 are happy.
		Return true if n is a happy number, and false if not.
	 */
    public static boolean isHappy(int n) {
        int result = 10;
        String stringInt = Integer.toString(n);
        while(result>9){
            result = 0;
            char[] charArr = stringInt.toCharArray();
            for(char c : charArr){
                int numval = Character.getNumericValue(c);
                result += numval*numval ;
            }
            stringInt =  Integer.toString(result);
        }

        if(result == 1|| result == 7){
            return true;
        }
        return false;        
    }

}
