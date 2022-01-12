package Enumerations;

public class Enum
{


    public static void main(String[] args)
     {
        Colour ss=Colour.BLUE;
        System.out.println("Names ="+ss.name());
        System.out.println("Enum ="+ss.getValue());
        for (Colour c:Colour.values())
        {
            System.out.println(c);

        }


    }


}
enum Colour
{
    RED("red VALUE GIVEN"),GREEN("greeN COLOUR"),BLUE("bLUE COLOUR GIVEN");
    private String ss;



    Colour(String s)
    {
        this.ss=s;

    }
    public String getValue()
    {
        return ss;
    }
}
