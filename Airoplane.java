class Airoplane{
	String name;
	int speed;
	String type;
	String colour;
	
	Airoplane(){
		System.out.println("zero parameter");
		}
		
	Airoplane(String name,int speed,String type,String colour){
		this();//chaining
		this.name=name;//differentiate  b/w instance and local//
		this.speed=speed;
		this.type=type;
		this.colour=colour;
		}
}
