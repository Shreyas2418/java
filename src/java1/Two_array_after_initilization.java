package java1;
// 2D array after initialization
public class Two_array_after_initilization {
	public static void main(String[] args) {
		int[][] x = new int [3][3];
		x[0][0]=10;
		x[0][1]=20;
		x[0][2]=30;
		x[1][0]=40;
		x[1][1]=50;
		x[1][2]=60;
		x[2][0]=70;
		x[2][1]=80;
		x[2][2]=90;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				System.out.println(x[i][j]);
				
			}
			
		}
		
		
		
		
		
	}

}
