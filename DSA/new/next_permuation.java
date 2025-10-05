import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class next_permuation {
    public static void main(String[] args) {
        int[] nums={3,1,5,2};
        // int [] nums={1,1,5};
        // int [] nums ={1,3,2,1};
        // int[] nums={1,2,3};
        
        kk(nums);
        for (int ii : nums) {
            System.out.printf("%d ",ii); 
        }

    }
    public static void kk(int nums[]) {
        
        int idx=-1;
       for (int i = nums.length-1; i >0; i--) {
        if(nums[i-1]<nums[i])
        {
            idx=i-1;
            break;
        }
       }
       if(idx==-1)
       {
        reverse(nums, 0);
        return;
       }
       for (int i = nums.length-1; i > idx; i--) {
        if(nums[idx]<nums[i])
        {
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            break;  
        }
       }
       reverse(nums, idx+1);
       
    
    }
    static void reverse(int nums[],int idx){
        
       int i=idx;
       int j=nums.length-1;
while (i<j) {
        int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
       }  
    }
}