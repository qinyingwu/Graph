
public abstract class Graph {

	protected double x,y;				// x,y�ǹ���ͼ�ε����ĵ�����
	  public Graph(double x,double y){		// ���캯����ʼ�����ĵ�����
	      this.x=x;
	      this.y=y;
	  }
	  protected void changeX(double x){		// �޸ĺ�����
	      this.x=x;
	  }
	  protected void changeY(double y){		// �޸�������
	      this.y=y;
	  }
	  public abstract double area();
}
