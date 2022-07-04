interface Drawable
{
	 void draw();
}
class Rectangle implements Drawable {
	public void draw(){
	System.out.println("Drawing rectangle");
	}
}
class Circle implements Drawable{
	public void draw(){
	System.out.println("Drawing circle");
	}
}
public class A61 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		 r.draw();
		 c.draw();
	}
}
	