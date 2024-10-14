import java.util.*;
public class Calculator{

public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	
System.out.println("Enter first number:");
int a =sc.nextInt();

System.out.println("Enter second number:");
int b = sc.nextInt();
System.out.println("Enter operation to perform:");
int c=sc.nextInt();
if(c==1)
{
	int x=addition(a,b);
	System.out.println("addition="+ x);
}
  else if(c==2)
  {
	  int x=subtraction(a,b);
	  System.out.println("subtraction="+x);
  }
  else if(c==3)
  {
	 
	  int x=multiplication(a,b);
	  System.out.println("multiplication="+x);
  }
  else if(c==4)
  {
	  int x= division(a,b);
	  System.out.println("division="+x);
  }
  
  else
  {
	  System.out.println("Invalid operation");
  }
	  
}
public static int addition(int a,int b){
		int result=a+b;
		return result;
			
}
public static int subtraction(int a, int b){
		int result=a-b;
		return result;
		
		
	}
	public   static int multiplication(int a, int b){
		int result=a*b;
		return result;
	}
	public static  int division(int a, int b){
		int result=a/b;
		return result;
		
	}
	

}

