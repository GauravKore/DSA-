import java.util.Scanner;
public class Twosumsorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // input size 
        System.out.println("enter number of elements");
        int n = sc.nextInt();

         int[] arr = new int[n];

        // Input sorted array
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("Indices (1-based): " + (i + 1) + " " + (j + 1));
                return;
            } 
            else if (sum < target) {
                i++;
            } 
            else {
                j--;
            }
        }

        System.out.println("No pair found");
    }

    }
