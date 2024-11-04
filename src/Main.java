import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        ArrayList<Double> nums = new ArrayList<>();
        ArrayList<Double> temp = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("N = ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Element %d = ", i+1);
            double num = scanner.nextDouble();
            nums.add(num);
        }

        while (nums.size() > 1) {
            for (int i = 0; i < nums.size() - 1; i++) {
                double sum = nums.get(i) + nums.get(i + 1);
                temp.add(sum);
                System.out.printf("%g ", sum);
            }
            nums.clear();
            nums.addAll(temp);
            temp.clear();
            System.out.print("\n");
        }

        System.out.printf("\nResult = %g", nums.getFirst());
    }
}