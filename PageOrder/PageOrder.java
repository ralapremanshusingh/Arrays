import java.util.Scanner;
public class PageOrder {
	
		
	void conti() {
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.print("How many pages in a page (4/8/12/16/18): ");
		int page = in.nextInt();
		System.out.println();
		PageMethod pg = new PageMethod();
		pg.start(page);
		
	}
	
		
 	public static void main(String args[]) {
		
		PageOrder cont = new PageOrder();
		cont.conti();
	
		
	}
}

class PageMethod {
	
	PageOrder con = new PageOrder();
	
	void start(int pp) {
		switch (pp) {
			
			case 18 :
				
				page18();
				break;
			
			case 16 :
			
				page16();
				break;
				
			case 12 :
				
				page12();
				break;
			case 8 :
				
				page8();
				break;
			
			case 4 :
			
				page4();
				break;
			
			default : 
				System.out.println("Wrong Input Please Try again .......");
				con.conti();
		}
	}
	

		void page18(){
			
			System.out.print("Enter Total pages : ");
			Scanner in = new Scanner(System.in);
			int page = in.nextInt();
			int p[] = {1,3,5,7,9,11,13,15,17,6,4,2,12,10,8,18,16,14};
			int term;
			if(page%18==0)
				term=page/18;			
			else if(page<18) 	term=1;
				else		term=(page+18-page%18)/18;

			System.out.println();
			for(int i =1; i<=term; i++) {
				
				for(int j : p)	System.out.print(j + ",");
				System.out.println();
				
				for(int m=0;m<p.length;m++) p[m]+=18;
			
			}
			
			System.out.println();
			int q[] = {1,3,5,7,9,11,13,15,17,6,4,2,12,10,8,18,16,14};
			for(int i=1; i<=term; i++) {
				
				for(int j : q)	System.out.print(j + ",");
				
				for(int m=0;m<q.length;m++) q[m]+=18;
				
			}
		System.out.println("\n");
		System.out.println("Do you want to continue (Y/N) :");
		char yes = in.next().charAt(0);		
		
		if(yes=='y' || yes== 'Y')		con.conti();
		}

		void page16(){
			
			System.out.print("Enter Total pages : ");
			Scanner in = new Scanner(System.in);
			int page = in.nextInt();
			int p[] = {1,3,5,7,9,11,13,15,8,6,4,2,16,14,12,10};
			int term;
			if(page%16==0)
				term=page/16;			
			else if(page<16) 	term=1;
				else		term=(page+16-page%16)/16;

			System.out.println();
			for(int i =1; i<=term; i++) {
				
				for(int j : p)	System.out.print(j + ",");
				System.out.println();
				
				for(int m=0;m<p.length;m++) p[m]+=16;
			
			}
			
			System.out.println();
			int q[] = {1,3,5,7,9,11,13,15,8,6,4,2,16,14,12,10};
			for(int i=1; i<=term; i++) {
				
				for(int j : q)	System.out.print(j + ",");
				
				for(int m=0;m<q.length;m++) q[m]+=16;
				
			}
		System.out.println("\n");
		System.out.println("Do you want to continue (Y/N) :");
		char yes = in.next().charAt(0);		
		
		if(yes=='y' || yes== 'Y')		con.conti();
		}
		
		void page12(){
			
			System.out.print("Enter Total pages : ");
			Scanner in = new Scanner(System.in);
			int page = in.nextInt();
			int p[] = {1,3,5,7,9,11,6,4,2,12,10,8};
			int term;
			if(page%12==0)
				term=page/12;			
			else if(page<12) 	term=1;
				else		term=(page+12-page%12)/12;

			System.out.println();
			for(int i =1; i<=term; i++) {
				
				for(int j : p)	System.out.print(j + ",");
				System.out.println();
				
				for(int m=0;m<p.length;m++) p[m]+=12;
			
			}
			
			System.out.println();
			int q[] = {1,3,5,7,9,11,6,4,2,12,10,8};
			for(int i=1; i<=term; i++) {
				
				for(int j : q)	System.out.print(j + ",");
				
				for(int m=0;m<q.length;m++) q[m]+=12;
				
			}
		System.out.println("\n");
		System.out.println("Do you want to continue (Y/N) :");
		char yes = in.next().charAt(0);		
		
		if(yes=='y' || yes== 'Y')		con.conti();
		}

		void page8(){
			
			System.out.print("Enter Total pages : ");
			Scanner in = new Scanner(System.in);
			int page = in.nextInt();
			System.out.println();
			int p[] = {1,3,5,7,4,2,8,6};
			int term;
			if(page%8==0)
				term=page/8;			
			else if(page<8) 	term=1;
				else		term=(page+8-page%8)/8;

			for(int i =1; i<=term; i++) {
				
				for(int j : p)	System.out.print(j + ",");
				System.out.println();
				
				for(int m=0;m<p.length;m++) p[m]+=8;
			
			}
			
			System.out.println();
			int q[] = {1,3,5,7,4,2,8,6};
			for(int i=1; i<=term; i++) {
				
				for(int j : q)	System.out.print(j + ",");
				
				for(int m=0;m<q.length;m++) q[m]+=8;
				
			}
		System.out.println("\n");
		System.out.println("Do you want to continue (Y/N) :");
		char yes = in.next().charAt(0);		
		
		if(yes=='y' || yes== 'Y')		con.conti();
		}
		
		void page4() {
			
			System.out.print("Enter Total pages : ");
			Scanner in = new Scanner(System.in);
			int page = in.nextInt();
			System.out.println();
			int p[] = {1,3,4,2};
			int term;
			if(page%4==0)
				term=page/4;			
			else if(page<4) 	term=1;
				else		term=(page+4-page%4)/4;

			for(int i =1; i<=term; i++) {
				
				for(int j : p)	System.out.print(j + ",");
				System.out.println();
				
				for(int m=0;m<p.length;m++) p[m]+=4;

			}
			
			System.out.println("\n");
			int q[] = {1,3,4,2};
			for(int i=1; i<=term; i++) {
				
				for(int j : q)	System.out.print(j + ",");
				
				for(int m=0;m<q.length;m++) q[m]+=4;
				
			}
		
		System.out.println("\n");
		System.out.println("Do you want to continue (Y/N) :");
		char yes = in.next().charAt(0);		
		
		if(yes=='y' || yes== 'Y')		con.conti();
		}
}