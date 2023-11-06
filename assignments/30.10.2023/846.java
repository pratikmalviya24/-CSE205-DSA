class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for (int i : hand) {
            tm.put(i, tm.getOrDefault(i,0)+1);
        }
        while(!tm.isEmpty()){
            int element = tm.firstKey();
            for(int i=0;i<groupSize;i++){
                if(!tm.containsKey(element+i)){
                    return false;
                }
                tm.put(element+i,tm.get(element+i)-1);
                if(tm.get(element+i)==0){
                tm.remove(element+i);
                }
            }
        }
        return true;
    }
}