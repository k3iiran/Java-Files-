class Results{
	private int phy,che,mat;
	int total=0;
	int invalid=0;
	int fail=0;
		public void physics(int a){
			if(a>=0&a<=150){
			phy=a;
			}
			else{
			System.out.println("invalid physics results");
			invalid=1;
			}
			if(a>0&a<60){
				fail++;
			}
		}
		public void chemistry(int b){
			if(b>=0&b<=150){
			che=b;
			}
			else{
			System.out.println("invalid chemistry results");
			invalid=1;
			}
			if(b>0&b<60){
				fail++;
			}
		}
		public void maths(int c){
			if(c>=0&c<=150){
			mat=c;
			}
			else{
			System.out.println("invalid maths results");
			invalid=1;
			}
			if(c>0&c<60){
				fail++;
			}
		}
		public void docalculations(){
			float per=0;
			if(invalid==0){
				total=phy+che+mat;
				if(fail==0){
					System.out.println("you have passed the exams");
				}
				if(fail==1){
					System.out.println("repeat the exam");
				}
				if(fail==2){
					System.out.println("repeat the course");
				}
				if(fail==3){
					System.out.println("go home");
				}
			}
			else{
				System.out.println("cant calculate result");
			}
		}
		public void showresults(){
			docalculations();
			System.out.println("total marks:"+total);
		}
}
