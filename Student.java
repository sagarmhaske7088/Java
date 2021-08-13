import java.util.Scanner;
class Student
{
public static void main(String arg[])
{
int roll no;
char name;
int mob no;
{
Scanner sr=new Scanner(System.in);
System.out.println("Enter your Roll no");
roll no=sr.nextLine();

System.out.println("Enter your name");
name=sr.nextLine();

System.out.println("Enter your Mob no");
mob no=sr.nextLine();


System.out.println("Student Roll no is :"+roll no);
System.out.println("Student Name is :"+name);
System.out.println("Student Mob no is :"+mob no);
sr.close();
}
}
