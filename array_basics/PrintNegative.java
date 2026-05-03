import java.util.Scanner;
public class PrintNegative{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter array size");
    int []arr = new int[n];
    System.out.println("Enter array element");
    for(int i = 0;i<n;i++)
    arr[i] = sc.nextInt();

 // print negative values
 for(int i = 0;i<n;i++)
     if(arr[i]<0)  System.out.println(arr[i]);
    
}
}
