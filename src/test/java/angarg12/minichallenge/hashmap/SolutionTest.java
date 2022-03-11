package angarg12.minichallenge.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void correctSolution() {
        Solution s = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals (s.twoSum(nums, target), new int[]{0, 1});

        nums = new int[]{3, 2, 4};
        target = 6;
        assertArrayEquals (s.twoSum(nums, target), new int[]{1, 2});

        nums = new int[]{3, 3};
        target = 6;
        assertArrayEquals (s.twoSum(nums, target), new int[]{0, 1});
    }

    @Test
    public void largeInput() {
        Solution s = new Solution();
        int[] nums = new int[200000];
        int target = 199999;
        for(int i = 0; i < nums.length; i++){
            nums[i] = i+1;
        }

        assertArrayEquals (s.twoSum(nums, target), new int[]{99998, 99999});
    }

//    @Test
//    public void correctSolutionFast() {
//        Solution s = new Solution();
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        assertArrayEquals (s.twoSumFast(nums, target), new int[]{0, 1});
//
//        nums = new int[]{3, 2, 4};
//        target = 6;
//        assertArrayEquals (s.twoSumFast(nums, target), new int[]{1, 2});
//
//        nums = new int[]{3, 3};
//        target = 6;
//        assertArrayEquals (s.twoSumFast(nums, target), new int[]{0, 1});
//    }
//
//    @Test
//    public void largeInputFast() {
//        Solution s = new Solution();
//        int[] nums = new int[200000];
//        int target = 199999;
//        for(int i = 0; i < nums.length; i++){
//            nums[i] = i+1;
//        }
//
//        assertArrayEquals (s.twoSumFast(nums, target), new int[]{99998, 99999});
//    }
}
