// import java.util.Scanner;
// public class FourDigitNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();

//         if(n>999 && n<1000){
//      System.out.println("4 digit number");
//         }else{
//             System.out.println("not a 4 digit number");
//         }
//     }
// }

//    take integer input and tell its magnitude is smaller 69 or not

// import java.util.Scanner;
// public class FourDigitNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         if(n<0){
//             n = -n;
//         }if(n<69){
//             System.out.println("smaller");
//         }else{
//             System.out.println("not smaller");
//         }
        
//     }
 // }


// import java.util.Scanner;
// public class FourDigitNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();

//         if(n%5==0|| n%3==0){
//             System.out.println("divisible by 5 or 3");
//         }else{
//             System.out.println("divisible by not 5 or 3");
//         }
//     }
// }
   
// take 3 positive integer input and tell if they can be the sides of triangle or not

// import java.util.Scanner;
// public class FourDigitNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first side");
//         int a = sc.nextInt();

//         System.out.println("Enter 2nd side");
//         int b = sc.nextInt();

//         System.out.println("Enter 3rd side");
//         int c = sc.nextInt();
     
//         if(a+b>c && b+c>a && c+a>b){
//             System.out.println("valid triangle");

//         }else{
//             System.out.println("invalid triangle");
//         }
//     }
// }



import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("Ashu");
        } 
        else if (n % 5 == 0) {
            System.out.println("Riya");
        } 
        else if (n % 3 == 0) {
            System.out.println("Bhanu");
        } 
        else {
            System.out.println("Shivam");
        }

        sc.close();
    }
}
