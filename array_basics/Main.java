// public class Arrays {
//     public static void main(String[] args) {

//         // int[] x = {18, 45, 33, 1, 7};

//         // System.out.println(x[1]);

//         // x[3] = 15;
//         // System.out.println(x[3]);


//         int[]arr = new int [4];
//         arr[ 0] = 10;
//         arr[ 1] = 100;
//         arr[ 2] = 1000;
//         arr[ 3] = 10000;

//         System.out.println(arr[3]);
        
//     }
// }



//  largest element in the array **************************


public class Main {

    public static void main(String[] args) {

        // Array banaya
        int[] arr = {4,7,2,9,5};

        // First element ko max maan liya
        int max = arr[0];

        // Array ke har element ko check karne ke liye loop
        for(int i = 0; i < arr.length; i++) {

            // Agar current element max se bada hai
            if(arr[i] > max) {

                // Toh current element ko new max bana do
                max = arr[i];
            }
        }

        // Final largest element print karo
        System.out.println("Largest Element = " + max);
    }
}