// public class SumandMax {
//     public static void main(String[] args) {
//         int[] arr = {-9, 8, 14, -2, 23, 4, 27, -7};

//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];   // sum = sum + arr[i];
//         }

//         System.out.println(sum);
//     }
// }

// ************************** product of an array*****************


// public class Main{
//         public static void main(String[] args) {
//             int[] arr = {2*3*4*5*6*7*8*9};
//             int product = 1;
 
//             for(int i = 0;i<arr.length;i++){
//                 product = product*arr[i];

//             }
//             System.out.println(product);
//         }
// }



// ******************** print maximum element in the array*************************

public class SumandMax{
        public static void main(String[] args) {
            int[] arr = {2,3,4,56,9,75};
            int max = 1;
 
            for(int i = 0;i<arr.length;i++){
           if(arr[i]>max)  max = arr[i];
            }
            System.out.println(max);
        }
}