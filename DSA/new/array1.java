//GIVEN AN ARR AND 'K' -> CALCULATE THE MAXIMUM SIM OF A SUBARRAY HAVING SIZE EXTACTLY 'K'


import java.util.Scanner;

public class array1{
public static void main(String arg[])
{

System.out.println("array size? ");
int arr[]=new int[new Scanner(System.in).nextInt()];

for(int i=0;i<arr.length;i++)
{
arr[i]=new Scanner(System.in).nextInt();
}


System.out.println("k size? ");
int k=new Scanner(System.in).nextInt();
int max_sum=0;

for(int i=0;i<=arr.length-k;i++)
{

int sum=0;
for(int j=i;j<i+k;j++)
sum+=arr[j];

if(max_sum<sum)
	max_sum=sum;

}

System.out.println(max_sum);
}
}