
public class MementoPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Originator orig = new Originator();
	      CareTaker careT = new CareTaker();
	      
	      orig.setState("State #1");
	      orig.setState("State #2");
	      careT.add(orig.saveStateToMemento());
	      
	      orig.setState("State #3");
	      careT.add(orig.saveStateToMemento());
	      
	      orig.setState("State #4");
	      System.out.println("Current State: " + orig.getState());		
	      
	      orig.getStateFromMemento(careT.get(0));
	      System.out.println("First saved State: " + orig.getState());
	      orig.getStateFromMemento(careT.get(1));
	      System.out.println("Second saved State: " + orig.getState());
	}

}
