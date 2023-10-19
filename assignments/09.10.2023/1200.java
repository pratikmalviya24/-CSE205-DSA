class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
           int difference = arr[i]-arr[i-1];
           if(difference<min){
               min = difference;
               list = new ArrayList<>();
               list.add(Arrays.asList(arr[i-1],arr[i]));
           }
           else if(difference==min){
               list.add(Arrays.asList(arr[i-1],arr[i]));
           }
        }
        return list;
    }
}