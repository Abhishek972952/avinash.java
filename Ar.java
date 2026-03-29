import java.util.Scanner.* ;

public class Ar{
    public static void main(String args[])
     {
    //     int arr[]={1,2,3,4,5,4,3,2,1};
    //     int target=5;
    //     int keyarr[]=new int[100];
    //     int index=0;


    // for(int i=0; i<arr.length; ++i)
    // {
    //     for(int j=i+1; j<arr.length; ++j)
    //     {
    //         if(arr[i]+arr[j]==target)
    //         {

    //             int num1=arr[i];
    //             int num2=arr[j];

    //             if(num1>num2){
    //                 int temp=num1;
    //                 num1=num2;
    //                 num2=temp;
    //             }

    //             int keypair=num1*10+num2;
    //             boolean dup=false;
    //             for(int k=0;k<index;++k)
    //             {
    //                 if(keypair==keyarr[k])
    //                 {
    //                     dup=true;
    //                     break;
    //                 }
    //             }

    //         if(!dup)
    //         {
    //             System.out.println(num1+" "+num2);
    //             keyarr[index++]=keypair;
    //         }    
    //         }
    //     }
    

// int arr[]={1,6,2};
// int index=0;

// for(int i=0;i<arr.lenght;++i){
//     if(arr[i]!=0){
//         arr[index++]=arr[i];
//     }
// }
// for(int i=index;i<arr.lenght;++i)  arr[i]=0;
// for(int i=0;i<arr.lenght;++i) System.out.println(arr[i]);

//  }
// public static int getlargest(int arr[]){
//     int arr[]={1,2,3,6,5};
// int largest=Integer.MIN_VALUE;
// for(int i=0; i<arr.length;++i){
//     if(largest<arr[i]){
//         largest=arr[i];
//     }
// }

// System.out.println("largest value"+ getlargest(arr[i]));

// }

// int marks[]=new int[3];
// marks[0]=34;
// marks[1]=90;
// marks[2]=45;

// System.out.println(marks[0]);
// System.out.println(marks[1]);
// System.out.println(marks[2]);

// for(int i=0;i<=3;i++){
//     System.out.println(marks[i]);
// }
// Scanner sc=new Scanner(System.in);
// int number[]=new int[size];
// int size=sc.nextInt();

// for(int i=0;i<size;i++){
//     number[i]=sc.nextInt();
//     }

//     int x=sc.nextInt();


//reverse in array-

// int arr[]={6,4,7,2,6,3,4};
// int temp;
// int i=0;
// int j=arr.length-1;

// while(i<j)
// {
//     temp=arr[i];
//     arr[i]=arr[j];
//      i++;
//     arr[j]=temp;
//     j--;
// }
// for(int m=0;m<arr.length;m++)
// {
//     System.out.println(arr[m]);
// }

//-----------String---------------    

// String  firstName="abhi";
// String lastName="mishra";

// String  fullName=firstName +" "+ lastName;

// System.out.println(fullName.length());

// for(int i=0;i<fullName.length();i++){
//     System.out.println(fullName.charAt(i));
// }

// String a="mishra";
// String b="abhi";

// String c=a+" "+b;

// System.out.println(c.length());

// for(int i=0;i<c.length(); i++){
//     System.out.println(c.charAt(i));
// }

//compare  string--

// String  name1="hello";
// String name2="hello";

// if(name1.compareTo(name2)==0)
// {
//     System.out.println("string are equal");
// }

// else{
//      System.out.println("string are not equal");
// }

// String  name1="hello";
// String name2="hello";

// if(name1==name2)
// {
//     System.out.println("string are equal");
// }
// else{
//     System.out.println("string are not equal");
// }


// int factorial=7;
// for(int i=1;i<7;i++)
// {
//     factorial=factorial*i;
//     System.out.println(factorial);
// }

// int arr[]={1,2,3,4,5};
// int i=0;
// int temp;
// int j=arr.length-1;

// while(i<j)
// {
//     temp=arr[i];
//     arr[i]=arr[j];
//     i++;
//     arr[j]=temp;
//     j--;
// }

// for(int k=0;k<arr.length;k++)
// {
//     System.out.println(arr[k]);
// }

// int arr[]={1,2,3,4,5};
// int i=0;
// int rev;
// int j=arr.length-1;

// while(i<j)
// {
//     rev=arr[i];
//     arr[i]=arr[j];
//     i++;
//     arr[j]=rev;
//     j--;
// }

// for(int k=0;k<arr.length;k++)
// {
//     System.out.println(arr[k]);
// }

// int p=8;
// int q=6;
// int r=5;

// for( r=5;r<=8;r++)
// {
//     if(4<q)
//     {
//         p=3+r;
//         q=q+q;
//     }

//     System.out.println(p+q);
//}

// int p=6;
// int q=4;
// int r=6;

// for( r=3;r<=7;r++)
// {
//     if((p+q+r)>(r+q))
//     {
//         continue;
//     }
    
// }
// System.out.println(p+q);

 // number of terms
        // int a = 0, b = 1;

        // int c;

        // for (int i = 1; i <= 7; i++) {
        //     System.out.print(a + " ");

        //      c = a + b;
        //     a = b;
        //     b = c;
        // }
       
//   int num=153;
// int sum=0;
// int a=num;

// while(a>0)
// {
    
//     int digit=a%10;
//     sum=sum+(digit*digit*digit);
//     a=a/10;
// }
// if(sum==num)
// {
//     System.out.println("armstong number");

// }
// else{
//     System.out.println("armstong not number");
// }

int arr[]={1,3,8,9,4};
int largest=arr[0];

for(int i=0;i<arr.length;++i)
{
    if(arr[i]>largest)
    {

        largest=arr[i];
    }
}
System.out.println("largest value is" +largest);

String str="noon";
int n=str.length();

for(int i=0;i<n/2;++i)
{
    if(str.charAt(i)!=str.charAt(n-1-i))
    {
        System.out.println(" not pallindrom");
    }

    else{
       System.out.println(" pallindrom"); 
    }
}

  

}
}
