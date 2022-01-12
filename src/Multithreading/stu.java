package Multithreading;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

public class stu
{

    private int rollno,marks;
    private String name;

      void name(String name)
     {
         this.name=name;
     }
    void rollno(int rollno)
    {
        this.rollno=rollno;
    }
    void  marks(int marks)
    {
        this.marks=marks;
    }
    int getRollno()
    {
        return rollno;
    }
    int getmarks()
    {
        return marks;

    }
    String getname()
    {
        return name;
    }





    public static void main(String[] args) throws ClassNotFoundException, SQLException,NullPointerException
    {

        int c=0;
        Class.forName("com.mysql.cj.jdbc.Driver");


        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/Etest","root","");
        Statement s=con.createStatement() ;
        PreparedStatement res = con.prepareStatement("insert into student values(?,?,?)");

        ArrayList <stu> r=new ArrayList<>(5);

        Scanner sc=new Scanner(System.in);

        try {
            for (int i = 0; i < 5; i++)
            {
                int marks,rollno;
                String name;


                System.out.println("Enter the Name of the student");

                name=sc.nextLine();
                System.out.println("Enter the roll no. of the student");
                rollno=sc.nextInt();
                System.out.println("Enter the marks of the Multithreading.stu");
                marks=sc.nextInt();
                sc.nextLine();



                if(marks>35)
                {

                    stu obj=new stu();
                    obj.name(name);
                    obj.rollno(rollno);
                    obj.marks(marks);
                      r.add(obj);




                }
                else
                    throw new Exception("Not pass");
                c=c+1;



            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        for(stu j:r)
        {

            res.setInt(1,j.getRollno());
            res.setString(2,j.getname());
            res.setInt(3,j.getmarks());
            res.executeUpdate();


        }

    }

}
