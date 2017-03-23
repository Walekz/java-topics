public class Robot {

	private Integer age = 1;

	private void sayHello(){
	  if(age >= 0 && age <= 2){
		  System.out.println("Eres un bebé");
	  }
	  if(age >= 3 && age <=11){
		  System.out.println("Eres un niño"); 
	  }
	}

	public static void main(String args[]){
	  new Robot().sayHello();
	}

}
