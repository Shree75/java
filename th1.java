public class th1 
{
	 public static void main(String[] args) 
	 {
		Hi ob1 = new Hi();
		Hello ob2 = new Hello();
		ob1.show();
		ob2.show();
	 }
}
class Hi
{
	public void show()
	{
		for (int i = 0;i <=5;i++) 
		{
			System.out.println("Hi");	
		}
	}
}
class Hello
{
	public void show()
	{
		for(int i = 0;i <= 5;i++)
		{
			System.out.println("Hello");
		}
	}
}