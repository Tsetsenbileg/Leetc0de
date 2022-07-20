package Data_Structure;

public class MaximumSubarray {

    public static void main(String[] args) {

        int[] a = {-2,1,-3,4,-1,2,1,-5,4};

        MaximumSubarray b = new MaximumSubarray();

        System.out.println(b.maxSubArray(a));
    }

    public int maxSubArray(int[] nums) {

        int max_sum = Integer.MIN_VALUE ;
        int temp_sum = 0;

        for(int n = 0 ; n< nums.length; n++){

            temp_sum += nums[n];
            if(max_sum < temp_sum) {
                max_sum = temp_sum;
            }
            if(temp_sum < 0){
                temp_sum = 0;
            }
        }
        return max_sum;

    }
}
