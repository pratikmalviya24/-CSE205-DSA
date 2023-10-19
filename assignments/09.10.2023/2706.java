class Solution {
    public int buyChoco(int[] prices, int money) {
        int[] ans = getValue(prices);
        int temp = money-ans[1]-ans[0];
        if(temp>=0) return temp;
        return money;
    }
    int[] getValue(int[] arr){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int item : arr){
            if(item<=first){
                second =  first;
                first = item;
            }
            else if(item<second){
                second = item;
            }
        }
        return new int[]{first,second};
    }
}