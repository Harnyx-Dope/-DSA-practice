package Practice;

import java.util.Scanner;

public class Company
{
    int products[];
    Company()
    {
        products=new int[3];
        Scanner sc=new Scanner(System.in);
        products[0]=sc.nextInt();
        products[1]=sc.nextInt();
        products[2]=sc.nextInt();
    }

    public static void main(String[] args)
    {
        Company salesman[]=new Company[5];
        for (int i = 0; i < 5; i++)
        {
            salesman[i]=new Company();
        }


        for (int j = 0; j < 5; j++)
        {
            int[] arr=new int[3];
            int f=0;
            for(int i = 0;i< 3;i++)
            {
                arr[f++] = salesman[j].products[i];
            }
            int a=add(arr);
            System.out.println("The sales of the"+j+"Salesman is"+a);
        }
        for (int i = 0; i <3; i++)
        {
            int[] arr1=new int[5];
            for (int j = 0; j < 5; j++)
            {
                arr1[j]=salesman[j].products[i];
            }

            int re=addall(arr1);
            System.out.println("The total sales of the "+i+"item is " +re);

        }


        }






    static int add(int arr[])
    {
        int sum=0;
        for (int i = 0; i < 3; i++) {
            sum=sum
                    +arr[i];

        }
        return sum;

    }
    static int addall(int[] arr)
    {
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum=sum
                    +arr[i];

        }
        return sum;
    }

}
