class Salary{
	public static void main(String[]args){
		String name="peter";
		int salary=1500;
		int tax;
		int net;
		if (salary>1500){
			tax=salary*21/100;
			net=salary-tax;
			System.out.println(salary);
			System.out.println(tax);
			System.out.println(net);
		}
		else{
			System.out.print("no tax");
		}
	}
}