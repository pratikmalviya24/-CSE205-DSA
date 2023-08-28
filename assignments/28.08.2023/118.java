class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int arr[][] = new int[n][];
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
            if(i==0){
                a.add(1);
                ans.add(a);
                a = new ArrayList<>();
                continue;
            }
            a.add(1);
            for(int j=1;j<i;j++){
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                a.add(arr[i][j]);
            }
            a.add(1);
            ans.add(a);
            a = new ArrayList<>();
        }
        return ans;
    }
}