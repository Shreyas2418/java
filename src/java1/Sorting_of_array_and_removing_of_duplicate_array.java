package java1;
//sorting of array and removing of duplicate array
public class Sorting_of_array_and_removing_of_duplicate_array {
	public static void main(String[] args) {
		int[]x = {38,23,23,32,14,14,7};
		for (int j = 0; j < x.length-1; j++) {
			for (int i = 0; i < x.length-1; i++) {
				if(x[i]>x[i+1]) {
					int y=x[i];
					x[i]=x[i+1];
					x[i+1]=y;
				}
			}
		}
		int[]temp= new int[x.length];
		int a=0;
			for (int i = 0; i < x.length-1; i++) {
				if(x[i]!=x[i+1]) {
					temp[a]=x[i];
					a++;
				}
			}
			temp[a]= x[x.length-1];
			for (int i = x.length-1; i>=0 ; i--) {
				System.out.println(temp[i]);
			}
		}
	}
