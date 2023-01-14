
public class Leetcode191 {

	public static void main(String[] args) {
		System.out.println(hammingWeight(-3));
		System.out.println("Expected to be 31");

	}
	/*
	 * A function that takes an unsigned integer
	 * and returns the number of '1' bits it has (also known as the Hamming weight).
	 */
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        String biString = Integer.toBinaryString(n);
        int count = 0;
        for(char c: biString.toCharArray()){
            if(c == '1'){
                count++;
            }
        }

        return count;        
    }

}
