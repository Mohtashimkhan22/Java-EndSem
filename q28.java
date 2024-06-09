import java.util.Scanner;
public class q28 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int row=0,col=0,min,max;
        for (int i = 0; i < matrix.length; i++) {
            min=99999;
            max=-99999;
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][col]>max){
                    max = matrix[j][col];
                }
            }
            if(min == max){
                System.out.println("the saddle point is: "+ row + " "+col);
            }
        }
        sc.close();
    }
}
