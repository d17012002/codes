import java.util.*;

public class Loops {
    public static void main(String[] args) {
        int num = 11037;
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);

    }

    // int n = 11037;
    // int count = 0;
    // while (n > 0) {
    // int rem = n % 10;
    // if (rem == 1) {
    // count++;
    // }
    // n = n / 10;

    // }
    // System.out.println(count);
    // }

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int a = 0;
    // int b = 1;
    // int count = 2;
    // while (count <= n) {
    // int temp = b;
    // b = b + a;
    // a = temp;
    // count++;

    // }
    // System.out.println(b);
    // }

    // for(int counter = 0; counter < 100; counter = counter + 1){
    // System.out.println("Ipsi ki Tipsi");
    // }

    // for (int counter=0; counter <11 ;counter++){
    // System.out.println(counter+" ");
    // }

    // for(int i=0; i<11;i++){
    // System.out.println(i+" ");
    // }

    // int i = 0;
    // while (i < 11) {
    // System.out.println(i);
    // i++;
    // }

    // int i = 0;
    // do{System.out.println(i);
    // i++;
    // }while(i<11);

    // print sum of first n natural no.
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int sum =0 ;
    // for (int i=0; i<=n; i++){
    // sum=sum+i;}
    // System.out.println(sum);

    // table of a number
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // for (int i=1;i<=11;i++){
    // System.out.println(n*i);
    // // }
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // for (int i=1; i<= 10; i++){
    // System.out.println(n+" x "+i+" = "+n*i);
    // }

    // all even n number
    // int n = 25;
    // for (int i = 1; i <= n; i++) {
    // if (i % 2 == 0) {
    // System.out.println(i);

    // }

    // }
    // Scanner sc = new Scanner(System.in);
    // int input;

    // do {
    // int marks = sc.nextInt();
    // if(marks >= 90 && marks <= 100) {
    // System.out.println("This is Good");
    // } else if(marks >= 60 && marks <= 89) {
    // System.out.println("This is also Good");
    // } else if(marks >= 0 && marks <= 59) {
    // System.out.println("This is Good as well");
    // } else {
    // System.out.println("Invalid");
    // }

    // System.out.println("Want to continue ? (yes(1) or no(0))");
    // input = sc.nextInt();

    // } while(input == 1);

    // }

}
