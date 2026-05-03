// import java.util.Arrays;
// public class SortArrayBuiltIn {
//   public static void main(String[] args) {
//  int[]arr = {1,5,8,9,63,5};
 
//  Arrays.sort(arr);
//  for(int i = 0;i<arr.length;i++){
//     System.out.print(arr[i] + " ");
//  }
// }
// }


 // multiply add indexed elements by 2 and add 10 to even indexed elements

 public class SortArrayBuiltIn {
   public static void main(String[] args) {

int [] arr = {1,5,9,6,3,7,5};
for(int i = 0;i<arr.length;i++){

    if(i%2==0){
        arr[i]+=10;
    }else{
        arr[i]*=2;
    }
    }
        for(int i =0;i<arr.length;i++){
      System.out.println(arr[i] + " ");
}
   }
}