class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();

        for(int ele : nums1){
            set1.add(ele);
        }

        for(int ele : nums2){
            set2.add(ele);
        }

        List<List<Integer>>list = new ArrayList<>();

        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();

        for(int ele : set1){
            if(set2.contains(ele) == false){
                list1.add(ele);
            }
        }

        for(int ele : set2){
            if(set1.contains(ele) == false){
                list2.add(ele);
            }
        }

        list.add(list1);
        list.add(list2);

        return list;
    }
}
