import java.util.Scanner;
public class findMinInArray {
    private static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element "+(i+1)+":");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Property list:");
        for(int value:arr){
            System.out.print(value+"\t");
        }
        System.out.println(";min is:"+min(arr));

    }
}
