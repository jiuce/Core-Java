package Spring.myproject.Myproject;

public class Dependency {

	public Dependency() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}

	public static Dependency dependencyFactory(){
		 
		return new Dependency();
	}
}
