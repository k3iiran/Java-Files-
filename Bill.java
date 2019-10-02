class Bill{
	static public void main(String[] args){
		int bill,paid,balance;
		int fifty, twenty, ten, five, two, one;
		bill=69;
		paid=739;
		balance=paid-bill;
		if(balance>50){
			fifty=balance/50;
			balance=fifty%10;
			System.out.println("50:"+fifty);
		}
		if(balance>20){ 
			twenty=balance/20;
			balance=twenty%10;
			System.out.println("20:"+twenty);
		}
		if(balance>10){
			ten=balance/10;
			balance=ten%10;
			System.out.println("10:"+ten);
		}
		if(balance>5){
			five=balance/5;
			balance=5%10;
			System.out.println("5:"+five);
		}
		if(balance>2){
			two=balance/2;
			balance=2%10;
			System.out.println("2:"+two);
		}
		if(balance>1){
			one=balance/1;
			balance=1%10;
			System.out.println("1:"+one);
		}
	}
}