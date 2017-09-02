/**
 *    BinaryOnes class used to count the number of one's in a binary
 *    representation on a number.
 *    @author 1826702
 *    @version 1.0
 */
public class BinaryOnes {
    private BinaryOnes() {} // No instances
    /**
     *    Method to find the count of the 1's in the binary representation
     *    of a number.
     */
    public static int numberOfOnes(long number) {
        long count; // variable to save the count of 1's

        if(number==0) // base case if N = 0 returns 0 1's
        {
            count = 0;
        }
        else // recursive solution to count the number of 1's in a binary
        // representation of a number
        {           //recursive call to numberOfOnes
            count = numberOfOnes(number/2)+(number%2);
        }
        return (int) count;
    } // numberOfOnes method
} // BinaryOnes