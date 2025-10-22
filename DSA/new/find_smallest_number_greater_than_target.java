public class find_smallest_number_greater_than_target {
    public static void main(String[] args) {
        // char[] arr={'c','f','j'};
        char[] arr={'x','x','y','y'};
        System.out.println(new Solution().nextGreatestLetter(arr, 'k'));
    }
}
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int st=0;
        int en=letters.length-1;
        int k=0;
        while(st<=en) {

            int mid=(en-st)/2+st;

        

             if(target>letters[mid]) st=mid+1;

            else en=mid-1;


        }  
            st%=letters.length;
            if(target=='z')
             st=0;
  
            while(letters[st]==target)
            st=(st+1)%letters.length;




        return letters[st%letters.length];

    }
}
