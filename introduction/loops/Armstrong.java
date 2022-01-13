package introduction.loops;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        if(checkArmstrong(num)) {
            System.out.println("Yes the number is armstrong");
        } else {
            System.out.println("No the number is not armstrong.");
        }

    }

    private static int getTotalDigit(int num) {
        int count = 0;

        while(num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    static boolean checkArmstrong(int num) {

        int totalDigits = getTotalDigit(num);

        int temp = num;

        int sum = 0;

        while(temp > 0) {
            int digit = temp % 10;
            temp /= 10;
            int digitPow = (int)(Math.pow(digit, totalDigits));
            sum = sum + digitPow;
        }

        return (sum == num);
    }

    static void printNArmstrong(int n) {



    }

    static void printArmstrongUptoN(int n) {



    }


}
