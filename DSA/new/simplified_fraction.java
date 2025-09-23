import java.util.List;
import java.util.ArrayList;

public class simplified_fraction {
    public static void main(String[] args) {
        System.out.println(new Solution().simplifiedFractions(10));
    }
}
class Solution {
    public List<String> simplifiedFractions(int n) {
        int upper=1;
        int lower=2;
        List<String> str=new ArrayList<>();
        List<Double> fra=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(!fra.contains((double)i/j))
                {
                    fra.add((double)i/j);
                    String s=i+"/"+j;
                    str.add(s);
                }
            }
        }

        return str;
    }
}