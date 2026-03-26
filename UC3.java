package HELLOAPP;
import java.util.*;
public class UC3 {
    public static void main(String[]args)
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter name:");
        String b=a.nextLine();
        if(b.isEmpty()) {
            System.out.println("Hello World");
        }
        else {
            System.out.println("Hello"+" "+b);
        }
    }
}
