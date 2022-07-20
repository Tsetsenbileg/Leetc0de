package Data_Structure;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] a = {1,2,3,1};
        int[] b= {1,2,3,4};

        ContainsDuplicate c = new ContainsDuplicate();

        boolean result = c.containsDuplicate(a);
        System.out.println(result);
    }

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int n:nums){

           if(set.contains(n)){
               return true;
           }
           set.add(n);
        }
        return false;
    }
}
