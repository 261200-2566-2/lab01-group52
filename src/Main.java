import java.util.Scanner;
public class Main {
    public static int[] sorted(int[] arr, int n){ //bubble sort
        boolean swap;
        for(int i=0; i<n-1; i++){
            swap = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = -1;
        while(n<0){
            System.out.print("Enter the number of integers(n): ");
            n = s.nextInt();
            if(n<0) {
                System.out.println("Please enter a non-negative integer");
            }
        }

        int[] arr = new int[n];
        for (int j=0; j<n; j++) {
            System.out.print("Enter integer(s): ");
            arr[j] = s.nextInt();
        }

        arr = sorted(arr, n);

        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

        //Reference: https://www.geeksforgeeks.org/bubble-sort/
    }
}