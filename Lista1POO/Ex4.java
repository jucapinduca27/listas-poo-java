

public class Ex4
{
	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		for(int i = 0; i < 10; i++){
		    for(int j = 0; j < 10; j++){
		        if(i != j){
					matriz[i][j] = 0;
		            System.out.printf(" %d ", matriz[i][j]);
		        }
		        else {
					matriz[i][j] = 1;
		            System.out.printf(" %d ", matriz[i][j]);
		        }
		    }
		    System.out.println();
		}
	}
}
