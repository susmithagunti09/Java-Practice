class Sample{
	public static void main(String[] args) {
	Overloading o=new Overloading();
	Overriding ov=new Overriding();
	Overriding ovc=new Child();
	
	ChildS s2=new ChildS();
	s2.run();
	o.add(2);
	o.add(2,3);
	ov.show();
	ovc.show();
	
	}
}