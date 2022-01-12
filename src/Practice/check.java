 package Practice;

 import java.util.Arrays;
 import java.util.Scanner;

 public class check
{
    private int rollno;
    private int marks;
    private String name;

    void setrollno(int rollno)
    {
        this.rollno=rollno;

    }
    void setMarks(int marks)
    {
        this.marks=marks;
    }
    void setName(String name)
    {
        this.name=name;
    }
    int getMarks()
    {
        return marks;
    }
    int getRollno()
    {
        return rollno;
    }
    String getName()
    {
        return name;
    }

    public static void main(String[] args)
    {
        int[] marks = new int[5];
        check[] arr = new check[5];


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            arr[i]=new check();

            arr[i].setMarks(sc.nextInt());
            arr[i].setrollno(sc.nextInt());
            sc.nextLine();
            arr[i].setName(sc.nextLine());
        }
        int i = 0;
        for (int f = 0; f < 5; f++) {
            marks[f] = arr[f].marks;
        }
        int marks1[] = new int[5];
        for (int j = 0; j < 5; j++) {
            marks1[j] = marks[j];

        }

        int max = maxmarks(marks1);
         for(int k=0;k<5;k++) {
             if (max == marks[k]) {
                 System.out.println(arr[k].name);
                 System.out.println(arr[k].rollno);
                 System.out.println(arr[k].marks);

             }
         }
    }
    static int maxmarks(int[] marks123)
    {
        Arrays.sort(marks123);
        return marks123[4];
    }
}