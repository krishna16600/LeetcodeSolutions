public class LP34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        if (nums == null || nums.length == 0) return ans;
        int low = 0;
        int high = nums.length-1;
        int index = -1;

        while(low <= high){
            int mid = low+(high-low)/2;

            if(nums[mid]==target){
                index = mid;
                break;
            }
            else if(nums[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }

        if(index==-1)
            return ans;

        int first = index;
        int last = index;

        while(first >= 0 && nums[first]==target)
            first--;

        while(last<nums.length && nums[last]==target)
            last++;

        ans[0] = first+1;
        ans[1] = last-1;

        return ans;
    }
}
