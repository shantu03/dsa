public class single_element_in_sorted_array {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,8,8};
        // int arr[]={2,2,3,3,5,5,6,6,7,7,9};
        System.out.println(new Solution().singleNonDuplicate(arr));
    }
}
class Solution {
    public int singleNonDuplicate(int[] nums) {

        int st=0;
        int en=nums.length-1;
        int n=(nums.length+1)/2;
        int mid=0;

        while(st<=en){
            mid=st+(en-st)/2;

            if(nums[mid]==nums[mid+1])
            {
                if(n%2==0)
                {
                    en=mid-1;
                }else{
                    st=mid+1;
                }
            }
            else if(nums[mid]==nums[mid-1])
            {
                if(n%2==0){
                    st=mid+1;
                }else{
                    en=mid-1;
                }
            }else return nums[mid];
        }
        return nums[mid];
       
}
}
