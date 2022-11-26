package JavaLearn;
	
//Inheritance
class Shape {
	public void area() {
		System.out.println("displays area");
	}
}
//1. Single Level Inheritance
class Triangle extends Shape {
	public void area (int l, int h) {
		System.out.println(1/2*l*h);
	}
}
//2. Multi level Inheritance
class EquilateralTriangle extends Triangle {
	public void area (int l, int h) {
		System.out.println(1/2*l*h);
	}
}
//3. Heirarchial Inheritance
class Circle extends Shape {
	public void area (int r) {
		System.out.println((3.14)*r*r);
	}
}


//Access Modifiers
class Account {
	public String name;				//public
	protected String email;			//protected
	private String password;		//private
	String Dept;					//default (no initial)
	
	//getters
	public String getPassword() {
		return password;
	}
	//setters
	public void setPassword(String password) {
		this.password = password;
	}
}
public class OOPS_Concepts {
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.name = "Apna College";
		account1.email = "apnacollege@gmail.com";
		account1.setPassword("abcd");
		System.out.println(account1.getPassword());
	}
}

//Encapsulation




