//Rotate Array
public class P189 {
    public void rotate(int[] nums, int k) {
        if(k == 0) return;
        if(nums.length == 1) return;
        if(nums.length < k) k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    
    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}