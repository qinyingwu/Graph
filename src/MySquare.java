
public class MySquare extends Graph{

	private double length;
	  public MySquare(double x,double y,double length){
	      super(x,y);//���ʳ���Ĺ��췽����super.���������������Ƿ��ʱ����������صķ���
		  this.length=length;
	  }
	  protected void changLength(double length){   // �޸ı߳�length
	      this.length=length;
	  }	
	  public double area(){
	      return length*length;
	  }
}
