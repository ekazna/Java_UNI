import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //создаем две матрицы
        Matrix matrixOne = new Matrix (2, 2);
        Matrix matrixTwo = new Matrix (2, 4);
        //заполняем числами *можно с помощью .FillMatrixScanner() через ввод
        matrixTwo.FillMatrixAuto(5);
        matrixOne.FillMatrixAuto(2);
        //выводим матрицы
        matrixOne.printMatrix();
        System.out.println(' ');
        matrixTwo.printMatrix();
        System.out.println(' ');

        /*
        matrixOne.add(matrixTwo).printMatrix(); // сложение
        matrixOne.sub(matrixTwo).printMatrix(); // вычитание
        matrixOne.multiplyByNumber(4); //умножение на число
        matrixOne.multiply(matrixTwo).printMatrix(); // умножение (кол-во столбцов 1 должно быть равно числу строк 2)
        matrixTwo.transp().printMatrix(); // транспонирование
        matrixOne.exp(0).printMatrix(); // возведение в степень
         */



    }

}