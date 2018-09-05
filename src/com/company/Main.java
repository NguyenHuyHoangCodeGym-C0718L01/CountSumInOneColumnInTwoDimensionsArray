package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of array: ");
        int a = scanner.nextInt();
        array = inputSizeArray(a);

        System.out.println();

        System.out.println("Input the element of array: ");
        array = inputElement(array);

        System.out.println();

        System.out.println("Display the array: ");
        outputArray(array);

        System.out.println();

        System.out.print("Input the column you want to count: ");
        int b = scanner.nextInt();
        System.out.println("Sum in One Column in Array: ");
        System.out.print(countSumInColumn(array, b));

    }

    public static int[][] inputSizeArray(int a){
        return new int[a][a];
    }

    public static int[][] inputElement(int[][] array){
        for(int row = 0; row <array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                System.out.print("Input element at row: "+row+" column: "+column+" : ");
                Scanner scanner = new Scanner(System.in);
                array[row][column] = scanner.nextInt();
                System.out.println();
            }
        }
        return array;
    }

    public static boolean outputArray(int[][] array){
        if(array != null) {
            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array[row].length; column++) {
                    System.out.print("Element at row: " + row + " column: " + column + " : " + array[row][column]+" ");
                }
                System.out.println();
            }
            return true;
        }else {
            System.out.println("Array is null");
            return false;
        }
    }

    public static int countSumInColumn(int[][] array, int columnSelected){
        int sum = 0;
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                if(columnSelected == column){
                    sum += array[row][column];
                }
            }
        }
        if(sum == 0){
            System.out.println("Wrong column");
        }
        return sum;
    }
}
