
class Super_try {
	void run()
	{
		System.out.println("Parent class");
	}
	Super_try(){
		System.out.println("Parent constructor");
	}
	String p="Parent";
}
class ChildS extends Super_try{
	void run() {
		System.out.println("Child class");
		String c="child";
		System.out.println(super.p);
		super.run();
	}
	ChildS(){
		super();
		System.out.println("Child constructor");
		
	}
	
}
