package obs;

public class ObserverImpl1 implements Observer {

	@Override
	public void update(int v) {
		System.out.println("R�sultat : " + v*3);		
	}

}
