package Data_Structure;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] array = {3,2,4};
        int[] array2 = {2,4,11,3};

        TwoSum t = new TwoSum();

        int[] tem = t.twoSum(array, 6);
        System.out.println(tem[0] + " " + tem[1]);
    }

    public int[] twoSum(int[] nums, int target) {

        int[] a = {1,2};
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for(int i=0; i< nums.length; i++) {
            hashMap.put(i, nums[i]);
        }

        //System.out.println(hashMap);
        for(int i=0; i<nums.length; i++){

            int n = target - nums[i];

            if(hashMap.containsValue(n)){
               // System.out.println( i+ " " + n);
                a[0] = i;
                hashMap.forEach((key, value) -> {
                    if(value == n && key != a[0] ){
                        //System.out.println(key + " " +value + " foreach ");
                        a[1] = key;
                    }
                });

                if(( nums[ a[0]] + nums[a[1]]) == target ){
                    return a;
                }


            }

        }
        return a;
    }
}
