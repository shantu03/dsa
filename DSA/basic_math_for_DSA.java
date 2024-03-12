import java.util.Scanner;

public class basic_math_for_DSA{
    public static void main(String args[]){
     // reverseanumber obj=new reverseanumber();
     new allpossibledivisor();
    }

    }


class reverseanumber
    {
        reverseanumber()
        {
                 System.out.println("Enter a number : ");
        int num=new Scanner(System.in).nextInt();
        int k=num;
        int revnum=0;
        int ARMSTRONG=0;
        while(num!=0)
        {            revnum*=10;
            //System.out.println(num);
            int p=num%10;
            revnum+=p;
            ARMSTRONG+=Math.pow(p,3);
            num/=10;
        }
        System.out.println("REVERSE : "+ revnum);
        if(revnum==k)
        {
            System.out.println("Palindorme : yes ");
        }else{
            System.out.println("Palindorome : no ");
        }

        System.out.print("IS IT ARMSTRONG NUM : ? -> ");
        if(k==ARMSTRONG)
            System.out.println("YES ");
        else
            System.out.println("NO ");
        }
   
}
class allpossibledivisor{
    allpossibledivisor()
    {
        System.out.println("ENter number to see all possible divisor : ");
        int num=new Scanner(System.in).nextInt();

        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
                System.out.printf("%d \t",i);
                    if(num/(int)i!=i)
                        System.out.printf("%d \t",num/i);
            
        }
    }
}