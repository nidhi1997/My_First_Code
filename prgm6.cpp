#include<iostream.h>
int main()
{ 
   int n, a=1;
   cout<<"Enter the number of rows\n";
   cin>>n;
   for(int i=1; i<=n; i++)
   {
   	for(int j=1; j<=2*(n-i); j++)
   	{ 
	   cout<<" ";
   	}
   	for(int k=1; k<=(2*i)-1; k++)
   	{
   		if(k<=i)
   		{
   			cout<<a;
   			a++;
   		}
   		else
   		{
   			int b=a-2;
   			cout<<b;
   		}
   	}
   	cout<<endl;
   }return 0;
}

