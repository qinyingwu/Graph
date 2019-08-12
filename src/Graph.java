
public abstract class Graph {

	protected double x,y;				// x,y是规则图形的中心点坐标
	  public Graph(double x,double y){		// 构造函数初始化中心点坐标
	      this.x=x;
	      this.y=y;
	  }
	  protected void changeX(double x){		// 修改横坐标
	      this.x=x;
	  }
	  protected void changeY(double y){		// 修改纵坐标
	      this.y=y;
	  }
	  public abstract double area();
}
