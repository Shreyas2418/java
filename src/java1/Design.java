package java1;
//design
public class Design {
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(i==1&&j==1 || i==1&&j==6
				 ||i==2&&j==1 || i==2&&j==6 ||i==2&&j==3 || i==2&&j==4
				 ||i==3&&j==1 || i==3&&j==6 ||i==3&&j==3 || i==3&&j==4
				 ||i==4&&j==1 || i==4&&j==6 ||i==4&&j==3 || i==4&&j==4
				 ||i==5&&j==1 || i==5&&j==6 ||i==5&&j==3 || i==5&&j==4		
				 ||i==6&&j==1 || i==6&&j==6	
					
						
						) {
				System.out.print(" ");	
				}else {
				System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}
