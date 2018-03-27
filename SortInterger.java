import java.util.Scanner;

public class SortInterger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1: ");
        double num1 = input.nextDouble();
        System.out.println("Number 2: ");
        double num2 = input.nextDouble();
        System.out.println("Number 3: ");
        double num3 = input.nextDouble();

        System.out.println("Swaped Number: ");
        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double[] sortedNumber = new double[]{num1, num2, num3};
        if (sortedNumber[0] < sortedNumber[1]) swap(sortedNumber, 0, 1);
        if (sortedNumber[0] < sortedNumber[2]) swap(sortedNumber, 0, 2);
        if (sortedNumber[1] < sortedNumber[2]) swap(sortedNumber, 1, 2);
        for (int i = 0; i < 3; i++) {
            System.out.print(sortedNumber[i] + " ");
        }
    }

    public static void swap(double[] sortedNumber, int i, int j) {
        double temp = sortedNumber[i];
        sortedNumber[i] = sortedNumber[j];
        sortedNumber[j] = temp;
    }
}


