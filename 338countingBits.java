public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        for(int i=1;i<=num;i++){
            result[i] = result[i>>1] + (i&1);
            //1ms faster than next line
            // result[i] = result[i/2] + i%2;
        }
        return result;
    }
}