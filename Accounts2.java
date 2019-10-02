class Accounts2{
	public static void main(String[]args){
	Accounts ac=new Accounts();
	String name;
	int salary;
	float tax,net;
	name="james";
	salary=(1000);
	net=salary-ac.tax(salary);
	System.out.println(net);
	}
}