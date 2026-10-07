class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int answer=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                answer+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                int count=map.get(sum)+1;
                map.put(sum,count);

            }
            else{
                map.put(sum,1);
            }
        }
        return answer;
        
        
    }
}
