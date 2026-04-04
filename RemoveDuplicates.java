import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0;

        for(int j = 1; j < n; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println("Array after removing duplicates:");

        for(int k = 0; k <= i; k++){
            System.out.print(arr[k] + " ");
        }
    }
}