class Solution {
    public int minOperations(int n) {
     int cnt=0;
     List<Integer> l=new ArrayList<>();
    for(int i=0;(1<<i)<=(2*n);i++){
            l.add(1<<i);
    }
     while(n>0){
        int near=l.get(0);
        for(int p : l){
            if(Math.abs(n-p)<Math.abs(n-near)){
                near=p;
            }
        }
        n=Math.abs(n-near);
        cnt++;
    }
     return cnt;
    }
}