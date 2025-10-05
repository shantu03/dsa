
import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> set=new ArrayList<>();
        // Arrays.sort(candidates);
        B(candidates,target,0,new ArrayList<>(),set);
     
        return set;
    }
    void B(int [] arr,int tar,int idx,List<Integer> list, List<List<Integer>> set)
    {


       if(tar==0) {
            list.sort(null);
            if(!set.contains(list))
                set.add(new ArrayList<>(list));

            return;
        }
         if(tar<0 ||idx>=arr.length)
        return;

        list.add(arr[idx]);
        B(arr,tar-arr[idx],idx+1,list,set);

        list.remove(list.size()-1);

        B(arr,tar,idx+1,list,set);

    }
}
public class combination_sum2{
    public static void main(String[] args) {
        int arr[]={2,5,2,1,2};

        var k=new Solution().combinationSum2(arr, 8);

        for (List<Integer> list : k) {
            System.out.println(list);
        }
    }
}