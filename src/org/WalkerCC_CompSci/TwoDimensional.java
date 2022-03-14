import java.util.*;
import java.util.Random;

        class TwoDimensional {
            public static void main(String[] args) {
                Random ranNumber = new Random();
                int[][] arrayValues = new int[10][20];

                for(int i = 0; i< arrayValues.length; i++) {
                    for(int k= 0; i < arrayValues.length; k++) {
                        arrayValues[i][k] = ranNumber.nextInt(20);

                        System.out.println(arrayValues[i][k] + " ");
                    }
                    System.out.println();
                    }
                }
            }

