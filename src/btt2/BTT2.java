package btt2;

import java.util.Scanner;

public class BTT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ho va ten cua ban: ");
        String hoTen = sc.nextLine();
        
        System.out.println("Xin chao sinh vien: " + hoTen);
        System.out.println("Da hoan thanh bai tap BTT2 va push len GitHub thanh cong!");
        
        sc.close();
    }
}