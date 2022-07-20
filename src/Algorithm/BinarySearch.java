package Algorithm;

public class BinarySearch {


    public static void main(String[] args) {
        int [] nums = {  -1,0,3,5,9,12 };
        int target = 99;
        BinarySearch bs = new BinarySearch();

        System.out.println(bs.search(nums, target));

    }

    public int search(int[] nums, int target) {

        int mid = (nums.length-1)/2;
        int firstIndex = 0;
        int lastIndex = nums.length-1;
        int index = Integer.MIN_VALUE;

        while(firstIndex <= lastIndex){

            if(target > nums[mid]){
                firstIndex = mid + 1;
            } else if( target == nums[mid] ){
                index = mid;
                break;
            } else {
                lastIndex = mid - 1;
            }
            mid = (firstIndex + lastIndex) / 2;

        }

        if(index != Integer.MIN_VALUE){
            return index;
        } else {
            return -1;
        }
    }

}
