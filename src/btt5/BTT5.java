package btt5;

import java.util.Scanner;

public class BTT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String[] maSach = null;
        double[] giaSach = null;
        int[] soLuong = null;

        int choice;
        do {
            System.out.println("\n=== QUAN LY THU VIEN - TUAN 5 ===");
            System.out.println("1. Nhap n sach");
            System.out.println("2. Hien thi danh sach va tinh tong so luong, tong gia tri");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong sach n: ");
                    n = scanner.nextInt();
                    scanner.nextLine();
                    
                    maSach = new String[n];
                    giaSach = new double[n];
                    soLuong = new int[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("--- Nhap thong tin sach thu " + (i + 1) + " ---");
                        System.out.print("Nhap ma sach: ");
                        maSach[i] = scanner.nextLine();
                        System.out.print("Nhap gia sach: ");
                        giaSach[i] = scanner.nextDouble();
                        System.out.print("Nhap so luong: ");
                        soLuong[i] = scanner.nextInt();
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Chua co du lieu sach!");
                        break;
                    }
                    double tongGiaTri = 0;
                    int tongSoLuong = 0;

                    System.out.println("\n--- DANH SACH SACH ---");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Ma: " + maSach[i] + " | Gia: " + giaSach[i] + " | So luong: " + soLuong[i]);
                        tongSoLuong += soLuong[i];
                        tongGiaTri += giaSach[i] * soLuong[i];
                    }
                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri kho sach: " + tongGiaTri);
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Chua co du lieu sach!");
                        break;
                    }
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = scanner.nextLine();
                    boolean thay = false;

                    for (int i = 0; i < n; i++) {
                        if (maSach[i].equalsIgnoreCase(maTim)) {
                            System.out.println("Da tim thay! Ma: " + maSach[i] + " | Gia: " + giaSach[i] + " | So luong: " + soLuong[i]);
                            thay = true;
                            break;
                        }
                    }
                    if (!thay) {
                        System.out.println("Khong tim thay sach co ma: " + maTim);
                    }
                    break;

                case 4:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Chuc nang khong hop le, vui long chon lai.");
            }
        } while (choice != 4);

        scanner.close();
    }
}