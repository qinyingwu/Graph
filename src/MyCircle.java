
public class MyCircle extends Graph{

	private double radius;
	  public MyCircle(double x,double y,double radius){
	     super(x,y);
	     this.radius=radius;
	  }
	  protected void changRadius(double radius){   // �޸İ뾶radius
	     this.radius=radius;
	  }
	  public double area(){
	      return 3.1416*radius*radius;
	  }
}
