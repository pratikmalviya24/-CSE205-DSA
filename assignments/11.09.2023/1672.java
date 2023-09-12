class Solution {
    public int maximumWealth(int[][] arr) {
        int max = 0 ;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}