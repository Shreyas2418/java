package java1;
//max & min paid
public class Maximum_and_minium_paid {
	public static void main(String[] args) {
		int[]x= {500,500,800,600,900,700,400,300,600};
		for (int i = 0; i < x.length-1; i++) {
			for (int s = 0; s < x.length-1; s++) {
				if(x[s]>x[s+1]) {
					int tem = x[s];
					x[s]=x[s+1];
					x[s+1]=tem;	  
				}
			}
		}
			int []temp = new int [x.length];
			int z=0;
			for (int j = 0; j < x.length-1; j++) {
				if(x[j]!=x[j+1]) {
					temp[z]=x[j];
					z++;
				}
			}
			temp[z]= x[x.length-1];
			for (int l = 0; l <=z; l++) {
				System.out.println(temp[l]);
			}
				System.out.println("min 2 paids:");
				System.out.println(x[0]);
				System.out.println(x[1]);
				System.out.println("max 2 paid:");
				System.out.println(x[x.length-1]);
				System.out.println(x[x.length-2]);
		
	}
}
		
		

