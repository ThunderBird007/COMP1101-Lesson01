
public class Player {
	
	//private Person tom = new Person();

	
	public static void main(String[] args) {
		Person tom = new Person("tom", 200.3f, 6.0f);
		tom.walks();
		
		tom.walks();
		tom.walks();
		tom.walks();
		
		tom.setHeight(7);
		
		Person mike = new Person("mike", 160.0f, 6.5f);
		mike.walks();
		
	}

}
