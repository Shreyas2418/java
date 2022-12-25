package java1;
//build a right angle triangle
public class Build_a_right_angle_triangle {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==0&&j==1
				|| i==0&&j==2 
				|| i==0&&j==3
				|| i==0&&j==4
				|| i==0&&j==5
				
				|| i==1&&j==2
				|| i==1&&j==3
				|| i==1&&j==4
				|| i==1&&j==5
				
				|| i==2&&j==3
				|| i==2&&j==4
				|| i==2&&j==5
				
				|| i==3&&j==4
				|| i==3&&j==5
				
				|| i==4&&j==5) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}
