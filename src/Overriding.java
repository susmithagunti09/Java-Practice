
public class Overriding {
	void show() {
		System.out.println("i am parent");
	}
}
	class Child extends Overriding { 
	    // This method overrides show() of Parent 
	    @Override
	    void show() 
	    { 
	        System.out.println("Child's show()"); 
	    } 
	} 


