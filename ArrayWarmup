 /*
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 * array123([1, 1, 2, 3, 1]) → true
 * array123([1, 1, 2, 4, 1]) → false
 * array123([1, 1, 2, 1, 2, 3]) → true
 *
 * Problem checked by: http://codingbat.com/prob/p136041
 */

public boolean array123(int[] nums) {
        for(int i=0; i<nums.length; i++){
                //if the current element is 1 and there are 2 more spaces following
                if((nums[i] == 1) && ((nums.length-(i+1)) >= 2)){
                        //check that the next two elements are 2 and 3
                        if((nums[i+1] ==2) && (nums[i+2] ==3)) {
                                return true;
                        }
                        continue;
                }
        }
        return false;
}
