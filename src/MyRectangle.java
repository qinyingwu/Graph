
public class MyRectangle extends Graph{

	private double a,b;
	  public MyRectangle(double x,double y,double a,double b){
	      super(x,y);
	      this.a=a;
	      this.b=b;
	  }
	  protected void changLength(double length){   // �޸ĳ�length
	      a=length;
	  }
	  protected void changWidth(double width){   // �޸Ŀ�width
	      b=width;
	  }
	  public double area(){
	      return a*b;
	  }
}
