package frstpkg;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intarr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(intarr[i][j]+ " ");
			
			System.out.println();
		}
		
		//for a 90 degree clockwise
		System.out.println("90 degree clockwise rotation two times");
			for(int i=0,a=0; i<3 && a<3; i++,a++)
			{
				for(int j=2,b=0; j>=0 && b<3; j--,b++)
				{
					System.out.print(intarr[j][i]+ " ");
				}
				System.out.println();
			}
//			for(int i=0,a=0; i<3 && a<3; i++,a++)
//			{
//				for(int j=2,b=0; j>=0 && b<3; j--,b++)
//				{
//					System.out.print(arr2[i][j]+ " ");
////					arr2[a][b]=intarr[j][i];
//				}
//				System.out.println();
//			}
	}
}
