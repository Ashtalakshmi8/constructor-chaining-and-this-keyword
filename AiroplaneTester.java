class AiroplaneTester{
	public static void main (String [] args){
		
		Airoplane ref = new Airoplane ("kingfisher",1200,"2312","yellow");
		System.out.println(ref.name+"\t"+ref.speed+"\t"+ref.type+"\t"+ref.colour);
		
		Airoplane air = new Airoplane ("fish",738," 1232","green");
		System.out.println(air.name+"\t"+air.speed+"\t"+air.type+"\t"+air.colour);
		
		Airoplane airo = new Airoplane ("Airlines",675,"458","whit");
		System.out.println(airo.name+"\t"+airo.speed+"\t"+airo.type+"\t"+airo.colour);
		
		Airoplane va = new Airoplane ("deccan",567,"456","black");
		System.out.println(va.name+"\t"+va.speed+"\t"+va.type+"\t"+va.colour);
		
		Airoplane hi = new Airoplane ("Aircraft",780,"234","red");
		System.out.println(hi.name+"\t"+hi.speed+"\t"+hi.type+"\t"+hi.colour);
		
	}
}
