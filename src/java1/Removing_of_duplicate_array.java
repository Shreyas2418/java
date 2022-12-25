package java1;
//removing of duplicate array
public class Removing_of_duplicate_array {
	public static void main(String[] args) {
		int [] x = {1,2,2,3,3,4,5};
		int[] temp = new int[x.length];
		int j = 0;
		for(int i=0; i<x.length-1; i++) {
			if(x[i]!=x[i+1]) {
				temp[j]=x[i];
				j++;

			}
			temp[j]= x[x.length-1];
			for(int z=0; z<=j;z++) {       //to reverse for(int z=x.length-1; z>=0;z--)
				System.out.println(temp[z]);	
			}

		}
	}
}


