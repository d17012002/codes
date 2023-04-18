import java.lang.Thread.State;
import java.util.Arrays;
import java.util.Scanner;

// searchiung in arrays
// public class linearsearch {
//     public static void main(String[] args) {
//      int [] nums= {23, 34,3 ,2,15,-1,41};
//      int target=15;
//      int ans=linearSearch(nums, target);
//      System.out.println(ans);   
//     }

//     static int linearSearch(int []arr, int target ){
//         if(arr.length==0){
//             return -1;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             int element = arr[i];
//             if(element ==target){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

// searching in Strings
// public class linearsearch {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter name");
//         String name = sc.nextLine();
//         System.out.println("enter target");
//         char target = sc.next().charAt(0);
//         System.out.println(Search(name, target));
//     }

//     static boolean Search(String str, char target) {
//         if (str.length() == 0) {
//             return false;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             if (target == str.charAt(i)) {
//                 return true;

//             }

//         }
//         return false;
//     }
// }

// searching in range
// public class linearsearch {
//     public static void main(String[] args) {
//      int [] nums= {23, 34,3 ,2,15,-1,41};
//      int target=23;
//      int ans=linearSearch(nums, target);
//      System.out.println(ans);   
//     }

//     static int linearSearch(int []arr, int target ){
//         if(arr.length==0){
//             return -1;
//         }
//         for (int i = 1; i <=4 ; i++) {
//             int element = arr[i];
//             if(element ==target){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

// minimum amd maximun values in arrays
// public class linearsearch {
//     public static void main(String[] args) {
//         int []arr= {1,4,2,15,54,21,34};
//         System.out.println(Min(arr));
//     }
//     static int Min( int[] arr){
//         int ans = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i]<ans) {
//                 ans=arr[i];
//             }

//         }
//         return ans;
//     }
// }

// seraching in 2d arrays
// public class linearsearch {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 { 23, 4, 1 },
//                 { 18, 12, 45, 65 },
//                 { 12, 34, 56, 31 },
//                 { 6, 89 },
//         };
//         int target = 34;
//         int[] ans = Search(arr, target);
//         System.out.println(Arrays.toString(ans));
//     }

//     static int[] Search(int[][] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] == target) {
//                     return new int[] { i, j };
//                 }

//             }
//         }
//         return new int[] { -1, -1 };
//     }
// }


// maximun in 2d array
// public class linearsearch {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 { 23, 4, 1 },
//                 { 18, 12, 45, 65 },
//                 { 12, 34, 56, 31 },
//                 { 6, 89 },
//         };
//         System.out.println(max(arr));
//     }

//     static int max(int[][] arr) {
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] >max) {
//                     max = arr[i][j];
//                 }

//             }
//         }
//         return max;
//     }
// }


//leetcode problem 1295
// public class linearsearch{
//     public static void main(String[] args) {
//         int [] nums={12 , 124,4321, 71,2};
//         System.out.println(findNumbers(nums));
//     }

//     static int findNumbers(int[]nums){
//         int count=0;
//         for(int num: nums){
//             if (even(num)) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     static boolean even(int num){
//         int numberOfDigits= digits(num);
//         if(numberOfDigits%2==0){
//             return true;
//         }
//         return false;
//     }
//     static int digits (int num){
//         if(num<0){
//             num=num*-1;
//         }
//         if(num==0){
//             return 1;
//         }
//         int count=0;
//         while(num>0){
//             count++;
//             num=num/10;
//         }
//         return count;
//     }

// }


// leetcode problem 1672
public class linearsearch{
    public static void main(String[] args) {
        
    }
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum =0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum>ans) {
                ans=sum;
            }
        }
        return ans;
        
    }
}


