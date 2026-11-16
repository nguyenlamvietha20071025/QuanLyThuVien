package btt4;

import java.util.Scanner;

public class BTT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CHUONG TRINH QUAN LY THU VIEN - TUAN 4 ===");
        System.out.print("Nhap gia sach: ");
        double gia = scanner.nextDouble();

        System.out.print("Nhap so luong ton kho: ");
        int soLuong = scanner.nextInt();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = scanner.nextInt();

        boolean hopLe = (gia > 0) && (soLuong >= 0) && (namXuatBan > 1900 && namXuatBan <= 2026);
        
        if (!hopLe) {
            System.out.println("Thong tin sach khong hop le!");
            return;
        }
        System.out.println("Thong tin sach hop le.");

        System.out.print("Phan loai gia: ");
        if (gia < 50000) {
            System.out.println("Sach gia thap");
        } else if (gia <= 100000) {
            System.out.println("Sach gia trung binh");
        } else if (gia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }

        System.out.print("Phan loai ton kho: ");
        if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong <= 5) {
            System.out.println("Sap het");
        } else if (soLuong <= 20) {
            System.out.println("Con it");
        } else {
            System.out.println("Con nhieu");
        }

        System.out.println("\nChon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon (1-4): ");
        int loaiSach = scanner.nextInt();

        switch (loaiSach) {
            case 1:
                System.out.println("Loai: Sach giao khoa");
                break;
            case 2:
                System.out.println("Loai: Sach tham khao");
                break;
            case 3:
                System.out.println("Loai: Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Loai: Sach khac");
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }
        
        scanner.close();
    }
}