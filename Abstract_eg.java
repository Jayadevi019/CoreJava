abstract class person1 {
	abstract boolean whatDoYouDo();

	public boolean doYouSpeak() {
		System.out.println("Speaking...");
		return true;
	}
}

class Trainer extends person1 {
	public boolean whatDoYouDo() {
		System.out.println("Delivers Lectures");
		return true;
	}
}

class Doctor extends person1 {
	public boolean whatDoYouDo() {
		System.out.println("Cures Ill");
		return true;
	}
}

class Pilot extends person1 {
	public boolean whatDoYouDo() {
		System.out.println("Flies the Airplane");
		return true;
	}
}

public class Abstract_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t=new Trainer();
		t.whatDoYouDo();
		t.doYouSpeak();
		Doctor d=new Doctor();
		d.whatDoYouDo();
		d.doYouSpeak();
		Pilot p=new Pilot();
		p.whatDoYouDo();
		p.doYouSpeak();

	}

}
