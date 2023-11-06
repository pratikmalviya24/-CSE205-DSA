class Solution {
    public int largestInteger(int num) {
        String str = num+"";
        PriorityQueue<Integer> odd = new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer> even = new PriorityQueue<>((a,b)->b-a);
        while(num>0){
            int rem = num%10;
            if(rem%2==0){
                even.add(rem);
            }
            else{
                odd.add(rem);
            }
            num/=10;
        }
        int ans = 0;
        for (char ch : str.toCharArray()) {
            int n = ch-'0';
            if(n%2==0){
                ans = ans*10+even.remove();
            }
            else{
                ans = ans*10+odd.remove();
            }
        }
        return ans;
    }
}