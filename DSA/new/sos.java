// return minimum number of coin from set which sum are equal to amount 
/*

BELOW IS RECURSIVE SOLUTION -> TOP DOWN APPROACH WITH MEMORIZAITON




public class sos {
    public static void main(String[] args) {
        int arr[]={2};
        int k=new sos().B(arr.length-1,4 , arr);

        if(k==-1) System.err.println("not possible ");
        else System.out.println(k);
    }
    int B(int n,int amount,int arr[])
    {
        // System.out.println(n+" "+amount);
        if(n<0|| amount<0) return -1;

        if(amount==0) return 0;

        if(arr[n]>amount) return B(n-1,amount,arr);
        else{

            return(Math.min(B(n-1,amount,arr), B(n,amount-arr[n],arr)+1));
        }
    }
}
*/


// THIS IS BOTTOM UP APPROACH 

public class sos {

    public static void main(String[] args) {
        int amount=11;
        int coins[]={1,2,5};
        int dp[]=new int[amount+1];

       for (int i = 1; i < dp.length; i++) {
            dp[i]=Integer.MAX_VALUE;
       }
       dp[0]=0;

       for (int i =1 ; i <=amount; i++) {
        for(int coin:coins)
        {
            if(i>=coin){
                dp[i]=Math.min(dp[i],1+dp[i-coin]);

            }
        }
       }
       System.out.println(dp[dp.length-1]);
        
    }
}