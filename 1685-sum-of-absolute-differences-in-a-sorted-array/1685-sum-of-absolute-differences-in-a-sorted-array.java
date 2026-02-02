class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
       // uppturusubbaiah123
        int n = nums.length;
        int[] result = new int[n];
        int[] prefix = new int[n];
        
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            int left = nums[i] * i - (i > 0 ? prefix[i - 1] : 0);
            int right = (prefix[n - 1] - prefix[i]) - nums[i] * (n - i - 1);
            result[i] = left + right;
        }
        
        return result;
    }
}
