class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        int rows = arr.length;
        int cols = arr[0].length;
        int max_r = rows-1;
        int min_r = 0;
        int max_c = cols-1;
        int min_c = 0;
        int count =0;
        int total = rows*cols;


        while(count<total){
            for(int i=min_c;count<total && i<=max_c;i++){
                ans.add(arr[min_r][i]);
                count++;
            }
            min_r++;

            for(int i=min_r;count<total && i<=max_r;i++){
                ans.add(arr[i][max_c]);
                count++;
            }
            max_c--;

            for(int i=max_c;count<total && i>=min_c;i--){
                ans.add(arr[max_r][i]);
                count++;
            }
            max_r--;

            for(int i=max_r;count<total && i>=min_r;i--){
                ans.add(arr[i][min_c]);
                count++;
            }
            min_c++;

        }

        return ans;
    }
}