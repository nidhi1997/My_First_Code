import java.util.Scanner;
class LinearSearch
{ int array[];
  
  void Accept(int arr[])
  {int n=arr.length;
   array=new int [n];
   for(int i=0; i<arr.length;i++)
   {array[i]=arr[i];}
  }


  void Search(int elem)
 { int flag=1;
   for(int i=0; i<array.length;i++)
  { if(array[i]==elem)
   {System.out.println("Element found at "+(i+1));
    flag=0;
    break;
   }
  }
   if(flag==1)
  {System.out.println("Element not found");}
 }

  void Display()
 {for(int i=0; i<array.length;i++)
  {System.out.print(array[i]+"  ");}
 }
}

class TestSearch
{ public static void main(String args[])
 { int array[];
   System.out.println("Enter the number of elements in the array");
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   array= new int [n];
   LinearSearch l=new LinearSearch();
   System.out.println("Enter the elements of the array");
   for(int i=0; i<n; i++)
   { int a=s.nextInt();
     array[i]=a;
   }
   System.out.println("Enter the element to be found");
   int elem=s.nextInt();
   l.Accept(array);
   l.Search(elem);
   l.Display();
  }
}
