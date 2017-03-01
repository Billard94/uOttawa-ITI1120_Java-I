import java.util.Scanner;

public class SumUpperTriangle{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    
		System.out.print("Enter a 4 by 4 matrix row by row: ");
		double[][] m = new double[4][4];
      
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++){
				m[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("The sum of the upper triangle of the given square matrix  " + sumUppperTriangleMatrix(m));
	}
  
	public static double sumUppperTriangleMatrix(double[][] m) {
		double sum = 0;

		for (int row = 0; row < m.length; row++){
			for (int col = 0; col < m[0].length; col++){
				if(row<=col){
					sum += m[row][col];
				}
			}
		}
		return sum;
	}  
}


