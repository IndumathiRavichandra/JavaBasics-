package javasessions;

public class Users {

	String name;
	int id;
	String dob;
	String city;
	boolean isActive;
	
	public Users() {
		System.out.println("default constructor..");
	}
	

	public Users(String name, int id) {
		System.out.println("Name and id : " + name + id );
		//name = name1;
		//id= id1;
		this.name = name;
		this.id = id;
	}
	
	public Users(String name, int id, String city) {
		System.out.println("3 params" );
		//name = name1;
		//id= id1;
		this.name = name;
		this.id = id;
		this.city = city;
	}
	
	public Users(String name, String dob, String city, boolean isActive) {
		super();
		this.name = name;
		this.dob = dob;
		this.city = city;
		this.isActive = isActive;
	}
	
	public static void main(String[] args) {
	
		Users u1= new Users();
		u1.name = "Indu";
		u1.id = 3;
		
		Users u2= new Users("indu",101);
	System.out.println(u2.name); // null value prints
	System.out.println(u2.id);
	
	
	Users u3= new Users("indu",101,"india");
	System.out.println(u3.name + " "+ u3.id + " "+u3.city);
	
	Users u4= new Users("indu","010186","india", true);
	System.out.println(u4.name + " "+ u4.dob + " "+u4.city + " " + u4.isActive);
	}
	}


	


