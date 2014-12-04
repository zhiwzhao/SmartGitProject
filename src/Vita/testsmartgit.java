package Vita;

public class testsmartgit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a test project for smart git.");
		person person=new person();
		String personNameString=person.getName();
		System.out.println("person name:"+personNameString);
		
		car cherryCar=new car();
		String carNameString=cherryCar.getName();
		System.out.println("car name:"+carNameString);
		
		System.out.println(personNameString+" Buy "+carNameString);
	}

}
