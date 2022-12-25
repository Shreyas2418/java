package java1;
//Sorting of array 
public class Sorting_of_Array{
		public static void main(String[] args) {
		int [] a = {100,55,77,33,22,9,0,111};
	for(int z=0; z<a.length-1;z++) {
		for(int x=0; x<a.length-1;x++) {
			if(a[x]>a[x+1]) {
				int temp=a[x];
				a[x]=a[x+1];
				a[x+1]=temp;

			}
		}
	}
		for (int i : a) {
			System.out.println(i);
		}
	}
}	
	
	


