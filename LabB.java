class Car 
{
  void start()
{
  System.out.println("Car is starting");
}
}
class SportsCar extends Car
{
  void start()
 {
   System.out.println("SportsCar is starting");
}
}
public class LabB
{
  public static void main(String args[])
{
  Car C =new Car();
  C.start();
  C =new SportsCar();
  C.start();
}
}