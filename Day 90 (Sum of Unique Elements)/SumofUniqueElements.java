class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        for(int i:nums){
            boolean unique=uniquecheck(i,nums);
            if(unique)
                sum+=i;
        }
        return sum;
    }
    public boolean uniquecheck(int num,int arr[]){
        int count=0;
        for(int i:arr){
            if(i==num)
               ++count;
            if(count>1)
               return false;
        }
        return true;
    }
}
