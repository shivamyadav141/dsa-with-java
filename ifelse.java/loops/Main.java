 // +++++++++++++++++++++++++++++++++++++ break and continue ++++++++++++++++++++++++++++++

// | `break`    | loop ko poora stop     |    1 2 3 4 STOP 
// | `continue` | sirf current step skip |    1 2 skip 3 4 5


 // ++++++++++++++ wap to check if a given number is prime or not+++++++++++++++++++

//  import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int n = sc.nextInt();
//         for(int i = 2;i<= n-1; i++){
//             if(n%i==0){
//                 System.out.print("composite number");
//             break;
//             }
//             }
//     }
// }


// public class Main {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 10; i++) {
//       System.out.println(i);
//       if(i==5) continue;
//       System.out.println("Good Morning");

            

//         }
//     }
// }



// **************************** while loop ***********************

// public class Main{
//     public static void main(String[] args) {
//         int i = 1;
//         while(i<=10){
//         System.out.println(i);
//         i++;
//         }
//     }
// }

// +++++++++++++++++++do while++++++++++++++++++++++++++

// public class Main {
//     public static void main(String[] args) {

//         int i = 1;

//         do {
//             System.out.println(i);
//             i++;
//         } while (i <= 10);

//     }
// }

// *********************count digit of numbers********************** 

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     int count = 0;
//     while (n !=0){
//         n = n/10;
//         count++;
//     }
//         System.out.println(count);
//     }
// }

// ******************* print sum of digit of number ********

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number");
//         int n = sc.nextInt();

//         int sum = 0;
//         while( n!=0){
//             sum+=(n%10);
//             n = n/10;
//         }
//         System.out.println(sum);
//     }
// }

// print sum of number and its number
// ********************** reverse of a number*****************
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number :");
    int n = sc.nextInt();

    int rev  = 0;
   while(n !=0){
    rev = rev*10;
    rev +=(n%10);
    n = n/10;
   }
   System.out.println(rev);
}
} 
