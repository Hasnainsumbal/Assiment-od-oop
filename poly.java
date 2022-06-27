class car
{
   void start() 
		{
			System.out.println("car is starting");
			}
    class sportcar extends car{
  void start (){
	System.out.println("sport car is starting");
		}
	}
}
 public class poly{
    public static void main(string args[]){
		car C = new car();
		c.start();
		sportcar sc =new sportcar();
		sc.start();
		}
}