import java.util.Scanner;
class Data
{
public static void main(String arg[])
{
Scanner sr=new Scanner(System.in);
System.out.println("Enter your name");
String name=sr.nextLine();

System.out.println("My name is :"+name);
sr.close();
}
}
