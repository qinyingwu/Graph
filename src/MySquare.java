
public class MySquare extends Graph{

	private double length;
	  public MySquare(double x,double y,double length){
	      super(x,y);//访问超类的构造方法，super.方法名（参数）是访问被子类所隐藏的方法
		  this.length=length;
	  }
	  protected void changLength(double length){   // 修改边长length
	      this.length=length;
	  }	
	  public double area(){
	      return length*length;
	  }
}
