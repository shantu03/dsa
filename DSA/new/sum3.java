import java.util.Set;
import java.util.List;
import java.util.Random;
import java.util.HashSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class sum3 {
    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();

        int nums[]={2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10};
        List<Integer> set=new ArrayList<>();

        for (int i : nums) {
            if(!set.contains(i));
            set.add(i);
            
        }
        for(int i=0;i<nums.length-2;i++)
        {
            if
            for(int j=i+1;j<nums.length-1;j++)
            {
                int tag=-nums[i]-nums[j];
               if(set.contains(tag)&&set.indexOf(tag)!=i&&set.indexOf(tag)!=j)
               {
                List<Integer> temp=new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add((-nums[i]-nums[j]));
                temp.sort(null);
                j++;
                k--;

                if(!list.contains(temp))
                list.add(temp);
               }
            }
        }
        System.out.println(list);
       
    }
}
