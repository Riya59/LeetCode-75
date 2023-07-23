class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            Integer prevCount = map.get(arr[i]);
            if(prevCount == null){
                prevCount = 0;
            }
            map.put(arr[i], prevCount+1);
        }

        HashSet<Integer>set = new HashSet<>();
        for(int ele : map.values()){
            if(set.contains(ele)){
                return false;
            }
            set.add(ele);
        }

        return true;
    }
}
