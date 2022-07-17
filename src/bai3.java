//Nhập n hãy tính tổng các ước của n(bao gồm cả 1 và n)

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("nhap n: ");
        n = scanner.nextInt();

        int tongUoc = 1 + n;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n%i == 0)
                tongUoc += i;
        }

        System.out.println("tong cac uoc cua n la: " + tongUoc);
    }
}