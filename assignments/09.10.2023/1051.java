class Solution {
    public int heightChecker(int[] height) {
        int count = 0;
        int[] arr = Arrays.copyOf(height, height.length);
        quickSort(height,0,height.length-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=height[i]){
                count++;
            }
        }
        return count;
    }
    public void quickSort(int[] arr,int s,int e){
        if(s>=e) return;
        int i = s;
        int j = e;
        int pivot =  i+(j-i)/2;
        while(i<=j){
            while(arr[i]<arr[pivot]) i++;
            while(arr[j]>arr[pivot]) j--;
            if(i<=j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        quickSort(arr, s, j);
        quickSort(arr, i, e);
    }
    public void swap(int[] arr,int i,int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}