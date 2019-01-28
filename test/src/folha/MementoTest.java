 package folha;

public class MementoTest {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setStatus("Test 1");
		originator.setStatus("Test 2");
		careTaker.add(originator.saveMementoStatus());
		
		originator.setStatus("Test 3");
		careTaker.add(originator.saveMementoStatus());
		
		originator.setStatus("Test 4");
		System.out.println("status atual:" + originator.getStatus());

	}

}
