// import java.util.Scanner;
// public class input {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter radius");
//        double r = sc.nextDouble();
//        double a = 3.14*r*r;
//        System.out.println(a);
//     }
 // }


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Principal: ");
//         double p = sc.nextDouble();

//         System.out.print("Enter Rate: ");
//         double r = sc.nextDouble();

//         System.out.print("Enter Time: ");
//         double t = sc.nextDouble();

//         double si = (p * r * t) / 100;
//         double amount = p + si;

//         System.out.println("Simple Interest = " + si);
//         System.out.println("Total Amount = " + amount);

//         sc.close();
//     }
// }

 // +++++++++++++++++++++++++++++++ Sum of two number+++++++++++++++++++++++
 
 
//  import java.util.Scanner;
// public class Main{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" Enter a number:");
//         int  a = sc.nextInt();
//         System.out.print("Enter a number");
//         int b = sc.nextInt();
//        int num = a+b;
//         System.out.println("Sum of two number:"+ num );
//     }
// }



// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Principal: ");
//         double p = sc.nextDouble();

//         System.out.print("Enter Rate: ");
//         double r = sc.nextDouble();

//         System.out.print("Enter Time: ");
//         double t = sc.nextDouble();

//         double si = (p * r * t) / 100;

//         System.out.println("Simple Interest = " + si);

//         sc.close();
//     }
// }


//++++++++++++++++++++++++ASCII values and typecasting++++++++++++++++++
//public class Main{
  //  public static void main(String[] args) {
        // char ch = 'A';
        // int x = ch;
        // System.out.println(x);

//         char ch = 'c';
//         int x = ch;
//         System.out.println(x);

//         int num = 65;
//         char ch1 = (char) num;

//        System.out.println(ch1);
//     }
// }

// | Character | ASCII Value |
// | --------- | ----------- |
// | A         | 65          |
// | B         | 66          |
// | a         | 97          |
// | 0         | 48          |

import java.util.Scanner;

public class Main {
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
