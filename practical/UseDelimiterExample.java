import java.util.Scanner;

public class UseDelimiterExample{
    public static void main(String args[]){

    /*Scanner sc=new Scanner("Ramesh is a good boy");
    sc.useDelimiter("a");
    while(sc.hasNext())
    {
        System.out.println(sc.next());
    }
 
     /*Scanner s=new Scanner("Ramesh/is a good boy");
    s.useDelimiter("/");
    while(s.hasNext())
    {
        System.out.println(s.next());
    }*/
    Scanner s=new Scanner("Ramesh is a good boy");
    s.useDelimiter("\\s");
    while(s.hasNext())
    {
        System.out.println(s.next());
    }
}
}