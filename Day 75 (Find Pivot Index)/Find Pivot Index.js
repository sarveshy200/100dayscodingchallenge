class Solution {
    public int pivotIndex(int[] nums) {
        int a=nums.length;
        int leftSum=0;
        int rightSum=0;
        int pivotSum=0;

        for(int i=0;i<a;i++){
            pivotSum +=nums[i];
        }
        rightSum=pivotSum;
        for(int i=0;i<a;i++){
            leftSum +=nums[i];
            if(rightSum==leftSum) return i;
            rightSum -=nums[i];
        }
        return -1;
    }
}
