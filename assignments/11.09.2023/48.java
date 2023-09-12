class Solution {
    public static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverse(int[][] arr,int n){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[n][i];
            arr[n][i] = arr[n][j];
            arr[n][j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            reverse(matrix,i);
        }
    }
}