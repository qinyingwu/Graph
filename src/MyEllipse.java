
public class MyEllipse  extends Graph{

	private double a,b;
	  public MyEllipse (double x,double y,double a,double b){
	      super(x,y);
	      this.a=a;
	      this.b=b;
	  }
	  protected void changA(double a){   // ÐÞ¸Ä³¤Öáa
	      this.a=a;
	  }
	  protected void changB(double b){   // ÐÞ¸Ä¶ÌÖáb
	      this.b=b;
	  }
	  public double area(){
	      return 3.1416*a*b;
	  }
}
