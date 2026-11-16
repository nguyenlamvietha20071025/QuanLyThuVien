package btt6;

import java.util.ArrayList;
import java.util.Scanner;

public class BTT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dsMaSach = new ArrayList<>();
        ArrayList<Double> dsGiaSach = new ArrayList<>();
        ArrayList<Integer> dsSoLuong = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n=== QUAN LY THU VIEN - TUAN 6 ===");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Chon chuc nang (1-8): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String ma = scanner.nextLine();
                    System.out.print("Nhap gia sach: ");
                    double gia = scanner.nextDouble();
                    System.out.print("Nhap so luong: ");
                    int sl = scanner.nextInt();
                    scanner.nextLine();

                    dsMaSach.add(ma);
                    dsGiaSach.add(gia);
                    dsSoLuong.add(sl);
                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("Danh sach sach trống!");
                        break;
                    }
                    System.out.println("\n--- DANH SACH SACH ---");
                    for (int i = 0; i < dsMaSach.size(); i++) {
                        System.out.println((i + 1) + ". Ma: " + dsMaSach.get(i) + " | Gia: " + dsGiaSach.get(i) + " | So luong: " + dsSoLuong.get(i));
                    }
                    break;

                case 3:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("Danh sach sach trống!");
                        break;
                    }
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = scanner.nextLine();
                    boolean timTruy = false;
                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maTim)) {
                            System.out.println("Da tim thay! Vi tri " + (i + 1) + " | Ma: " + dsMaSach.get(i) + " | Gia: " + dsGiaSach.get(i) + " | So luong: " + dsSoLuong.get(i));
                            timTruy = true;
                        }
                    }
                    if (!timTruy) {
                        System.out.println("Khong tim thay sach co ma: " + maTim);
                    }
                    break;

                case 4:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("Danh sach sach trống!");
                        break;
                    }
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = scanner.nextLine();
                    boolean xoaThanhCong = false;
                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maXoa)) {
                            dsMaSach.remove(i);
                            dsGiaSach.remove(i);
                            dsSoLuong.remove(i);
                            System.out.println("Xoa sach thanh cong!");
                            xoaThanhCong = true;
                            break;
                        }
                    }
                    if (!xoaThanhCong) {
                        System.out.println("Khong tim thay ma sach de xoa.");
                    }
                    break;

                case 5:
                    if (dsMaSach.isEmpty()) {
                        System.out.println("Danh sach sach trống!");
                        break;
                    }
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = scanner.nextLine();
                    boolean suaThanhCong = false;
                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maSua)) {
                            System.out.print("Nhap gia moi: ");
                            double giaMoi = scanner.nextDouble();
                            System.out.print("Nhap so luong moi: ");
                            int slMoi = scanner.nextInt();
                            scanner.nextLine();

                            dsGiaSach.set(i, giaMoi);
                            dsSoLuong.set(i, slMoi);
                            System.out.println("Sua thong tin sach thanh cong!");
                            suaThanhCong = true;
                            break;
                        }
                    }
                    if (!suaThanhCong) {
                        System.out.println("Khong tim thay ma sach de sua.");
                    }
                    break;

                case 6:
                    int tongSL = 0;
                    for (int s : dsSoLuong) {
                        tongSL += s;
                    }
                    System.out.println("Tong so luong tat ca cac sach: " + tongSL);
                    break;

                case 7:
                    double tongGT = 0;
                    for (int i = 0; i < dsMaSach.size(); i++) {
                        tongGT += dsGiaSach.get(i) * dsSoLuong.get(i);
                    }
                    System.out.println("Tong gia tri kho sach: " + tongGT);
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai tu 1 den 8.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
