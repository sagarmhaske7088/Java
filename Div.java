class Div
{
public static void main(String arg[])
{
int a=10,b=5,c=0;
float div;
try
{
div =a/(b-c);

System.out.println("Division is "+div);
}
 catch(ArithmeticException e)
 {
 System.out.println("Division by is zero");
 }
 
 finally
 {
 System.out.println("I am final block");
 }
 }
 }
