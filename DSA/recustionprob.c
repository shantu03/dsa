#include<stdio.h>
#include<conio.h>
void fun1(int,int);
void fun2(int a,int b);
int fun3(int ,int );
int sum(int );
void sum2(int ,int );

void main(){

    printf("ENTER NUM : ");
    int num;
    scanf("%d",&num);
    // fun1(1,num);      //linearly printing num using recursion 
    // printf("\n Reverse : \n");
    // fun2(1,num);     //reverse order of number using recusion 

    printf("");
    fun3(0,num);    // printing numbers using backtracking 
    

//    printf("\nsum -> %d ",  sum(num));    //my approach
    sum2(0,num);    //takeuforward approach 

    

    getch();


}

void sum2(int sum,int num)
{
    if(num<=0)
    {
        printf("sum == %d\n",sum);
        return;
    }
    sum2(sum+num,num-1);



}



int sum(int num){
    if(num<=1)
    {
         
        return num;
    }
    
int total=num+sum(num-1);
return total;


}


int fun3(int a,int b)
{
if(a>=b)
{
    return a;
}
printf("%d\t",fun3(a+1,b));
return a;
}

void fun1(int a,int b)
{
    if(a<=b)
    {
        printf("%d\t",a++);
        fun1(a,b);
    }
    return;
}


void fun2(int k,int j)
{
    if(k<=j)
    {
        printf("%d\t",j--);
        fun2(k,j);
    }
    return ;

}