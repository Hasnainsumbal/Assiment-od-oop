interface Bank {
   float rateofInterest();
   }
 class SBI implements Bank{
  public float rateofInterest(){

return 9.15f;

}
 }
class PNB implements Bank{
 public float rateofInterest(){
 return 9.7f;
 }
}
 public class DisInterest {
  public static void main (String args[]){
  
  SBI sb = new SBI();
  System.out.println(sb.rateofInterest());
  
  PNB pb = new PNB ();
  System.out.println(pb.rateofInterest());
  }
 }