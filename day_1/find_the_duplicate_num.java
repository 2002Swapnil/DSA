class Solution {
    public int findDuplicate(int[] nums) {
        int ans =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
             hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
       for(int num: hm.keySet()){
           if(hm.get(num)>1){
               ans = num;
           }
       }
        return ans;
       
    }
}