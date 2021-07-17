import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Array Elements : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements : ");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter Search Key Element : ");
        int search_key = scan.nextInt();
        boolean flag = false;
        for(int i : arr){
            if(i == search_key){
                System.out.println("Element found!");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found!");
        }
    }
}