class Solution {
    public int minimumSum(int num) {
        if(num==1000) return 1;
        int arr[] = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = num%10;
            num/=10;
        }
        int sum = 0;
        int i =0 ;
        int j = 3;
        // Arrays.sort(arr);
        insertionSort(arr);
        while(i<j){
            sum+=(arr[i]*10+arr[j]);
            i++;
            j--;
        }
        return sum;
    }
    void insertionSort(int []arr){
        for(int i=1;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}