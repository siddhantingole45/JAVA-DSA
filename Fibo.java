package conditionsAndLoops;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int temp;
        System.out.print("Enter the nth no. of the fibonnaci Series: ");
        int n = input.nextInt();
        int count = 3;

        while (count<=n){
            temp = b;
            b = b+a;
            a=temp;
//            do {
//                System.out.println(0);
//                System.out.println(1);
//                count++;
//            } while (count==3);
            count++;
        }
            System.out.println(b);

    }
}
