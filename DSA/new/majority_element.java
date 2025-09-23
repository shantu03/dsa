import java.util.Arrays;
public class majority_element{
public static void main(String a[])
{

int nums[]={2,4,5,1,2,2,2};

Arrays.sort(nums);

int fre=1;
int ele=nums[0];

for(int i=1;i<nums.length;i++)
{
if(ele==nums[i])
	{fre++;}
else
{
fre=1;
ele=nums[i];

}

if(fre>nums.length/2)
	break;
}

System.out.println(ele);

}
}