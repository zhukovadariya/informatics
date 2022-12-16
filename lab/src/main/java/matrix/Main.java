package matrix;

import java.util.Arrays;
public class Main {
    public static void main(String... args) {
        Matrix2 matrix1 = new Matrix2(new double[][]{{3,3},{2,5}});
        Matrix2 matrix2 = new Matrix2(new double[][]{{5,2},{1,3}});
        System.out.println("Сложение" + "\n" + matrix1.plus(matrix2));
        System.out.println("Вычитание" + "\n" + matrix1.minus(matrix2));
        System.out.println("Определитель" + "\n" + matrix1.det() + "\n" );
        System.out.println("Произведение матриц" + "\n" + matrix1.pM(matrix2));
        System.out.println("Транспонирование матрицы" + "\n" + matrix1.T());
        System.out.println("Произведение матрицы на число" + "\n" + matrix1.pA(3));

    }
}

