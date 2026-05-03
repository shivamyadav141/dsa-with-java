import java.util.Scanner;
public class OutoutInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {5,-8,45,33,01,07 };
        // int n = arr.length;
        // for(int i = 0;i<n;i++){
        //     System.out.println(arr[i] +" ");
        // }

        // default value
        int[] karan = new int[7]  ;  
        // for(int i = 0; i<7;i++){
        // System.out.println(karan[i]+ " ");
        // }

        // input array
        for(int i = 0;i<7;i++){
            karan[i] = sc.nextInt();
        }

        for(int i = 0; i<7;i++){
            System.out.println(karan[i]+ " ");
        }
}
}