package patterns;

public class AFactory {
	
	public static void main (String[] args) {
		CProd obj1 = new CProd();
		CProd obj2 = new CProd();
		System.out.println("CProd objects same: " + (obj1 == obj2)); //false
		System.out.println("CProd objects null: " + (obj1 == null)); //false

		
		FProd obj3 = FProd.makeone();
		FProd obj4 = FProd.makeone();
		System.out.println("FProd objects same: " + (obj3 == obj4)); //false
		System.out.println("FProd objects null: " + (obj3 == null)); //false
		
		SProd obj5 = SProd.makeone();
		SProd obj6 = SProd.makeone();
		System.out.println("SProd objects same: " + (obj5 == obj6)); //false
		System.out.println("SProd objects null: " + (obj5 == null)); //false

				
	}

}

class CProd {}

class FProd {
	//constructor
	private FProd() {}
	
	public static FProd makeone() { // because the FProd constructor is private, I can create a FProd instantiation as such 
		return new FProd();  
	}
	
}

class SProd {
	private SProd() {}
	
	private static SProd obj = null;
	
	public static SProd makeone() {
		return obj;
	}
}