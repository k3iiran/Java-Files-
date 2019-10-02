class Accounts2{
	public void tax(){
		System.out.println("tax rates:"+21);
	}
	public void tax(int salary){
		float tax=(float)salary*21/100;
		System.out.println("your tax is:"+tax);
	}
	public void tax(int sal,int rate){
		float tax=(float)sal*rate/100;
		System.out.println("your tax is:"+tax);
	}
}