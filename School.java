class School{
	public static void main(String[]args){
		int phy = 70;
		int che = 80;
		int math = 90;
		int total = phy+che+math;
		int per = (total*100/450);
		if (per>=30){
			System.out.println(total);
			System.out.println(per);
			System.out.println("you have passed the exam but your a nerd----sorry");
		}
		else{
			System.out.print("you have failed the exam");
		}
	}
}