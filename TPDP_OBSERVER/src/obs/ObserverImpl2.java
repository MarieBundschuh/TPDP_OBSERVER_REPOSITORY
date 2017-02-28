package obs;

public class ObserverImpl2 implements Observer {

	@Override
	public void update(int v) {
		System.out.println("Résultat : " + v*6);		
	}

}
