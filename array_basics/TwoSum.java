public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {4,5,9,4,7,2};

        int target = 9;

        int n = arr.length;

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] == target) {

                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}