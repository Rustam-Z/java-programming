public class Matrix {

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        // write your matrix multiplication code here

        int c[][]=new int[2][2];

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                c[i][j]=0;
                for(int k=0; k<2; k++)
                    c[i][j] += a[i][k]*b[k][j];
                System.out.print(c[i][j]);
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(c[i][j]);
            }
        }


    }

    public static void main(String[] args) {

    }
}
