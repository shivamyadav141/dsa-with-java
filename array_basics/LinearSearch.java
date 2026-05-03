public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {45,7,18,33,1};

        int target = 551;

        boolean flag = false;  // target array me nhi hai

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == target) {

                flag = true;  // target array me hai

                break;
            }
        }

        if(flag) {

            System.out.println("Target exists in array");
        }
        else {

            System.out.println("Target is not in array");
        }
    }
}