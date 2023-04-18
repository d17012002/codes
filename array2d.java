import java.util.Arrays;
import java.util.Scanner;

// public class array2d {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         //input of array
//         /*here 
//         i= row; j=column*/
//         int arr[][] = new int[3][3];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 arr[i][j]= sc.nextInt();
                
//             }  
//         }
//         //output by enhanced for loop
//         for(int[]a:arr){
//             System.out.println(Arrays.toString(a));
//         }
//         //output by normal for loop
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(Arrays.toString(arr[i]));
            
//         }
//     }
// }



public class array2d{
    public static void main(String[] args) {
        int [][]arr={
            {1,2,3,4},
            {5,6,7},
            {8,9,10},
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}