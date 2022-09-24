import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
    int rowN;
    int columnN;
    double[][] matrix;

    public Matrix(int rowN, int columnN) {
        this.rowN = rowN;
        this.columnN = columnN;
        this.matrix = new double[rowN][columnN];
    }

    public void FillMatrixScanner() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < this.rowN; i++) {
            for (int j = 0; j < this.columnN; j++) {
                this.matrix[i][j] = in.nextDouble();
            }
        }
        }
    public void FillMatrixAuto(int count) {
        for (int i = 0; i < this.rowN; i++) {
            for (int j = 0; j < this.columnN; j++) {
                this.matrix[i][j] = count;
                count++;
            }
        }
    }
   public boolean printMatrix(){
       for (int i = 0; i < rowN; i++) {
           System.out.println(Arrays.toString(this.matrix[i]));
       }
       return true;
   }
   public Matrix add(Matrix m2) {
       Matrix new_matrix = null;
       if (m2.rowN == this.rowN && m2.columnN == this.columnN) {
           new_matrix = new Matrix(this.rowN, this.columnN);
           for (int i = 0; i < this.rowN; i++) {
               for (int j = 0; j < this.columnN; j++) {
                   new_matrix.matrix[i][j] = this.matrix[i][j] + m2.matrix[i][j];
               }
           }
       }
       return new_matrix;
   }
    public Matrix sub(Matrix m2) {
        Matrix new_matrix = null;
        if (m2.rowN == this.rowN && m2.columnN == this.columnN) {
            new_matrix = new Matrix(this.rowN, this.columnN);
            for (int i = 0; i < this.rowN; i++) {
                for (int j = 0; j < this.columnN; j++) {
                    new_matrix.matrix[i][j] = this.matrix[i][j] - m2.matrix[i][j];
                }
            }
        }
        return new_matrix;
    }
    public Matrix multiplyByNumber (double number) {
        Matrix new_matrix = null;

        new_matrix = new Matrix(this.rowN, this.columnN);
        for (int i = 0; i < this.rowN; i++) {
            for (int j = 0; j < this.columnN; j++) {
                new_matrix.matrix[i][j] = this.matrix[i][j] * number;

        }
    }
        return new_matrix;
    }
    public Matrix multiply (Matrix m2) {
        Matrix new_matrix = null;
        if (m2.rowN == this.columnN) {
            new_matrix = new Matrix(this.rowN, m2.columnN);
            for (int i = 0; i < this.rowN; i++) {
                for (int j = 0; j < m2.columnN; j++) {
                    for (int n = 0; n < this.columnN; n++) {
                        new_matrix.matrix[i][j] += this.matrix[i][n] * m2.matrix[n][j];
                    }
                }
            }
        }
        return new_matrix;
    }
    public Matrix transp() {
        Matrix new_matrix = null;
            new_matrix = new Matrix(this.columnN, this.rowN);
            for (int i = 0; i < this.columnN; i++) {
                for (int j = 0; j < this.rowN; j++) {
                    new_matrix.matrix[i][j] = this.matrix[j][i];
                }
            }
        return new_matrix;
    }
    public Matrix exp(int power) {
        Matrix new_matrix = null;
        if (this.rowN == this.columnN) {
            new_matrix = new Matrix(this.columnN, this.rowN);
            for (int i = 0; i < this.rowN; i++) {
                for (int j = 0; j < this.rowN; j++) {
                    new_matrix.matrix[i][j] = this.matrix[i][j];
                }
            }
            for (int i = 0; i < power-1; i++) {
                new_matrix = new_matrix.multiply(this);
            }


                }
        return new_matrix;
    }



}
