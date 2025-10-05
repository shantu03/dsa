import java.util.List;
import java.util.ArrayList;
public class combination_sum1{
    
    public static void main(String[] args) {
        
        int arr[]={2,5,8,4};
        int target=10;
        new Solution().show(arr, target);
    }
}
class Solution{
    void B(int arr[],int n,int t,List<Integer> list, List<List<Integer>> set)
    {
        
        if(t==0 ) 
        {
            list.sort(null);
            if(!set.contains(list))
            set.add(new ArrayList<>(list));
            return;
        }
        if(n>arr.length-1 || t<0) return;
        
            list.add(arr[n]);   
            B(arr,n, t-arr[n], list,set);
            // B(arr,n-1,t-arr[n],list,set);    
        
            
            list.remove(list.size()-1);
            
            B(arr,n+1,t,list,set);

        }
    
    void show(int arr[],int t){
                List<List<Integer>> set=new ArrayList<>();

        List<Integer> l=new ArrayList<>();
        B(arr,0,t,l,set);
        for(List<Integer> list:set)
            System.out.println(list);

        System.out.println(set.size());
    }
}