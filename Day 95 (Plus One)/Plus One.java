class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i = digits.length - 1; i >= 0; i--){
            int temp = digits[i] + carry;
            carry = temp / 10;
            stack.push(temp % 10);
        }
        if(carry > 0){
            stack.push(carry);
        }
        int[] list = new int[stack.size()];
        int i = 0;
        while(!stack.isEmpty()){
            list[i++] = stack.pop();
        }
        return list;
    }
}
