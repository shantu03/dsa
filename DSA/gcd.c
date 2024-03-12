#include<stdio.h>


void GCD(int ,int );
void HCF(int ,int );
int main()
{
    printf("ENTER two numbers for GCD ");

    int num1,num2;
    scanf("%d %d",&num1,&num2);
     GCD(num1,num2);
    if(num1<num2)
    {
        int temp=num2;
        num2=num1;
        num1=temp;
    }
    HCF(num1,num2);   
}
void HCF(int num1,int num2)
{
num1=num1%num2;
if(num1==0) {printf("using euclidean Algo -> %d ",num2);
}
else{ HCF(num2,num1);
}

}
void GCD(int num1,int num2){

    int num=0;
    if(num1>num2)
    {
        num=num2;}
    else {
        num=num1;}
    
    for(num;num>=0;num--)
    {

        if(num1%num==0 && num2%num==0)
        {
          //  printf(" testing in if loop %d ",num);
            break;
           } 
        //   printf("LOOP TESTING %d ",num);  
        }
    printf("using logical approach -> %d \n",num);

}
