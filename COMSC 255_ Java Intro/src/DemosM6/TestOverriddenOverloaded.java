package DemosM6;

public class TestOverriddenOverloaded {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
    A a = new A();
    a.p(20);
    a.p(20.0);
  }
}

class B{
  public void p(double i){
	System.out.println(i*3);
  }
}

class A extends B{
  public void p(int i){
	System.out.println(i);
  }
  @Override
  public void p(double i){
	System.out.println(i);
  }
}
